package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50};

//        int[] students = {90, 80, 70, 60, 50};  // 이렇게 축약할 수 있음

        for (int i=0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
