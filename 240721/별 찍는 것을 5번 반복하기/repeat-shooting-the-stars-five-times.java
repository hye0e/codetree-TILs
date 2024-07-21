public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void printStar() {
        sb.append("**********");
        sb.append("\n");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        for (int i = 0; i < 5; i++) {
            printStar();
        }
        System.out.println(sb);
    }
}