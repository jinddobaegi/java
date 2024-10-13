package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단!");
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            int res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }

    }
}
