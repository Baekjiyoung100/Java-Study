package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        /* 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램
         */
        String personalNum = "0401010-3123456";
        System.out.println(personalNum.substring(0, personalNum.indexOf("-") + 2));
    }
}
