package ch14;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money+=money;
        passengerCount++;
    }
    public void showBusinfo(){
        System.out.println(busNumber+"passengernum"+passengerCount+"projit"+money);
    }
}
