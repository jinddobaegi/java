package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0을 입력하면 여태까지의 총합 출력");
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("입력한 정수의 총합: " + sum);
                break;
            }
            sum += num;
        }
    }
}
