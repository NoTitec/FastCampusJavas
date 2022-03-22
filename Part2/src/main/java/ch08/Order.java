package ch08;

public class Order {
    private long number;
    private String phone;
    private String address;
    private String date;
    private String time;
    private int price;
    private int menunumber;

    public Order(long number, String phone, String address, String date, String time, int price, int menunumber) {
        this.number = number;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menunumber = menunumber;
    }
    public void showOrderInfo(){
        System.out.println("주문접수번호:"+number);
        System.out.println("주문 핸드폰 번호:"+phone);
        System.out.println("주문 집 주소 :"+address);
        System.out.println("주문 날짜:"+date);
        System.out.println("주문 시간:"+time);
        System.out.println("주문 가격:"+price);
        System.out.println("메뉴 번호:"+menunumber);


    }
}
