import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));    

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer((br.readLine()));
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int start_x = 0;
        int start_y = 0;
        int end_x = n - 1;
        int end_y = m - 1;

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start_x, start_y));
        visited[start_x][start_y] = true;

        boolean exitFlag = false;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (visited[nx][ny]) continue;
                    if (graph[nx][ny] == 0) continue;
                    if (nx == end_x && ny == end_y) exitFlag = true;
                    visited[nx][ny] = true;
                    queue.add(new Node(nx, ny));
                }
            }
        }

        if (exitFlag) System.out.println(1);
        else System.out.println(0);
    }
}