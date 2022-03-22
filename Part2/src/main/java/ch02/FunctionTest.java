package ch02;

public class FunctionTest {//함수 호출시 스택에 메모리 할당해서 사용 return 시 스택메모리는 반환됨 main 함수도 마찬가지

    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        System.out.println(addNum(n1,n2));
        sayHello("hi");
        System.out.println(calcSum());
    }
    public static int addNum(int n1,int n2){
        int result=n1+n2;
        return result;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }
    public static int calcSum(){
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }

        return sum;
    }
    //함수가쓰는 메모리 -> 스택메모리
    //함수는 어딘가에속해있지않음 단독 모듈, 메소드는 클래스안에 속한함수의 일종
    //메소드이름은 객체사용하는 입장에서 짓는것이 좋다
}
