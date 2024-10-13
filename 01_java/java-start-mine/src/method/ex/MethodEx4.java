package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        // 앞의 문제랑 비슷하지만
        // 1,2,3,4로 입/출금, 잔액확인, 종료
        // 반복할 수 있는 코드 작성
        // 메서드 활용
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");

            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 1){
                System.out.print("입급액을 입력하세요: ");
                int depositAmount = sc.nextInt();
                balance = deposit(depositAmount, balance);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawalAmount = sc.nextInt();
                balance = withdrawal(withdrawalAmount, balance);
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance);
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }

    public static int deposit(int depositAmount, int balance) {
        System.out.println(depositAmount + "원을 입금하였습니다.");
        balance += depositAmount;
        System.out.println("현재 잔액: " + balance);
        return balance;
    }

    public static int withdrawal(int withdrawalAmount, int balance) {
        if (withdrawalAmount > balance) {
            System.out.println(withdrawalAmount + "원을 출금하기엔 잔고가 부족합니다.");
        } else {
            System.out.println(withdrawalAmount + "원을 출금하였습니다.");
            balance -= withdrawalAmount;
            System.out.println("현재 잔액: " + balance);
        }
        return balance;
    }
}
