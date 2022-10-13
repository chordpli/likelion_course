package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        Hospital hospital = new Hospital();
        String filename = "P:\\TechIt\\교재\\week4\\seoul_hospital_info.csv";

        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        String newFileName = "./insert.sql";


        hospitalLineReader.createFile(newFileName);

        List<String> output = new ArrayList<>();
        output.add(hospital.getSQL());

        for (Hospital h : hospitals) {
            String sql = h.getTupleString();
            output.add(sql);
        }

        hospitalLineReader.write(output, newFileName);
    }
}
