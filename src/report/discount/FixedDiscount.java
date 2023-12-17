package report.discount;

public class FixedDiscount implements Discount {
    private double discountAmount;

    public FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice - discountAmount;
    }
}
