import java.io.*;
import java.util.*;

public class Main {
    // 현재방향
    static int dir;
    static int[][] graph;
    public static int[] dx = new int[]{0, 1, -1,  0};
    public static int[] dy = new int[]{1, 0,  0, -1};
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()) - 1;
        int c = Integer.parseInt(st.nextToken()) - 1;
        String d = st.nextToken();

        graph = new int[n][n];
        graph[r][c] = 1;
    

        if (d.equals("U")) {
            dir = 2;
        } else if (d.equals("D")) {
            dir = 1;
        } else if (d.equals("R")) {
            dir = 0;
        } else { 
            dir = 3;
        }

        int x = r;
        int y = c;
        for (int i = 0; i < t; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                x = nx; y = ny;
            } else {
                dir = 3 - dir;
            }
        }

        System.out.println((x + 1) + " " + (y + 1));

    }
}