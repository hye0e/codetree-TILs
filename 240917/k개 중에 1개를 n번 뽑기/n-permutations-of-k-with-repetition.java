import java.util.*;
import java.io.*;
public class Main {
    static int[] selected;
    static int K, N;
    public static void dfs(int depth) {
        if (depth == N) {
            for (int i = 0; i < selected.length; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();

            return;
        }

        for (int i = 1; i <= K; i++) {
            selected[depth] = i;
            dfs(depth + 1);
            selected[depth] = 0;
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        selected = new int[N];
        dfs(0);
    }
}