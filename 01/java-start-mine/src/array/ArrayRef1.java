package array;

public class ArrayRef1 {

    public static void main(String[] args) {
        int[] students;  // 배열을 담을 수 있는 배열 변수 선언
        students = new int[5];  // int가 다섯 칸 있는 배열 생성 후 배열 변수에 그 참조값(메모리 주소)를 할당

        // 변수값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + " 의 점수" + students[i]);
        }

        System.out.println(students);  // 참조값
    }
}
