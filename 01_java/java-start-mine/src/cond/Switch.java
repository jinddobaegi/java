package cond;

public class Switch {
    public static void main(String[] args) {
        int grade = 1;
        int coupon;

        // if문이라면?
//        if (grade == 1) {
//            coupon = 3000;
//        } else if (grade == 2) {
//            coupon = 1000;
//        } else {
//            coupon = 500;
//        }

        // switch문
        switch (grade) {
            case 1:
                coupon = 3000;
                break;  // break 없으면 이후 조건에 맞을 때도 실행됨
            case 2:
            case 3:  // 2, 3 등급 모두 1000원 쿠폰을 주려면
                coupon = 1000;
                break;
            default:  // else에 해당
                coupon = 500;
        }
        System.out.println(coupon);

        // Java 14 이후
        // coupon 값을 선언, 초기화할 때 바로 사용할 수도 있다
         int newCoupon = switch (grade) {
                    case 1 -> 3000;
                    case 2, 3 -> 1000;
                    default -> 500;
                };
        System.out.println(newCoupon);

        // switch문의 if문과 차이점
        // 1) 특정 case와 일치여부만 확인 가능하다
        // 2) 그리고 if문과 다르게 위에서부터 확인이 아닌, case에 맞는 것부터 간다

        // Java 14 이후의 switch문에서는 yield를 통해
        // case 조건애 일치하면 연산을 수행하고 그 값을 반환할 수 있다
    }
}
