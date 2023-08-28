package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n, \t, \\, \", \'
        System.out.println("고양이는");
        System.out.println("생선을");
        System.out.println("좋아해");

        // \n : 줄바꿈
        System.out.println("고양이는\n생선을\n좋아해");

        // 사탕   300원
        // 초콜릿  1000원
        // 바나나  2000원
        System.out.println("사탕\t\t300원\n초콜릿\t1000원\n바나나\t2000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");

        // 지금은 "9시" 입니다.
        System.out.println("지금은 \"9시\" 입니다.");

        // 고양이는 '생선' 이라고 생각했다.
        System.out.println("고양이는 \'생선\' 이라고 생각했다.");
        System.out.println("고양이는 '생선' 이라고 생각했다.");

        char c = 'A';
        c = '\'';
        System.out.println(c);


    }
}
