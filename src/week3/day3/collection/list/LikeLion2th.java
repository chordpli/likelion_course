package week3.day3.collection.list;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> student = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.student = names.names();
        this.studentObjs = names.studentOjbs();
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return하는 method
    public List<String> getStudentList() {
        return this.student;
    }

    public List<Student> getStudentObjs() {
        return this.studentObjs;
    }
}
