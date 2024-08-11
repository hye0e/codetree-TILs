import java.io.*;
import java.util.*;
public class Main {
    static int offset = 100;
    static int[][] graph = new int[2 * 100 + 1][2 * 100 + 1]; 
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int now = 1; // 1: 빨간색 2: 파란색
    
        for (int k = 0; k < N; k++) {
            if (k != 0 && now == 1) now = 2;

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x1 = Integer.parseInt(st.nextToken()) + offset;
            int y1 = Integer.parseInt(st.nextToken()) + offset;
            int x2 = Integer.parseInt(st.nextToken()) + offset;
            int y2 = Integer.parseInt(st.nextToken()) + offset;
            for (int i = x1; i < x2; i++) {
                for (int j = y1; j < y2; j++) {
                    graph[i][j] = now;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 2) cnt++;
            }
        }

        System.out.println(cnt);
    }   
}