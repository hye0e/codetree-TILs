import java.io.*;

public class Main {
    public static class User {
        String id;
        String level;

        public User(String id, String level) {
            this.id = id;
            this.level = level;
        }

        @Override
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("user ").append(this.id).append(" ");
            sb.append("lv ").append(this.level).append(" ");

            return sb.toString();
        }
    }
    public static void main(String[] args) throws Exception 
    {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        User user = new User("codetree", "10");
        System.out.println(user.toString());
        User user2 = new User(input[0], input[1]);
        System.out.println(user2.toString());
    }
}