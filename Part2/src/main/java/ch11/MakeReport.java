package ch11;

/**
 * 캡슐화: 사용자는 MakeReport클래스의 makeHeader,generateBody,makeFooter을 직접호출할 필요가없음
 * 공개된 getReport호출 한번으로 나머지 메소드를 자동호출함 이런식으로 사용자가 불필요한 접근이나 올바르지
 * 않은 접근을 제어하는 방식을 캡슐화라고 함 요약하면 공개정보와 비공개정보를 관리하는것 */
public class MakeReport {
    StringBuffer buffer = new StringBuffer();

    private String line = "===========================================\n";
    private String title = "  이름\t   주소 \t\t  전화번호  \n";
    private void makeHeader()
    {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody()
    {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0987\n");
    }

    private void makeFooter()
    {

        buffer.append(line);
    }

    public String getReport()
    {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}
