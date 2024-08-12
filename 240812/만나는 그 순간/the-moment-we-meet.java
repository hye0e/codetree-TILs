import java.util.*;
import java.io.*;

public class Main {
    // 음수까지 있기때문
    public static final int MAX_T = 1000 * 1000;

    public static int[] posA = new int[MAX_T + 1];
    public static int[] posB = new int[MAX_T + 1];

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int timeA = 1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            
            while (t-- > 0) {
                if (d.equals("R")) 
                    posA[timeA] = posA[timeA - 1] + 1;
                else 
                    posA[timeA] = posA[timeA - 1] - 1;
                timeA++;
            }
        }
        
        int timeB = 1;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            
            while (t-- > 0) {
                if (d.equals("R")) 
                    posB[timeB] = posB[timeB - 1] + 1;
                else 
                    posB[timeB] = posB[timeB - 1] - 1;
                timeB++;
            }
        }
        
        int ans = -1;
        for (int i = 1; i < timeA; i++) {
            if (posA[i] == posB[i]) ans = i; break;
        }

        System.out.println(ans);
        
    }
}