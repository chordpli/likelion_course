package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        String filename = "P:\\TechIt\\교재\\week4\\seoul_hospital_info.csv";

        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        String newFileName = "./insert.sql";
        List<String> output = new ArrayList<>();

        hospitalLineReader.createFile(newFileName);
        for (Hospital hospital : hospitals) {
            String s = "INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                    "(`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)\n" +
                    "VALUES\n" +
                    "('" + hospital.getId() + "', '" + hospital.getAddress() + "', " +
                    "'" + hospital.getDistrict() + "', '" + hospital.getCategory() + "', " + hospital.getEmergencyRoom() + ", '" + hospital.getName() + "', '" + hospital.getSubdivision() + "'); \n";
            output.add(s);
            System.out.println(s);
        }
        hospitalLineReader.write(output, newFileName);
    }
}
