package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 강아지 = true;
        boolean 고양이 = true;
        boolean 햄스터 = true;

        System.out.println(강아지 || 고양이 || 햄스터); // or 하나라도 true 이면 true
        System.out.println(강아지 && 고양이 && 햄스터); // and 모두 true 이면 turn

        // And 연산
        System.out.println((5 > 1) && (7 <= 3)); // 5는 1보다 크고, 7은 3보다 같거나 작거나 같다 (false)
        System.out.println((3 > 1) && (6 < 10)); // 3은 1보다 크고, 6은 10보다 작다 (true)

        // Or 연산
        System.out.println((5 > 1) || (7 <= 3)); // 5는 1보다 크거나, 7은 3보다 같거나 작거나 같다 (true)
        System.out.println((3 > 1) || (6 < 10)); // 3은 1보다 크거나, 6은 10보다 작다 (true)
        System.out.println((10 <= 1) || (20 > 100)); // 10은 1보다 작거나 같거나, 20은 100 보다 크다 (false)

        // System.out.println(2 < 4 < 5); 불가

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 2)); // true
    }
}
