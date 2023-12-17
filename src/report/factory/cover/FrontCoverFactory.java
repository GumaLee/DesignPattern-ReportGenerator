package report.factory.cover;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.factory.ReportPartFactory;
import report.reportPart.ReportPart;
import report.reportPart.cover.frontCover.FrontCover;
import report.reportPart.cover.frontCover.FrontCoverV1;
import report.reportPart.cover.frontCover.FrontCoverV2;

public class FrontCoverFactory implements ReportPartFactory {
    private int version;
    private String title;
    private String writerName;

    private Discount discount = new NoDiscount();

    public FrontCoverFactory(int version, String title, String writerName) {
        this.version = version;
        this.title = title;
        this.writerName = writerName;
    }

    @Override
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public ReportPart createPart() {
        FrontCover frontCover;

        switch (version) {
            case 1:
                frontCover = new FrontCoverV1(title, writerName);
                frontCover.setDiscount(discount);
                return frontCover;
            case 2:
                frontCover = new FrontCoverV2(title, writerName);
                frontCover.setDiscount(discount);
                return frontCover;
            default:
                throw new IllegalArgumentException("올바른 버전이 아닙니다.");
        }
    }
}
