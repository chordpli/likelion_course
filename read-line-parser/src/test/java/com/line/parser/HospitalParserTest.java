package com.line.parser;

import com.line.domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {

    HospitalParser hospitalParser = new HospitalParser();
    String line1 = "\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",\"11\",\"126.88412249700781\",\"37.4803938036867\",\"2022-04-07 14:55:00.0\"";
    String line4 = "\"A1118077\",\"서울특별시 중구 한강대로 416 지하1층 (남대문로5가 서울스퀘어빌딩)\",\"N\",\"치과의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"법정 공휴일 : 외래 진료 휴진 설날 및 추석 연휴 : 외래 진료 휴진 인공신장실은 정상 진료\",\"발 발목 무릎 어깨 상지  척추 특화 진료\",\"수도권 지하철 2호선 서울대입구역 4번 출구 10M\",\"연세건치과의원\",\"02-755-0882\",\"070-4665-9119\",\"1800\",\"1800\",\"1800\",\"1800\",\"1800\",\"1400\",\"1300\",\"1300\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"0900\",\"0900\",\"046\",\"37\",\"126.97375281464887\",\"37.5555048939659\",\"2022-09-07 14:55:29.0\"";
    private void assertHospital(Hospital hospital, String eId, String eAddress, String eDistrict, String eCategory, int eEmergencyRoom, String eName, String eSubdivision) {
        Assertions.assertEquals(eId, hospital.getId());
        //주소가 잘 파싱 되는지 테스트 추가
        Assertions.assertEquals(eAddress, hospital.getAddress());
        //District
        Assertions.assertEquals(eDistrict, hospital.getDistrict());
        //Category
        Assertions.assertEquals(eCategory, hospital.getCategory());
        //Emergency Room
        Assertions.assertEquals(eEmergencyRoom, hospital.getEmergencyRoom());
        //Name
        Assertions.assertEquals(eName, hospital.getName());
        // Subdivision
        Assertions.assertEquals(eSubdivision, hospital.getSubdivision());
    }

    @Test
    @DisplayName("ID 파싱 확인")
    void idParsing() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse(line1);
        Assertions.assertEquals("A1120837", hospital.getId());

        String address = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";
        Assertions.assertEquals(address, hospital.getAddress());

        //District
        Assertions.assertEquals("서울특별시 금천구", hospital.getDistrict());
        //Category
        Assertions.assertEquals("C", hospital.getCategory());
        //Emergency Room
        Assertions.assertEquals(2, hospital.getEmergencyRoom());
        //Name
        Assertions.assertEquals("가산기대찬의원", hospital.getName());
        //Name
        Assertions.assertEquals("", hospital.getSubdivision());
    }

    @Test
    @DisplayName("ID 파싱")
    void hospitalParsing() {
        HospitalParser hospitalParser = new HospitalParser();
        Hospital hospital = hospitalParser.parse((this.line1));
        String address = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)";

        assertHospital(hospitalParser.parse(this.line1), "A1120837", "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)", "서울특별시 금천구",
                "C", 2, "가산기대찬의원", "");
    }

    @Test
    @DisplayName("insert 쿼리 테스트")
    void makeSqlQueryTest() {

        Hospital hos = hospitalParser.parse(this.line1);
        String sql = "INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)\n" +
                "VALUES\n" +
                "('A1120837', '서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)'," +
                " '서울특별시 금천구', 'C', 2, '가산기대찬의원', ''),\n";
        Assertions.assertEquals(sql, hos.getSQL()+hos.getTupleString());
    }

    @Test
    @DisplayName("두번째 SqlInsertQuery만드는 method")
    void testMakeSqlInsertQuery2(){
        Hospital hospital = hospitalParser.parse(line4);
        String sql = "INSERT INTO `likelion-db`.`seoul_hospital`(`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)\n" +
                "VALUES\n" +
                "('A1118077', '서울특별시 중구 한강대로 416 지하1층 (남대문로5가 서울스퀘어빌딩)'," +
                " '서울특별시 중구', 'N', 2, '연세건치과의원', '치과');";
        Assertions.assertEquals(hospital.getSqlInsertQuery2(), sql);
    }
}