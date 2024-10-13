package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        // do-while문
        // while과 다르게 조건문을 살피기 전에
        // do 부분을 무조건 한 번은 실행한다
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);
    }
}
