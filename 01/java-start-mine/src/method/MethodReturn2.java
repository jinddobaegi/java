package method;

import java.util.Scanner;

public class MethodReturn2 {
    // 나이를 입력받고
    // 18세 이상 => 출입 가능
    // 미만 => 출입 불가
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        if (checkAge(age)) {
            System.out.println("출입 가능");
        } else {
            System.out.println("미성년자 출입 불가");
        }
    }

    public static boolean checkAge(int age) {
        return age >= 18;
    }
}
