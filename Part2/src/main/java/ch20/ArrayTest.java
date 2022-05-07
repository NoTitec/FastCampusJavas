package ch20;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];//기본타입인 int 는 0 double은 0.0 객체인경우 null로 초기화됨
        int total=0;

        for(int i=0,num=1;i<arr.length;i++){
            arr[i]=num++;
        }

        //처음부터끝까지 순회하는 향상된 for문
        for(int num:arr){//변수:배열
            total+=num;
        }

        System.out.println(total);
    }
}
