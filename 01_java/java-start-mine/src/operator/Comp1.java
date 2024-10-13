package operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(a == b);

        boolean res = a != b;
        System.out.println(res);

        String s1 = "java";
        String s2 = "java";
        System.out.println(s1.equals(s2));  // "=="는 실패할 때도 있음
    }
}
