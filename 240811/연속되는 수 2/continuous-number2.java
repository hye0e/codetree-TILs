import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) cnt++;
            if (cnt > max) max = cnt;
        }

        System.out.println(cnt);
    }
}