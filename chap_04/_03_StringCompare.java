package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false
        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("pyThon")); // true

        // 문자열 비교 심화
        String pw1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        String pw2 = "1234"; // 참조
        System.out.println(pw1.equals(pw2)); // true
        System.out.println(pw1 == pw2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false


    }
}
