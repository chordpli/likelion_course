package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital> {

    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(removeDQM(splitted[0]), removeDQM(splitted[1]), getDistrict(splitted[1]), removeDQM(splitted[2])
                , getNumber(splitted[6]), removeDQM(splitted[10]), getSubdivision(removeDQM(splitted[10])));
    }

    public String removeDQM(String str) {
        return str.replaceAll("\"", "");
    }

    public String getDistrict(String str) {
        if(str.contains("구로구")){
            return "구로구";
        }else{
            return removeDQM(str.substring(0, str.indexOf("구") + 1));
        }
    }

    public String getSubdivision(String str) {
        String subdivision = "";

        if (str.contains("내과")) {
            subdivision = "내과";
        } else if (str.contains("외과")) {
            subdivision = "외과";
        } else if (str.contains("소아과")) {
            subdivision = "소아과";
        } else if (str.contains("피부과")) {
            subdivision = "피부과";
        } else if (str.contains("성형외과")) {
            subdivision = "성형외과";
        } else if (str.contains("정형외과")) {
            subdivision = "정형외과";
        } else if (str.contains("한의원")) {
            subdivision = "한의원";
        } else if (str.contains("치과")) {
            subdivision = "치과";
        } else if (str.contains("대학")) {
            subdivision = "대학병원";
        } else if (str.contains("한방")) {
            subdivision = "한방병원";
        }else if (str.contains("비뇨")) {
            subdivision = "비뇨기과";
        }else if (str.contains("안과")) {
            subdivision = "안과";
        }else if (str.contains("산부인과")) {
            subdivision = "산부인과";
        }else if (str.contains("가정")) {
            subdivision = "가정의학과";
        }

        return subdivision;
    }

    public int getNumber(String str) {
        return Integer.parseInt(removeDQM(str));
    }
}