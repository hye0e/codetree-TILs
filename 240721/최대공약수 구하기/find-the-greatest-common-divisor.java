import java.util.*;
import java.io.*;

public class Main {
    public static void findGcd(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        findGcd(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    }
}