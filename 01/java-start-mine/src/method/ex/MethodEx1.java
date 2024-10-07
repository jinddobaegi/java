package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        double average = getAverage(a, b, c);
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;

        average = getAverage(x, y, z);
        System.out.println("평균값: " + average);
    }

    public static double getAverage(int a, int b, int c) {
        int sum =  a + b + c;
        return sum / 3.0;
    }
}
