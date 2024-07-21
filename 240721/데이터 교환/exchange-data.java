public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int memory_a = 5;
        int memory_b = 6;
        int memory_c = 7;

        int b = memory_a;
        int c = memory_b;
        int a = memory_c;

        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("\n");
        sb.append(b);
        sb.append("\n");
        sb.append(c);

        System.out.println(sb);
    }
}