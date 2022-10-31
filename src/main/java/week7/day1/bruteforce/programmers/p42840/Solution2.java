package week7.day1.bruteforce.programmers.p42840;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
    class Student {
        private int no;
        private int[] answer;
        private int score;

        public Student(int no, int[] answer) {
            this.no = no;
            this.answer = answer;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int[] getAnswer() {
            return answer;
        }

        public void setAnswer(int[] answer) {
            this.answer = answer;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }

    public List<Integer> solution(int[] answers) {
        List<Student> students = studentListInit();
        returnScore(answers, students);
        return returnResult(students);
    }

    public void returnScore(int[] answers, List<Student> students) {
        int[] score = new int[students.size()];

        for (Student student : students) {
            int count = 0;
            for (int j = 0; j < answers.length; j++) {
                int getAnswerLength = j % student.getAnswer().length;
                if (answers[j] == student.getAnswer()[getAnswerLength]) {
                    count++;
                }
            }
            student.setScore(count);
        }
    }

    public List<Student> studentListInit() {
        List<Student> studentList = new ArrayList<>();
        Student s01 = new Student(1, new int[]{1, 2, 3, 4, 5});
        Student s02 = new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        Student s03 = new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

        studentList.add(s01);
        studentList.add(s02);
        studentList.add(s03);

        return studentList;
    }

    private List<Integer> returnResult(List<Student> students) {
        List<Integer> answer = new ArrayList<>();
        students.sort(Comparator.comparing(Student::getScore).reversed());
        for (Student s : students) {
            if (answer.size() == 0) {
                answer.add(s.no);
            } else if (s.getScore() == students.get(0).getScore()) {
                answer.add(s.no);
            } else {
                break;
            }
        }
        return answer;
    }
}