package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntOver = 2147483648L;  // int 최대 표현값 + 1
        int intVal;

        intVal = (int) maxIntOver;
        System.out.println(intVal);  // 오버플로우 => -2147483648 출력
    }
}
