package report.reportPart.cover.backCover;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.reportPart.ReportPart;

public abstract class BackCover implements ReportPart {
    protected final String writerName;
    protected final String writerPhoneNumber;
    protected Discount discount = new NoDiscount();

    public BackCover(String writerName, String writerPhoneNumber) {
        this.writerName = writerName;
        this.writerPhoneNumber = writerPhoneNumber;
    }

    @Override
    public double getPrice() {
        return discount.applyDiscount(originalPrice());
    }

    /*
    연관 메서드
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public abstract double originalPrice();
}
