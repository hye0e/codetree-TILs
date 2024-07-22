import java.io.*; 

public class Main {
    static int sum = 0;
    static int MAX = 0;

    public static void plusSum(int N) {
        sum += N;
        if (N == MAX) return;
        plusSum(N + 1);
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MAX = N;
        plusSum(1);
        System.out.println(sum);
    }
}