import java.util.*; 
import java.io.*; 
public class Main {
    static int N, M;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(0);

        int answer = 0;

        for (int i = 1; i < N; i++) {
            if (visited[i]) answer++;
        }

        System.out.println(answer);
    }

    public static void dfs(int vertex) {
        for (int currV = 0; currV < N; currV++) {
            if (graph[vertex][currV] == 1 && !visited[currV]) {
                
                visited[currV] = true;
                dfs(currV);
            }
        }
    }
}