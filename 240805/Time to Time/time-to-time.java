import java.io.*;

public class Main {
    static int HOUR = 60;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int total1 = Integer.parseInt(input[0]) * HOUR + Integer.parseInt(input[1]);
        int total2 = Integer.parseInt(input[2]) * HOUR + Integer.parseInt(input[3]);

        System.out.println(total2 - total1);
    }
}