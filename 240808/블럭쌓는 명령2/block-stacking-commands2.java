import java.io.*;
import java.util.*;

public class Main {
    static int[] block;
    static int max = Integer.MIN_VALUE;
    public static void put(int a, int b) {
        for (int i = a; i <= b; i++) {
            block[i] += 1;
            if (max < block[i]) max = block[i];
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        block = new int[N + 1];
        for (int i = 0; i < K; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            put(a, b);
        }

        System.out.println(max);
    }
}