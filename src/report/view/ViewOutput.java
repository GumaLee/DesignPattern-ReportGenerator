package report.view;

public class ViewOutput {

    public static void askReportTitle() {
        System.out.print("<리포트의 제목>\n" + ": ");
    }

    public static void askReportContent() {
        System.out.print("<리포트 본문>\n" + ": ");
    }

    public static void askWriterName() {
        System.out.print("<리포트 작성자 이름>\n" + ": ");
    }

    public static void askWriterPhoneNumber() {
        System.out.print("<작성자 전화번호>\n" + ": ");
    }

    public static void askFrontCoverVersionOfReport() {
        System.out.println("생성할 앞 표지 버전을 입력하세요. (1 or 2)");
    }

    public static void askBackCoverVersionOfReport() {
        System.out.println("생성할 뒷 표지 버전을 입력하세요. (1 or 2)");
    }

    public static void askHeaderVersionOfReport() {
        System.out.println("생성할 머리말 버전을 입력하세요. (1 or 2)");
    }

    public static void askFooterVersionOfReport() {
        System.out.println("생성할 꼬리말 버전을 입력하세요. (1 or 2)");
    }
}
