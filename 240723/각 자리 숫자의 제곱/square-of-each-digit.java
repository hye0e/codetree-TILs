import java.io.*;

public class Main {
    public static int recursive(int n) {
        if (n < 10) return n * n;
        int digit = n % 10;
        return recursive(n / 10) + digit * digit;
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(recursive(N));
    }
}