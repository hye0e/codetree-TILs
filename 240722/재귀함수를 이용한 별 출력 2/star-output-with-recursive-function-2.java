import java.io.*;

public class Main {
    static int MAX = 1;
    public static void printStart(int N) {
        if (N == 0) return;
        for (int i = 0; i < N; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
        printStart(N - 1);
    }

    public static void printStartDesc(int N) {
        if (N == MAX + 1) return;
        for (int i = 0; i < N; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
        System.out.println();
        printStartDesc(N + 1);
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        printStart(N);
        MAX = N;
        printStartDesc(1);
    }
}