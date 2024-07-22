import java.io.*;

public class Main {
    static int MAX = 1;
    public static void printStart(int n) {
        if (n == MAX + 1) return;
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        printStart(n + 1);
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        MAX = n;
        printStart(1);
    }
}