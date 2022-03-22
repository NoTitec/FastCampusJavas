package ch08;

public class test {
    public static void main(String[] args) {
        Man Tomas=new Man(180.0f,78.0f,"Tomas",37);
        Order order1=new Order(202011020003l,"01023450001","서울시 강남구 역삼동 111-333","20201102","130258",35000,0003);
        Tomas.showManInfo();
        order1.showOrderInfo();
    }
}
