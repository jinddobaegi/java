package loop;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i는 " + i + " j는 " + j);
            }
        }
    }
}
