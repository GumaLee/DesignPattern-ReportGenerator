package report.factory.cover;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.factory.ReportPartFactory;
import report.reportPart.ReportPart;
import report.reportPart.cover.backCover.BackCover;
import report.reportPart.cover.backCover.BackCoverV1;
import report.reportPart.cover.backCover.BackCoverV2;

public class BackCoverFactory implements ReportPartFactory {
    private int version;
    private String writerName;
    private String writerPhoneNumber;
    private Discount discount = new NoDiscount();

    public BackCoverFactory(int version, String writerName, String writerPhoneNumber) {
        this.version = version;
        this.writerName = writerName;
        this.writerPhoneNumber = writerPhoneNumber;
    }

    @Override
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public ReportPart createPart() {
        BackCover backCover;

        switch (version) {
            case 1:
                backCover = new BackCoverV1(writerName, writerPhoneNumber);
                backCover.setDiscount(discount);
                return backCover;
            case 2:
                backCover = new BackCoverV2(writerName, writerPhoneNumber);
                backCover.setDiscount(discount);
                return backCover;
            default:
                throw new IllegalArgumentException("올바른 버전이 아닙니다.");
        }
    }
}