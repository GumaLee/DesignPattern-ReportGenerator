package report.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static report.view.ViewOutput.*;

public class ViewInput {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*
    레포트 데이터 입력
     */
    public static String reportTitleInput() throws IOException {
        askReportTitle();
        return br.readLine();
    }

    public static String reportContentInput() throws IOException {
        askReportContent();
//        List<String> contents = new ArrayList<>();
//
//        String content = br.readLine();
//
//        int beginIndex = 0;
//        int lastIndex = 39;
//
//        while(lastIndex < content.length()) {
//            if(lastIndex - beginIndex < 41) {
//                contents.add(content.substring(beginIndex));
//                break;
//            }
//            contents.add(content.substring(beginIndex, lastIndex));
//            beginIndex += 40;
//            lastIndex += 40;
//        }

        return br.readLine();
    }

    public static String writerNameInput() throws IOException {
        askWriterName();
        return br.readLine();
    }

    public static String writerPhoneNumberInput() throws IOException {
        askWriterPhoneNumber();
        return br.readLine();
    }

    /*
    버전 입력
     */
    public static int frontCoverVersionInput() throws IOException {
        askFrontCoverVersionOfReport();
        return Integer.parseInt(br.readLine());
    }

    public static int backCoverVersionInput() throws IOException {
        askBackCoverVersionOfReport();
        return Integer.parseInt(br.readLine());
    }

    public static int headerVersionInput() throws IOException {
        askHeaderVersionOfReport();
        return Integer.parseInt(br.readLine());
    }

    public static int footerVersionInput() throws IOException {
        askFooterVersionOfReport();
        return Integer.parseInt(br.readLine());
    }
}
