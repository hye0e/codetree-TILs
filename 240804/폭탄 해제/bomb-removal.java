import java.io.*;

public class Main {
    public static class Bomb {
        String code;
        String color;
        String second;

        public Bomb(String code, String color, String second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }

        @Override 
        public String toString() {
            StringBuffer sb = new StringBuffer();
            sb.append("code : ").append(this.code).append("\n");
            sb.append("color : ").append(this.color).append("\n");
            sb.append("second : ").append(this.second);

            return sb.toString();
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        Bomb bomb = new Bomb(input[0], input[1], input[2]);
        System.out.println(bomb.toString());
    }
}