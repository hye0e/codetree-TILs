import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String T = input[2];
        String[] word = new String[n]; 
        for (int i = 0; i < n; i++) {
            String inputWord = br.readLine();
            if (inputWord.startsWith(T)) {
                word[i] = inputWord;
            } else {
                word[i] = "z";
            }
            
        }

        Arrays.sort(word);
        System.out.println(word[k - 1]);
    }
}