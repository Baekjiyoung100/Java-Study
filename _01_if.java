package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 13; // 오후 1시

        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략 가능
        if (hour <= 20)
            System.out.println("영업중");

        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if ( hour <= 20 ) {
            System.out.println("영업중");
            System.out.println("출석");
        }
        System.out.println("00독서실");

        // 오후 8시 이전, 이미 출석을 한 경우?
        hour = 15;
        boolean check = false;
        //if (hour <= 20 && check == false) {
        if (hour <=20 && !check) {
            System.out.println("영업중");
        }
        System.out.println("출석완료");

        // 오후 8시 이후이거나, 이미 출석을 한 경우
        hour = 21;
        check = true;
        if (hour >= 20 && check) {
            System.out.println("출석 불가");
        }
        System.out.println("이미 출석 되었거나 출석 불가능한 시간입니다");
    }
}
