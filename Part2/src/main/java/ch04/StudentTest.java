package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee=new Student(0,"","");//인스턴스 참조변수
        studentLee.studentID=12345;
        studentLee.setStudentName("lee");
        studentLee.address="서울";
        studentLee.showStudentInfo();
    }
}
