package report.factory.body;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.factory.ReportPartFactory;
import report.reportPart.ReportPart;
import report.reportPart.body.footer.Footer;
import report.reportPart.body.footer.FooterV1;
import report.reportPart.body.footer.FooterV2;

public class FooterFactory implements ReportPartFactory {
    private int version;
    private final String title;
    private Discount discount = new NoDiscount();

    public FooterFactory(int version, String title) {
        this.version = version;
        this.title = title;
    }

    @Override
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public ReportPart createPart() {
        Footer footer;

        switch (version) {
            case 1:
                footer = new FooterV1(title);
                footer.setDiscount(discount);
                return footer;
            case 2:
                footer = new FooterV2(title);
                footer.setDiscount(discount);
                return footer;
            default:
                throw new IllegalArgumentException("올바른 버전이 아닙니다.");
        }
    }
}
