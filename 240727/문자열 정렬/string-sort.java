import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] charArr = input.toCharArray();
        Arrays.sort(charArr);
        System.out.println(new String(charArr));
    }
}