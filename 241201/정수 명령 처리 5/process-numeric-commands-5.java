import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            if (st.countTokens() == 1) {
                int number = Integer.parseInt(st.nextToken());

                if (type.equals("push_back")) {
                    list.add(number);
                }

                if (type.equals("get")) {
                    System.out.println(list.get(number - 1));
                }
            } else {
                if (type.equals("pop_back") && list.size() > 0) {
                    list.remove(list.size() - 1);
                }

                if (type.equals("size")) {
                    System.out.println(list.size());
                }
            }
        }
    }
}