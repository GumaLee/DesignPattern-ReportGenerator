package report.reportPart.cover.frontCover;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.reportPart.ReportPart;

public abstract class FrontCover implements ReportPart {
    protected final String title;
    protected final String writerName;
    protected Discount discount = new NoDiscount();

    public FrontCover(String title, String writerName) {
        this.title = title;
        this.writerName = writerName;
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
