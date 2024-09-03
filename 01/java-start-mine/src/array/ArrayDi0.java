package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int r = 2;
        int c = 3;
        int[][] arr = new int[r][c];
        int k = 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]);
                if (j != c-1) {
                    System.out.print(" ");
                }
            }

            if (i != r-1) {
                System.out.println();
            }

        }
    }
}
