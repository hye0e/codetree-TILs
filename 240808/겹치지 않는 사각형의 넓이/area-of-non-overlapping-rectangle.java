import java.io.*;

public class Main {
    static int MAX_K = 1000;
    static int[][] graph = new int[MAX_K * 2 + 1][MAX_K * 2 + 1];
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");
        String[] inputM = br.readLine().split(" ");

        int Ax1 = Integer.parseInt(inputA[0]) + MAX_K;
        int Ay1 = Integer.parseInt(inputA[1])+ MAX_K;
        int Ax2 = Integer.parseInt(inputA[2])+ MAX_K;
        int Ay2 = Integer.parseInt(inputA[3])+ MAX_K;

        int Bx1 = Integer.parseInt(inputB[0])+ MAX_K;
        int By1 = Integer.parseInt(inputB[1])+ MAX_K;
        int Bx2 = Integer.parseInt(inputB[2])+ MAX_K;
        int By2 = Integer.parseInt(inputB[3])+ MAX_K;

        int Mx1 = Integer.parseInt(inputM[0])+ MAX_K;
        int My1 = Integer.parseInt(inputM[1])+ MAX_K;
        int Mx2 = Integer.parseInt(inputM[2])+ MAX_K;
        int My2 = Integer.parseInt(inputM[3])+ MAX_K;


        for (int i = Ax1; i < Ax2; i++) {
            for (int j = Ay1; j < Ay2; j++) {
                graph[i][j] = 1;
            }
        }

        for (int i = Bx1; i < Bx2; i++) {
            for (int j = By1; j < By2; j++) {
                graph[i][j] = 1;
            }
        }

        for (int i = Mx1; i < Mx2; i++) {
            for (int j = My1; j < My2; j++) {
                graph[i][j] = 2;
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