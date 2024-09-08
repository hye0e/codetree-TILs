import java.util.*;
import java.io.*;

public class Main {
    // 총 6개 경우의 수
    static int[][][] shapes = new int[][][]{
        // block1
        {
            {1, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        },
        {
            {1, 0, 0},
            {1, 1, 0},
            {0, 0, 0}
        },
        {
            {0, 1, 0},
            {1, 1, 0},
            {0, 0, 0}
        },
        {
            {1, 1, 0},
            {0, 1, 0},
            {0, 0, 0}
        },
        // block2
        {
            {1, 1, 1},
            {0, 0, 0},
            {0, 0, 0}
        },
        {
            {1, 0, 0},
            {1, 0, 0},
            {1, 0, 0}
        },
    };
    static int[][] graph;
    static int answer = 0;
    static int n, m;

    public static int getMaxSum(int x, int y) {
        int maxSum = 0;

        // 총 6개
        for (int i = 0; i < 6; i++) {
            int sum = 0;
            boolean isPossible = true;
            for (int dx = 0; dx < 3; dx++){
                for (int dy = 0; dy < 3; dy++) {
                    if (shapes[i][dx][dy] == 0) continue;
                    if (x + dx >= n || y + dy >= m) isPossible = false;
                    else sum += graph[x + dx][y + dy];
                }
            }

            if (isPossible) maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer, getMaxSum(i, j));
            }
        }

        System.out.println(answer);
    }
}