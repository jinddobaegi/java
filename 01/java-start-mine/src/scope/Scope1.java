package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println(m);
            System.out.println(x);
        }

        if (true) {
            int x = 30;
            System.out.println(x);
        }

//        System.out.println(x);  // 오류, if문 종료 시점에 각 x를 메모리에서 제거
        System.out.println(m);
    }


}
