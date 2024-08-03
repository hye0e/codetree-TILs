import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        StringBuffer sb = new StringBuffer();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(num[i]);
            Arrays.sort(numArr);

            if (i % 2 == 0) {
                sb.append(numArr[i / 2]).append(" ");
            }
        }
        System.out.println(sb);
    }
}