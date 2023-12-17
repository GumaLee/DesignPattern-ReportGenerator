package report.reportPart.body;

import report.reportPart.ReportPart;

public class Body implements ReportPart {
    private final ReportPart header;
    private final String content;
    private final ReportPart footer;

    public Body(ReportPart header, String content, ReportPart footer) {
        this.header = header;
        this.content = content;
        this.footer = footer;
    }

    @Override
    public void generate() {
        System.out.println("=================== Body ====================");
        header.generate();
        System.out.println("Content: " + content + "\n");
        footer.generate();
        System.out.println("=============================================\n\n");
    }

    @Override
    public double getPrice() {
        return header.getPrice() + footer.getPrice();
    }

    @Override
    public double originalPrice() {
        return header.originalPrice() + footer.originalPrice();
    }
}
