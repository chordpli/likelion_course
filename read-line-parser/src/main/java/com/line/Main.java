package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "P:\\TechIt\\교재\\week4\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        for (Hospital hospital : hospitals) {
            System.out.println(hospital.getId());
        }

    }
}
