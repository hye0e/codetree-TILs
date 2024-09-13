import java.util.*;
import java.io.*;

public class Main {
    static int n, k;
    static int[][] graph;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static class Node {
        int x;
        int y;
        int cnt;
        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
               graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            answer += bfs(x - 1, y - 1);
        }

        System.out.println(answer);
    }

    public static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y, 0));
        boolean[][] visited = new boolean[n][n];
        int result = 1;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                    if (visited[nx][ny]) continue;
                    if (graph[nx][ny] == 1) continue;
                    result = node.cnt;
                    visited[nx][ny] = true;
                    queue.add(new Node(nx, ny, node.cnt + 1));
                    
                }
            }
        }
        return result;
    }
}