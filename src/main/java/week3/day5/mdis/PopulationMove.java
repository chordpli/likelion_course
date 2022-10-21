package week3.day5.mdis;

import java.util.HashMap;
import java.util.Map;

public class PopulationMove {

    private int fromSido;
    private int toSido;
    private String fromSidoKorean;
    private String toSidoKorean;
    private Map<Integer, String> sidoMap = new HashMap<>();

    // constructor 추가 fromSido, toSido를 받아서 멤버 변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setSidoMap() {
        /* 11 : 서울, 21 : 부산, 22 : 대구
         * 23 : 인천, 24: 광주, 25: 대전, 26: 울산
         * 29 : 세종, 31: 경기도 32: 강원도, 33: 충청북도
         * 34 : 충청남도, 35: 전라북도, 36 :전라남도
         * 37 : 경상북도, 38: 경상남도, 39:제주도
         * */
        sidoMap.put(11, "서울");
        sidoMap.put(26, "부산");
        sidoMap.put(27, "대구");
        sidoMap.put(28, "인천");
        sidoMap.put(29, "광주");
        sidoMap.put(30, "대전");
        sidoMap.put(31, "울산");
        sidoMap.put(36, "세종");
        sidoMap.put(41, "경기도");
        sidoMap.put(42, "강원도");
        sidoMap.put(43, "충청북도");
        sidoMap.put(44, "충청남도");
        sidoMap.put(45, "전라북도");
        sidoMap.put(46, "전라남도");
        sidoMap.put(47, "경상북도");
        sidoMap.put(48, "경상남도");
        sidoMap.put(50, "제주도");
    }

    public String getFromSidoKorean() {
        return fromSidoKorean;
    }

    public String getToSidoKorean() {
        return toSidoKorean;
    }
}
