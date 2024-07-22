import java.io.*;

public class Main {
    public static void print(int N) {
        if (N == 0) return;
        else {
            N--;
            System.out.println("HelloWorld");
            print(N);
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        print(N);
    }
}