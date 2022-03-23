package ch10;

/**
 * 멤버변수는 private지정해야할 경우 많음 왜냐하면 valid하지않은값을 다른객체에서 직접 접근하여 넣을 수 있기 때문이다
 * 멤버변수값 변경시 메소드로 valid한 값을 들어가게 할 수 있다 그러나 무조건 적으로 private로 지정하는것보다는
 * 필요한 경우에 사용하고 공개해도되는 부분은 공개해도 좋다
 */
public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid=false;
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<1||month>12){
            isValid=false;
        }else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void showDate(){
        if(isValid){
            System.out.println(year+"year"+month+"month"+day+"day");
        }
        else
        {
            System.out.println("not valid");
        }
    }
}
