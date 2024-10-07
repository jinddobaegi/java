package method.ex;

public class MethodEx3 {
    // 기본 잔액 10000
    // 입출금 메서드 생성하기
    // 메서드로 1000 입금, 2000 출금
    // 출금할 땐 잔액 부족에 대한 예외처리하기
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(1000, balance);
        balance = withdrawal(20000, balance);

        System.out.println("최종 잔액: " + balance);
    }

    public static int deposit(int depositAmount, int balance) {
        System.out.print(depositAmount + "원 입금, ");
        balance += depositAmount;
        System.out.println("현재 잔액: " + balance);

        return balance;
    }

    public static int withdrawal(int withdrawalAmount, int balance) {
        if (withdrawalAmount <= balance) {
            System.out.print(withdrawalAmount + "원 출금, ");
            balance -= withdrawalAmount;
            System.out.println("현재 잔액: " + balance);
        } else {
            System.out.println(withdrawalAmount + "출금 시도 중 잔고 부족");
        }

        return balance;
    }
}
