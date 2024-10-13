package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 1: ");
        int a = sc.nextInt();

        System.out.print("숫자 2: ");
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("두 수는 같음");
        }
    }
}
