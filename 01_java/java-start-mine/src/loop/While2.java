package loop;

public class While2 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 8;
        int endNum = 12;

        while (i <= endNum) {
            sum += i;
            System.out.println(sum);
            i++;
        }
    }
}
