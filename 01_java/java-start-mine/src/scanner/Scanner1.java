package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();  // 엔터를 입력할 때까지 문자를 String으로 가져옴
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int i = scanner.nextInt();  // 입력을 int형으로 가져옴(nextDouble은 실수형)
        System.out.println("입력한 정수: : " + i);
        
        // print는 println과 다르게 줄바꿈을 하지 않음
        // printf도 줄바꿈이 없지만, %s, %d 등을 사용 가능함
    }
}
