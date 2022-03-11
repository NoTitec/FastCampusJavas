package ch13;

import java.util.Scanner;

public class Conditontest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        int num2=sc.nextInt();

        int max=(num>num2)?num:num2;//true 시 앞항 false일시 뒤항
        System.out.println(max);
        //비트 연산자 사용처
        //속도를 더 올리거나 특정 비트를 꺼내야할때
        //비트 키고끄기나 마스크연산
        //비트연산자 << >>는 곱하기 나누기 2씩하는연산과 같다

        /**
         * 연산자 우선순위
         * () [] 단항 산술 관계 비트연산 논리 조건 대입
         */
    }
}
