package variable;

public class Var2 {

    public static void main(String[] args) {
        int a;   // 변수 선언
        a = 10;  // 변수 초기화 => 지역 변수는 초기화를 하지 않으면 이상한 값이 출력될 수 있다!
        System.out.println(a);
        
        a = 50;  // 값 변경
        System.out.println(a);
    }
}
