package week3.day3.collection.list;

import java.util.Arrays;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        // for each (자동완성 iter)
        for(String student : students){
            System.out.println(student);
        }

        // list에 들어있는 element 갯수 세기.
        System.out.println(students.size());

        for(Student student : studentObjs){
            System.out.println(student);
        }

    }

}
