package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        /*
        어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램.
        조건) 키가 120 이상인 경우에만 탑승 가능 / 삼항 연산자 이용
         */
        int tall_1 = 115;
        int tall_2 = 121;
        String str1 = (tall_1 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        String str2 = (tall_2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";

        System.out.println("키가 " + tall_1 + "cm 이므로 " + str1);
        System.out.println("키가 " + tall_2 + "cm 이므로 " + str2);
    }
}
