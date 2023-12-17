package report.reportPart.body.header;

import report.discount.Discount;
import report.discount.NoDiscount;
import report.reportPart.ReportPart;

public abstract class Header implements ReportPart {
    protected final String title;
    protected Discount discount = new NoDiscount();

    public Header(String title) {
        this.title = title;
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
