package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        int day;
        switch (month){
            case 1: case 3: case 5: case 4:
                day=31;
                break;
            case 2:
                day= 28;
                break;

            default:
                System.out.println("no month");
                day=-1;
        }
        System.out.println(month+"월"+day+"입니다");

        String str = "Gold";
        string_switch_test(str);
    }

    //switch가 문자열도 가능하게됨
    public static void string_switch_test(String a){
        switch (a){
            case "Gold":
                System.out.println("goldmedal");
                break;
            case "Silver":
                System.out.println("selvermadel");
            case "Bronze":
                System.out.println("bronze medal");
            default:
                System.out.println("nomedal");
                break;

        }
    }

    //java 14부터의 switch문
//    int month = 3;

/*
    int day = switch (month) {
        case 1, 3, 5, 7, 8, 10,12 -> {
            System.out.println("한 달은 31일입니다.");
            yield 31;//return
        }
        case 4,6,9,11 -> {
            System.out.println("한 달은 30일입니다.");
            yield 30;
        }
        case 2 ->{
            System.out.println("한 달은 28일입니다.");
            yield 28;
        }
        default->{
            System.out.println("존재하지 않는 달 입니다.");
            yield 0;
        }
    };
*/
//		System.out.println(month + "월은 " + day + "일입니다.");

}
