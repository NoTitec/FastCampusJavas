package ch19;

public class CarFactory {
    private CarFactory(){

    }
    private static CarFactory carFactory=new CarFactory();
    public static CarFactory getInstance(){
        return carFactory;

    }
    public Car createCar(){
        Car newcar=new Car();
        return newcar;
    }
}
