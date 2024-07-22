import java.io.*;

public class Main {
    static int k = 1;
    public static void gcd(int n, int m) {
        
        for (int i = 2; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                k *= i;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        gcd(n, m);
        System.out.println(k);
    }
}