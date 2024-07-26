import java.io.*;

public class Main {
    // 1, 3, 5, 7
    // 2, 4, 6, 8
    public static int recursive(int N) {
        if (N == 1) return 1; 
        if (N == 2) return 2;

        return recursive(N - 2) + N;
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(recursive(N));
    }
}