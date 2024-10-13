package operator;

public class Logical1{

    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(!true);

        int a = 1;
        int b = 2;
        boolean res = a > 0 && b > 0;
        boolean res2 = 0 < a || b < 0;
        System.out.println(res);
        System.out.println(res2);
    }
}
