package variable;

public class Var6 {

    public static void main(String[] args) {
        String s = "12345";
        int a = Integer.parseInt(s);
        int b = Integer.valueOf(s);
        System.out.println(a);
        System.out.println(b);

        String str1 = Integer.toString(a);
        String str2 = String.valueOf(a);
        System.out.println(str1);
        System.out.println(str2);
    }
}
