package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            System.out.println(sum);
            if (sum > 5) {
                break;
            }
        }
    }
}
