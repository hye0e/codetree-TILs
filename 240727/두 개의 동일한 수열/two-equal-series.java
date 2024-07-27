import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] Aarr = new int[N];
        int[] Barr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Aarr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Barr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Aarr);
        Arrays.sort(Barr);

        StringBuilder sb = new StringBuilder();

        String result = "Yes";
        for(int i = 0; i < N; i++) {
            if (Aarr[i] != Barr[i]) {
                result = "No";
                break;
            } 
        }
        sb.append(result);
        System.out.println(sb);
    }
}