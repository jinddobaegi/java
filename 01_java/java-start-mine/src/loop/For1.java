package loop;

public class For1 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        int x = 10;

        for (int i = 1; sum <= x; i++) {
            sum += i;
            System.out.println("i는 " + i + " sum은 " + sum);
        }
    }
}
