package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 15;
        num = num + 4;
        System.out.println(num); // 19

        num = num - 9; // 10
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 4;
        System.out.println(num); // 5

        num = num % 5;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 15;
        num += 4;
        System.out.println(num); // 19

        // num = num - 9;
        num -= 9;
        System.out.println(num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20

        //num = num / 4;
        num /= 4;
        System.out.println(num); // 5

        //num = num % 5;
        num %= 5;
        System.out.println(num); // 0
    }
}
