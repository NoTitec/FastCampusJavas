package ch18;
//여러 인스턴스생기면 문제생기는 경우가 있음
//대표적으로 날짜 회사사원이 여러면이라도 회사자체는 1개여야함
public class Company {
    //기본생성자생성안하고 외부에서 생성못하게 private로 지정 후 생성자 하나 지정
    private Company(){

    }
    private static Company instance=new Company();//유일한 인스턴스도 내부생성

    public static Company getCompany(){//외부에서 클래스명으로 호출가능하게 static메소드지정
        if(instance==null){
            return instance=new Company();
        }
        return instance;
    }
}
