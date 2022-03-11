package ch15;

public class Ifelsetest {
    /**
     * 그냥 if 문연하면 모든 if문을 검사하고 else if 로 연결하면 맞는 조건이 되는 문장들만 실행후 전체 빠짐
     * @param args
     */
    public static void main(String[] args) {
        int age = 12;
        int charge;

        if(age < 8){
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        else if(age < 14){
            charge = 2000;
            System.out.println("초등학생 입니다.");
        }
        else if(age < 20){
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        }
        else{
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원입니다.");


    }
}
