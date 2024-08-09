import java.io.*;
import java.util.*;

public class Main {
    static int offset = 1000;
    static int[][] graph = new int[2001][2001];
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first_x1 = Integer.parseInt(st.nextToken()) + offset;
        int first_y1 = Integer.parseInt(st.nextToken()) + offset;
        int first_x2 = Integer.parseInt(st.nextToken()) + offset;
        int first_y2 = Integer.parseInt(st.nextToken()) + offset;

        st = new StringTokenizer(br.readLine(), " ");
        int second_x1 = Integer.parseInt(st.nextToken()) + offset;
        int second_y1 = Integer.parseInt(st.nextToken()) + offset;
        int second_x2 = Integer.parseInt(st.nextToken()) + offset;
        int second_y2 = Integer.parseInt(st.nextToken()) + offset;

        for (int i = first_x1; i < first_x2; i++) {
            for (int j = first_y1; j < first_y2; j++) {
                graph[i][j] = 1;
            }
        }

        for (int i = second_x1; i < second_x2; i++) {
            for (int j = second_y1; j < second_y2; j++) {
                if (graph[i][j] == 1) graph[i][j] = 0;
            }
        }

        // y의 최대 갯수
        int x = 0; 
        int y = 0;

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1) {
                    if(!xList.contains(i)) xList.add(i);
                    if(!yList.contains(j)) yList.add(j);
                }
            
            }
        }

        System.out.println(xList.size() * yList.size());
    }
}