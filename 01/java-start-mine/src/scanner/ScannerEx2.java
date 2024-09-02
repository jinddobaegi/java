package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 정수 입력 받으면
        // 두 수 사이의 모든 정수 출력

        System.out.print("정수 1: ");
        int a = sc.nextInt();
        System.out.print("정수 2: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("두 수는 같습니다.");
        } else {
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            for (int i = a; i <= b; i++) {
                System.out.print(i);
                if (i != b) {
                    System.out.print(", ");
                }
            }
        }
    }
}
