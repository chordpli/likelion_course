package com.line;

import com.line.domain.Hospital;
import com.line.parser.HospitalParser;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser());
        Hospital hospital = new Hospital();
        String filename = "P:\\TechIt\\교재\\week4\\seoul_hospital_info.csv";

        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        System.out.println(hospitals.size());
        String newFileName = "./insert.sql";


        hospitalLineReader.createFile(newFileName);

        //List<String> output = new ArrayList<>();
        //output.add(hospital.getSQL());

        Connection c = DriverManager.getConnection("", "", "");
        PreparedStatement ps = c.prepareStatement("INSERT INTO `likelion-db`.`seoul_hospital` (`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)" +
                "VALUES (?, ?, ?, ?, ?,?, ?)");

        for (Hospital h : hospitals) {
            ps.setString(1, h.getId());
            ps.setString(2, h.getAddress());
            ps.setString(3, h.getDistrict());
            ps.setString(4, h.getCategory());
            ps.setInt(5, h.getEmergencyRoom());
            ps.setString(6, h.getName());
            ps.setString(7, h.getSubdivision());
            ps.executeUpdate();
        }
//        for (Hospital h : hospitals) {
//            String sql = h.getTupleString();
//            output.add(sql);
//        }

       // hospitalLineReader.write(output, newFileName);



    }
}
