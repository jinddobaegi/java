package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("전위 증감연산자: " + b);

        a = 1;
        b = 0;
        b = a++;
        System.out.println("후위 증감연산자: " + b);
    }
}
