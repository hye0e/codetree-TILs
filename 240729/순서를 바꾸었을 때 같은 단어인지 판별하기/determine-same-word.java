import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();

        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();

        Arrays.sort(word1Arr);
        Arrays.sort(word1Arr);

        if (word1.length() != word2.length()) {
            System.out.println("No");
        } else {
            int N = word1.length();
            
            String flag = "Yes";
            for (int i = 0; i < N; i++) {
                if (word1Arr[i] != word2Arr[i]) flag = "No";
            }
            System.out.println(flag);
        }
    }
}