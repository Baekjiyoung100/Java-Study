package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        /*버스 도착 정보를 출력하는 프로그램을 작성하시오.
        각 정보는 적절한 자료형의 변수에 정의합니다.

        정보
        - 버스 번호는 "1234", "상암08"과 같은 형태
        - 남은 시간은 분 단위 (예: 3분, 5분)
        - 남은 거리는 km 단위 (예: 1.5km, 0.8km)
         */

        final String BUS_REGION = "상암";
        final String BUS_NUM = "08";
        double reach = 1.2;
        int time = 3;

        System.out.println(BUS_REGION + BUS_NUM + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + reach + "km");
    }
}
