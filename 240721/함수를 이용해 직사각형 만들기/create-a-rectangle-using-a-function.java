import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void printRect(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append("1");
            }
            sb.append("\n");
        }
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");
        printRect(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));

        System.out.println(sb);
    }
}