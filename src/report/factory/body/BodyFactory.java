package report.factory.body;

import report.discount.Discount;
import report.factory.ReportPartFactory;
import report.reportPart.body.Body;
import report.reportPart.ReportPart;

public class BodyFactory implements ReportPartFactory {
    private final ReportPartFactory headerFactory;
    private final String content;
    private final ReportPartFactory footerFactory;

    public BodyFactory(ReportPartFactory headerFactory, String content, ReportPartFactory footerFactory) {
        this.headerFactory = headerFactory;
        this.content = content;
        this.footerFactory = footerFactory;
    }

    @Override
    public void setDiscount(Discount discount) {}

    @Override
    public ReportPart createPart() {
        return new Body(headerFactory.createPart(), content, footerFactory.createPart());
    }
}
