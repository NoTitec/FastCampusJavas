package ch09;

public class Student {
    String studentName;
    int studentId;

    Subject korea;
    Subject math;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        korea=new Subject();
        math=new Subject();
    }

    public void setKoreaSubject(String name,int score){
        korea.subjectname=name;
        korea.score=score;
    }
    public void setMathSubject(String name,int score){
        math.subjectname=name;
        math.score=score;
    }

    public void showScoreInfo(){
        int toal= korea.score+ math.score;
        System.out.println(studentName+"student total is "+toal+"!");
    }
}
