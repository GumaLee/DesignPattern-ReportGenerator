package report.discount;

public class PercentageDiscount implements Discount {
    private double discountPercentage;

    public PercentageDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice - (originalPrice * discountPercentage / 100.0);
    }
}
