import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int start = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (start == 10) start = 1;
                sb.append(start + " ");
                start++;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}