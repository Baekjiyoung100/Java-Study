package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        //ctrl + D = 복제
        System.out.println("주석처리 안함");
        //System.out.println("주석처리 함" + "ctrl + /");

        int tall = 150;
        tall = tall + 10; // 키가 10cm 자랐다.
        System.out.println("키:" + tall + "cm");

        // 한 줄 주석 단축기 : Ctrl + /
        // 여러 줄 주석 단축키 " Ctrl + Shift + /
        /*여러줄 주석 ctrl + shift + /
        int a = 10;
        int b = 30;
        System.out.println(a + b); // 40
         */
    }
}
