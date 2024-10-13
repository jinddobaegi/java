package variable;

public class Var4 {

    public static void main(String[] args) {
        int a = 100;
        double b = 10.5;
        boolean c = true;
        char d = 'A';  // 단일 문자, 작은 따옴표 사용 => 이것도 보통 String을 사용함
        String e = "Hello Java";  // 문자열, 큰 따옴표 사용, 대문자로 시작 => 클래스와 관련

        // 100, true, A와 같이 개발자가 직접 적은 고정값들은 '리터럴'이라 함.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
