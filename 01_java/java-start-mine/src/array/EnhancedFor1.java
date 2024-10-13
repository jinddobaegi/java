package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // 기존 for문
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        // 향상된 for문: for-each문 => "iter"라는 스니펫을 사용 가능하다
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우: 증가하는 index값 필요한 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "번째 값: " + numbers[i]);
        }
    }
}
