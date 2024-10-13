package method;

import java.util.Scanner;

public class MethodReturn1 {
    // 숫자를 입력하면 홀수임을 반환하는 함수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(odd(num));
    }

    public static boolean odd(int num) {
        return num % 2 == 1;
    }
}
