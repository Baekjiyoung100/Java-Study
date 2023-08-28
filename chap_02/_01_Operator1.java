package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(3 + 19); // 22
        System.out.println(12 - 3); // 9
        System.out.println(4 * 3); // 12
        System.out.println(12 / 3); // 4
        System.out.println(6 / 4); // 1
        System.out.println(4 / 6); // 0
        System.out.println(6 % 4); // 나머지 2

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6 곱하기 우선 순위 연산
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 5;
        int c;

        c = a + b;
        System.out.println(c); // 25

        c = a - b;
        System.out.println(c); // 20

        c = a / b;
        System.out.println(c); // 4

        c = a * b;
        System.out.println(c); // 100

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); //10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 10;
        System.out.println("대기 인원: " + waiting++); // 대기인원
        System.out.println("대기 인원: " + waiting++);
        System.out.println("총 대기 인원: " + waiting++);
    }
}
