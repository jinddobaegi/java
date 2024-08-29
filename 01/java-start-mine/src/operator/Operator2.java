package operator;

public class Operator2 {

    public static void main(String[] args) {
        String res1 = "hello " + "world";
        System.out.println(res1);

        String s1 = "string1 ";
        String s2 = "string2";
        String res2 = s1 + s2;
        System.out.println(res2);

        String res3 = "a + b = " + 10;  // 섞어서 쓰면 형 변환 하지만
//        String res3 = 10;  // 이렇게는 안된다
        System.out.println(res3);

        int num = 10;
        String str = "my string ";
        String res4 = str + num;  // 이렇게 따로 선언 후 더하는 것도 가능하다
        System.out.println(res4);
        System.out.println(str + num);  // 더한 값을 바로 출력하는 것도 가능하다
        
//      이렇게 빼기 연산은 또 안된다
//        String str2 = "please 10";
//        int x = 10;
//        String res5 = str2 - x;
//        System.out.println(res5);
    }
}
