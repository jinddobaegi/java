package method.overloading;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

      // 파라미터 이름이 달라도 형태와 순서, 개수가 같아서 구분 불가능
//    public static int add(int c, int d) {
//        System.out.println("1번 호출");
//        return c + d;
//    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    /*
    메서드 시그니처: 자바에서 메서드를 구분할 수 있는 고유한 식별자
    "메서드의 이름"과 "파라미터 타입(순서 포함)"을 의미함
    "반환 타입"은 시그니처에 포함되지 않음
    */
}
