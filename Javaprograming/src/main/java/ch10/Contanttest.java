package ch10;

public class Contanttest {
    public static void main(String[] args) {
        final var MAX_NUM=100;
        final int MIN_NUM;

        MIN_NUM=20;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        byte bnum=123;
        int inum=bnum;
        System.out.println(inum);

        double dnum=3.14;
        int inum2=(int)dnum;
        System.out.println(inum2);

        double dnum2=1.2;
        float fnum=0.9f;

        int inumr=(int)dnum2+(int)fnum;
        int inumr2=(int)(dnum2+fnum);
        System.out.println(inumr);
        System.out.println(inumr2);
    }
}
