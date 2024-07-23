import java.io.*;

public class Main {
    static int cnt = 0;
    public static void recursive(int N) {
        if (N == 1) return;
        if (N % 2 == 0) {
            recursive(N / 2);
            cnt++;
        } else {
            recursive(N / 3);
            cnt++;
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        recursive(N);
        System.out.println(cnt);
    }
}