package casting;

public class Casting2 {

    public static void main(String[] args) {
        double dv = 1.5;
        int iv;

//        iv = dv;  // 오류
        iv = (int) dv;
        System.out.println(iv);
    }
}
