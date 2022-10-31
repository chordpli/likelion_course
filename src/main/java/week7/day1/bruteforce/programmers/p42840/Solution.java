package week7.day1.bruteforce.programmers.p42840;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    class Student {
        int no;
        int score;

        public Student(int no, int score) {
            this.no = no;
            this.score = score;
        }

        public Student() {
        }

        public int getNo() {
            return no;
        }

        public int getScore() {
            return score;
        }
    }

    public List<Integer> solution(int[] answers) {
        int[] firstGaveUp = {1, 2, 3, 4, 5};
        int[] secondGaveUp = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdGaveUp = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstGaveUpScore = returnScore(answers, firstGaveUp);
        int secondGaveUpScore = returnScore(answers, secondGaveUp);
        int thirdGaveUpScore = returnScore(answers, thirdGaveUp);

        List<Student> students = listInit(firstGaveUpScore, secondGaveUpScore, thirdGaveUpScore);
        return returnResult(students);
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

    public int returnScore(int[] answer, int[] gaveUp) {
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == gaveUp[i % gaveUp.length]) {
                count++;
            }
        }
        return count;
    }

    public List<Student> listInit(int first, int second, int third) {
        List<Student> students = new ArrayList<>();
        Student s01 = new Student(1, first);
        Student s02 = new Student(2, second);
        Student s03 = new Student(3, third);

        students.add(s01);
        students.add(s02);
        students.add(s03);
        return students;
    }
}
