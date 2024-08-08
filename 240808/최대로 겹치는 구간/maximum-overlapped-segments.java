import java.util.*;
import java.io.*;

public class Main {
    static int offset = 100;
    static int max = Integer.MIN_VALUE;
    static int cnt = 0;
    static int[] block = new int[201];

    public static void put(int x1, int x2) {
        for (int i = x1; i < x2; i++) {
            block[i] += 1;       
        }
        
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]) + offset;
            int x2 = Integer.parseInt(input[1]) + offset;
            put(x1, x2);
        }

        for (int i = 0; i < block.length; i++) {
            if (block[i] > max) max = block[i];
        }

        System.out.println(max);
    }
}