import java.util.*;
import java.io.*;
public class Main {
    static int n, t;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][n];
        int[][] new_grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (t-- > 0) {
            // int temp = grid[0][0];
            int temp2 = grid[n - 1][n - 1];

            for(int i = n - 1; i >= 1; i--) { // 2, 1
                for (int j = n - 1; j >= 1; j--) { // 2, 1
                    grid[i][j] = grid[i][j - 1];

                }  
                grid[i][0] = grid[i - 1][n - 1];              
            }

            for(int i = n - 1; i >= 1; i--) {
                grid[0][i] = grid[0][i - 1];
            }

            grid[0][0] = temp2;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}