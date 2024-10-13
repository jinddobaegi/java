package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int i1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int i2 = sc.nextInt();

        int sum = i1 + i2;
        System.out.println("두 수의 합: " + sum);
    }
}
