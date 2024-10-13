package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자들의 합계와 평균을 구해보자.");
        System.out.println("음이 아닌 정수를 입력해주세요(-1을 입력하면 종료): ");
        int sum = 0;
        double cnt = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            cnt ++;
        }
        if (cnt > 0) {
            double avg = (double) sum / cnt;
            System.out.println("숫자의 총합: " + sum);
            System.out.println("숫자의 평균: " + avg);
        } else {
            System.out.println("입력된 숫자가 없습니다.");
        }
    }
}
