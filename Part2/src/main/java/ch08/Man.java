package ch08;

public class Man {
    private float hight;
    private float weight;
    private String name;
    private int age;
    public Man(float a,float b,String c,int d) {
        this.hight=a;
        this.weight=b;
        this.name=c;
        this.age=d;
    }
    public void showManInfo(){
        System.out.println(hight+""+weight+name+age);
    }
}
