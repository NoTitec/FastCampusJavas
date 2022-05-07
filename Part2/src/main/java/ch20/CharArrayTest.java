package ch20;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';
        int count=0;
        for (int i = 0; i < 20; i++) {
            alphabets[i]= ch++;
        }

        for (int i=0;i<count;i++) {
            System.out.println(alphabets[i]);
        }
    }
}
