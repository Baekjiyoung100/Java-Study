package chap_01;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        int hour = 15;
        String name; //name이라는 변수 선언
           name = "지영";
        System.out.println(name + "님 " + hour + "시에 도착합니다");
        System.out.println(name + "님 도착했습니다.");

        //실수//
        double score = 90.5;
        char grade = 'A'; //한 글자 문자
        name = "이태윤"; //이미 선언된 변수의 값을 업데이트
        System.out.println(name + "의 점수: " + score + "/ 학점: " + grade);

        boolean pass = true;
        System.out.println("합격여부: " + pass);

        double d = 3.14123456789; //더 정말한 수
        float f = 3.12327345818F;
        float f2 = 3.15f; //정수
        System.out.println(f);
        System.out.println(d);
        System.out.println(f2);

        //int i = 10000000000000; 인트의 범위를 넘어감
        long l = 10000000000000L; //문제 해결
        long i = 10_000_000_000_000L;
        System.out.println(l);
        System.out.println(i);

        // int, long, float, double, String, boolean
    }
}
