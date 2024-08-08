import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[200][200];
        for (int k = 0; k < N; k++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = x1 + 8;
            int y2 = y1 + 8;
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    graph[i][j] = 1;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}