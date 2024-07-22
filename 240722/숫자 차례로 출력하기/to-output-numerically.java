import java.io.*;

public class Main {
    static int MAX = 1;
    public static void orderDesc(int N) {
        if (N == 0) return;
        System.out.print(N + " ");
        N--;
        orderDesc(N);
    }

    public static void orderAsc(int N) {
        if (N == MAX + 1) return;
        System.out.print(N + " ");
        N++;
        orderAsc(N);
    }

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MAX = N;
        orderAsc(1);
        System.out.println();
        orderDesc(N);
    }
}