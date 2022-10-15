package com.line.domain;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String id;          // [0]
    private String address;     // [1]
    private String district;    // [1] 수정
    private String category;    // [2]
    private int emergencyRoom;  // [6]
    private String name;        // [10]
    private String subdivision; // [10] 수정

    public Hospital() {
    }

    public Hospital(String id, String address, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id.replaceAll("\"","");
        this.address = address.replaceAll("\"","");
        this.category = category.replaceAll("\"","");
        this.emergencyRoom = emergencyRoom;
        this.name = name.replaceAll("\"","");
        this.subdivision = subdivision.replaceAll("\"","");
        this.setDistrict(this.address);
    }

    public Hospital(String s) {
    }

    public void setDistrict(String address) {
        String[] splitted = this.address.split(" ");
        this.district = String.format("%s %s", splitted[0], splitted[1]);
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public String getSQL() {
        String sql = "INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)\n" +
                "VALUES\n";
        return sql;
    }

    public String getTupleString() {
        String sql = "('" + this.getId() + "', '" + this.getAddress() + "', " +
                "'" + this.getDistrict() + "', '" + this.getCategory() + "', " + this.getEmergencyRoom() + ", '" + this.getName() + "', '" + this.getSubdivision() + "'),\n";
        return sql;
    }

    public String getSqlInsertQuery2() {
        String sql = String.format("INSERT INTO `likelion-db`.`seoul_hospital`(`id`, `address`, `district`, `category`, `emergency_room`, `name`, `subdivision`)\n" +
                        "VALUES\n" +
                        "(\'%s\', \'%s\', \'%s\', \'%s\', %d, \'%s\', \'%s\');",
                this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subdivision);
        return sql;
    }
}
