import java.util.*;
import java.io.*;
public class Main {
    static int n, t;
    static int max_n = 201;
    static int[] u = new int[max_n];
    static int[] d = new int[max_n];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            u[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }

        while (t-- > 0) {
            int temp = u[n - 1];

            for (int i = n - 1; i >= 1; i--) { // 2, 1
                u[i] = u[i - 1];
            }

            u[0] = d[n - 1];

            for (int i = n - 1; i >= 1; i--) { // 2, 1
                d[i] = d[i - 1];
            }
            d[0] = temp;
        }
        
        // 출력:
        for(int i = 0; i < n; i++)
            System.out.print(u[i] + " ");
        System.out.println();
        
        for(int i = 0; i < n; i++)
            System.out.print(d[i] + " ");
        System.out.println();
    }
}