import java.io.*;

public class Main {
    static int MAX = 1;

    public static void printNum(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNum(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MAX = N;
        printNum(N);
    }
}