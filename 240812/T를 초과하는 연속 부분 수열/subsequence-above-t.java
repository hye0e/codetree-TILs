import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > t && arr[i] > t) {
                cnt++;
        
            } else {
                cnt = 1;
            }
            System.out.println();
            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);
    }
}