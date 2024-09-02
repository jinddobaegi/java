package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        System.out.println("exit를 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("문자를 입력하세요: ");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println(str);
        }
    }
}
