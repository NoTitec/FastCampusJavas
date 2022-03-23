package ch09;

public class Subjecttest {
    public static void main(String[] args) {
        Student studentLee=new Student("Lee",100);
        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학",100);
        studentLee.showScoreInfo();
    }
}
