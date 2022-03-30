package ch16;

public class Test {
    public static void main(String[] args) {
        Employee employ1=new Employee();
        employ1.setEmployeeName("leesun");
        System.out.println(employ1.serialNum);
        Employee employ2=new Employee();
        employ2.setEmployeeName("lee");
        employ2.serialNum++;
        System.out.println(employ1.serialNum);
        System.out.println(employ2.serialNum);
        System.out.println(Employee.serialNum);
        System.out.println(Employee.serialNum);
        System.out.println(employ1.getEmployeeName()+employ1.getEmployeeId());
        System.out.println(employ2.getEmployeeName()+employ2.getEmployeeId());

    }

}
