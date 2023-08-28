package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로
        //int score = 9 + 5.3; > 오류발생

        // int to float double
        int num = 6;
        System.out.println(num); // 6
        System.out.println((float) num); // 6.0
        System.out.println((double) num);// 6.0

        // float, double to int
        float f = 32.4F;
        double d = 29.3;
        System.out.println((int) f);
        System.out.println((int) d);

        // 정수 + 실수 연산
        num = 92 + (int) 2.1; // 92 + 2
        System.out.println(num); // 94

        d = 29 + 34.23; // 자동으로 (double) 29로 됨
        System.out.println(d); // 63.23

        // 변수에 형변환된 데이터 집어넣기
        double convertedNum = num; // 94 > 94.0
        // int -> long -> float -> double (자동 형변환)

        int convertedNumInt = (int) d; // 63.23 -> 63
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(35);
        s1 = Integer.toString(35);
        System.out.println(s1); // 35

        String s2 = String.valueOf(21.4);
        s2 = Double.toString(21.4);
        System.out.println(s2); // 21.4

        // 문자열을 숫자로
        int i = Integer.parseInt("13");
        System.out.println(i);
        double dou = Double.parseDouble("28.12");
        System.out.println(dou); // 28.12

        int error = Integer.parseInt("자바"); // error 발생
    }
}
