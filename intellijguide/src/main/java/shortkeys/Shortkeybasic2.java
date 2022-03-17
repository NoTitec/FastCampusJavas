package shortkeys;

import java.util.List;

//기능찾기
//shift+ctral+a
public class Shortkeybasic2 implements Sampleinterface {
    //라이브템플릿 ctal+j

    //psvm

    //getter,setter 등 코드생성 alt+ins
    private String name;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        //sout
        System.out.println("ddd");
        //퀵픽스 alt+enter
        List<String> list;

        //코드이슈별로 이동 f2,shift+f2

        //import 최적화 ctrl+alt+o

        //터미널 창 alt+f12

        //구문완성 shift+ctrl+enter

        //대체하기 특정 단어찾아서 바꾸는 기능
        /* 파일내 ctrl+R
            패키지내 ctrl+shift+R
         */

        //run anything
        //ctrl2번

        //프로그램 종료 ctrl+f2

        //현재줄복사 ctrl+d

        //현재줄 삭제 ctrl+y

        //파라미터정보 ctrl+p

        //메소드 quick definition 메소드 선언부 미리보기
        //ctrl+shift+i

        //설명 미리보기
        //ctrl+q
    }

    //override 생성 ctrl+i
    @Override
    public void wawawawa() {

    }

    public int me1(){
        //Java Doc 자동생성 메소드 시작지점에 /**하고 enter
/**
 *
 */
        return 0;
    }
}
