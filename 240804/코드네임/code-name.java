import java.io.*;
import java.util.*;

public class Main {
    public static class Student implements Comparable<Student> {
        String id;
        int score;

        public Student(String id, int score) {
            this.id = id;
            this.score = score;
        }

        public int getScore() {
            return this.score;
        }

        @Override
        public int compareTo(Student o1) {
            return o1.getScore() - this.score;
        }

        @Override 
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append(this.id).append(" ").append(this.score);

            return sb.toString();
        }
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Student> studentList = new ArrayList();

        for (int i = 0; i < 5; i++) {
            String[] input = br.readLine().split(" ");
            Student student = new Student(input[0], Integer.parseInt(input[1]));
            studentList.add(student);
        }

        Collections.sort(studentList);

        System.out.println(studentList.get(4).toString());
    }
}