package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 사용자에게 N개의 정수를 입력받고
        // 그 중 최댓값, 최솟값을 찾자
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 개수 입력: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxV, minV;
        maxV = minV = arr[0];
        for (int num : arr) {
            if (maxV < num) {
                maxV = num;
            }
            if (minV > num) {
                minV = num;
            }
        }
        System.out.println("가장 큰 정수: " + maxV);
        System.out.println("가장 작은 정수: " + minV);
    }
}
