package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        System.out.println("두 수 모두 0이면 종료!");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자1: ");
            int i1 = sc.nextInt();
            System.out.print("숫자2: ");
            int i2 = sc.nextInt();

            if (i1 == 0 && i2 == 0) {
                System.out.println("종료!");
                break;
            }

            int sum = i1 + i2;
            System.out.println("두 수의 합은 " + sum);
        }
    }
}
