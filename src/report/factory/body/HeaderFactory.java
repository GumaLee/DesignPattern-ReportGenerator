package report.factory.body;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.factory.ReportPartFactory;
import report.reportPart.ReportPart;
import report.reportPart.body.header.Header;
import report.reportPart.body.header.HeaderV1;
import report.reportPart.body.header.HeaderV2;

public class HeaderFactory implements ReportPartFactory {
    private int version;
    private String title;
    private Discount discount = new NoDiscount();

    public HeaderFactory(int version, String title) {
        this.version = version;
        this.title = title;
    }

    @Override
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public ReportPart createPart() {
        Header header;

        switch (version) {
            case 1:
                header = new HeaderV1(title);
                header.setDiscount(discount);
                return header;
            case 2:
                header = new HeaderV2(title);
                header.setDiscount(discount);
                return header;
            default:
                throw new IllegalArgumentException("올바른 버전이 아닙니다.");
        }
    }
}
