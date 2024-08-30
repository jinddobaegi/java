package cond;

public class If2 {
    public static void main(String[] args) {
        int age = 19;
        String res;
        
        if (age >= 20) {
            res = "어른";
        } else if (age >= 17) {
            res = "고등학생";
        } else if (age >= 14) {
            res = "중학생";
        } else if (age >= 8) {
            res = "초등학생";
        } else {
            res = "미취학아동";
        }

        System.out.println(res);
    }
}
