package variable;

public class Var5 {

    public static void main(String[] args) {
        // 정수
        byte b = 127;  // -128 ~ 127 => 파일을 다룰 때 주로 사용
        short s = 32767;  // -32768 ~ 32767
        int i = 2147483647;  // +- 약 21억, 총 약 42억개 => 가장 많이 씀
        long l = 9223372036854775807L;  // +- 가장 큰 수!, 뒤에 L을 써야 함, 대문자 권장
        // 자바는 기본적으로 4byte를 효율적으로 계산하도록 돼있음
        // 따라서 int를 사용하자

        float f = 10.0f;  // 뒤에 f를 사용해야 함
        double d = 10.0;  // float보다 큰 범위, 높은 정밀도
        
        // 표현 범위에 따라 메모리 공간을 차지하기 때문에 적절한 타입을 사용하자
    }
}
