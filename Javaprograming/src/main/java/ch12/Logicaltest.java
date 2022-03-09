package ch12;

public class Logicaltest {
    public static void main(String[] args) {
        int num1=10;
        int i=2;

        boolean value=((num1=num1+10)<10)&&((i=i+2)<10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
//        앞에 항이 이미 false이므로 뒤에 조건문은 실행을 안함
        boolean value2=((num1=num1+10)>10)||((i=i+2)<10);
        System.out.println(value2);
        System.out.println(num1);
        System.out.println(i);
//        앞에 항이 이미 true이므로 뒤에 조건문은 실행을 안함
//  이러한 것을 short circuit evaluation이라한다
    }
}
