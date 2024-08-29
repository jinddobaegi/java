package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println(a);

        ++a;
//        a += 1;  // python처럼 이것도 가능하다
//        "++"는 연산자 순위가 괄호 다음으로 가장 높지만
//        "+="는 연산자 우선순위가 굉장히 낮다
        System.out.println(a);

        int num = 0;
        System.out.println(num);
        num += 3;
        System.out.println(num);
    }
}
