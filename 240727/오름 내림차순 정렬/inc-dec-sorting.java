import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] newNumArr = new int[N];
        for (int i = 0; i < N; i++) {
            newNumArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(newNumArr);
        for (int i = 0; i < N; i++) {
            sb.append(newNumArr[i]).append(" ");
        }
        sb.append("\n");
        for (int i = N - 1; i >= 0; i--) {
            sb.append(newNumArr[i]).append(" ");
        }
        sb.append("\n");
        System.out.println(sb);

    }
}