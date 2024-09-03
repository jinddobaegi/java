package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("등록가능 상품 개수: " + (10 - productCount));
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n번호 입력: ");
            int x = sc.nextInt();  // 10 + 엔터 => 숫자만 먹음
            sc.nextLine();  // 라인을 읽으려는데 '\n'가 남아있어서 걔가 할당됨

            if (x == 1) {
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.println("상품 등록");
                System.out.print("상품명: ");
                productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격: ");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            } else if (x == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println();
        }
    }
}

