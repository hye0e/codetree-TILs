import java.io.*;

public class Main {
    public static int calDate(int goalMonth, int goalDay) {
        int[] dayOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < goalMonth; i++)
            totalDays += dayOfMonth[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += goalDay;

        return totalDays;
    }
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int startMonth = Integer.parseInt(input[0]);
        int startDay = Integer.parseInt(input[1]);

        int goalMonth = Integer.parseInt(input[2]);
        int goalDay = Integer.parseInt(input[3]);

       
        System.out.println(calDate(goalMonth, goalDay) - calDate(startMonth, startDay) + 1);
    }
}