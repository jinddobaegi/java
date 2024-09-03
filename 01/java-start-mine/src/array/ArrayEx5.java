package array;

import java.util.Scanner;

public class ArrayEx5 {
    // 학생 수를 입력 받고
    // 국어, 수학, 영어 점수를 받아
    // 각 학생의 총접과 평균을 계산하라
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();
        int[][] arr = new int[N][3];
        String[] subjects = {"국어", "수학", "영어"};

        for (int i = 0; i < N; i++) {
            System.out.println((i+1) + "번 학생 점수 입력");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수: ");
                int score = sc.nextInt();
                arr[i][j] = score;
            }
        }

        for (int i = 0; i < N; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += arr[i][j];
            }
            double avg = (double) total / 3;
            System.out.print((i+1) + "번 학생 총접: " + total + " ");
            System.out.println("/ 평균: " + avg);
        }
    }
}
