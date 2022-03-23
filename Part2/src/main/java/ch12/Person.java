package ch12;

public class Person {
    String name;
    int age;

    public Person(){//생성자에서 다른 생성자 호출
        //여기에 코드가있으면 객체생성전에 뭔가 하려는것이므로 오류가 뜬다
        this("no name", 1);//this는 자기자신의 주소를 반환한다
        //이경우 this()는 Person()와 동일하다
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void showinfo(){
        System.out.println(name+age);
    }

    public Person getPerson(){
        return this;
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.showinfo();

        System.out.println(p);
        Person p2=p.getPerson();
        System.out.println(p2);
    }
}
