package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. 함수 호출 전 num: " + num);
        changeNum(num);
        System.out.println("4. 함수 호출 후 num: " + num);
    }

    public static void changeNum(int num) {
        System.out.println("2. 숫자 변경 전 num: " + num);
        num *= 2;
        System.out.println("3. 숫자 변경 후 num: " + num);
    }
}
