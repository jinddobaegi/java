package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println(m);
            System.out.println(i);
        }

        System.out.println(m);
//        System.out.println(i);  // 오류, for문 종료 시점에 i를 메모리에서 제거
    }
}
