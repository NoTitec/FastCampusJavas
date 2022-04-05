package ch18;

import java.util.Calendar;

public class CompanyTest {


    public static void main(String[] args) {
        Company a=Company.getCompany();
        Company b=Company.getCompany();
        System.out.println(a);
        System.out.println(b);

        Calendar calender=Calendar.getInstance();
    }
}
