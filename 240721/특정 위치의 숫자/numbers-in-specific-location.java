import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");

        int sum = 0;
        sum += Integer.parseInt(arr[2]);
        sum += Integer.parseInt(arr[4]);
        sum += Integer.parseInt(arr[9]);

        System.out.println(sum);
    }
}