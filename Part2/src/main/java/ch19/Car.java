package ch19;

public class Car {
    private static int serialNum = 10000;
    int carnum;
    public Car() {
        serialNum++;
        carnum = serialNum;
    }
    public int getCarNum(){
        return carnum;
    }
}
