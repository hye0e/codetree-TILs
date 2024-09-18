import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int answer = 1;
    static int[] numbers = new int[4];
    public static boolean isBeautifulNumber(String number) {
        int length = number.length();
        for (int i = 0; i < length;) {
            char current = number.charAt(i);
            int count = 0;
            
            // Count consecutive occurrences of the current digit
            while (i < length && number.charAt(i) == current) {
                count++;
                i++;
            }
            
            // Check if the count matches the digit's value
            if (count != Character.getNumericValue(current)) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int depth, String temp) {
        if (depth == N) {
            if (isBeautifulNumber(temp)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            dfs(depth + 1, temp + numbers[i]);
        }
        
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 4; i++) {
            numbers[i - 1] = i;
        }
        dfs(0, "");
        System.out.println(answer);
    }
}