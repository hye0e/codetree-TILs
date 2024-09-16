import java.util.*;
import java.io.*;

public class Main {
    static int R,C;
    static String[][] graph;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int answer = 0; 
        graph = new String[R][C];
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < R; j++) {
                graph[i][j] = st.nextToken();
            }
        }

        for (int i = 1; i < R - 2; i++) {
            for (int j = 1; j < C - 2; j++) {
                if (graph[i][j].equals(graph[i + 1][j + 1])) continue;
                answer++;
            }
        }
        System.out.println(answer - 1);
    }
}