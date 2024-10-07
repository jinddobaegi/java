package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("Hello, Java!", 4);
    }

    public static void printMessage(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
