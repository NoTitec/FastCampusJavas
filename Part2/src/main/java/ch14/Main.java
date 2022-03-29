package ch14;

public class Main {
    public static void main(String[] args) {
        Student James=new Student("James",5000);
        Student Tomas=new Student("Tomas",5000);
        Student Enward=new Student("Edward",20000);
        Bus bus100=new Bus(100);
        Bus bus500=new Bus(500);

        James.takeBus(bus100);

        Subway gSubway=new Subway(2);
        Tomas.takeSubway(gSubway);

        Taxi wtaxi=new Taxi("잘나간다 운수");
        Enward.takeTaxi(wtaxi);

        James.showInfo();
        Tomas.showInfo();
        bus100.showBusinfo();
        gSubway.showSubwayInfo();
        bus500.showBusinfo();
        Enward.showInfo();
        wtaxi.showTaxiInfo();
    }
}
