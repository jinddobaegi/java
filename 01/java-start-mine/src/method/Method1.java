package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과 2 출력: " + sum2);
    }

    // public: 다른 클래스에서 호출할 수 있는 메서드라는 뜻
    // static: 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
    public static int add(int a, int b) {
        return a + b;
    }
}
