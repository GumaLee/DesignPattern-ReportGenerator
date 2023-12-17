package report.generator;

import report.reportPart.ReportPart;

public class Report {
    private ReportPart frontCover;
    private ReportPart body;
    private ReportPart backCover;

    public Report(ReportPart frontCover, ReportPart body, ReportPart backCover) {
        this.frontCover = frontCover;
        this.body = body;
        this.backCover = backCover;
    }

    public double getTotalPrice() {
        return frontCover.getPrice() + body.getPrice() + backCover.getPrice();
    }
}
