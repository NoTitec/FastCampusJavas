package ch04;

public class Student {
    public Student(int studentID, String studentName, String address) {
        this.studentID = studentID;//this는 자기자신을 나타내는 키워드
        this.studentName = studentName;
        this.address = address;
    }

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentID+"studnetname is"+ studentName+"adress is"+address);

    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName=name;
    }
}
