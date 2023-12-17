package report.factory;

import report.discount.Discount;
import report.reportPart.ReportPart;

public interface ReportPartFactory {
    void setDiscount(Discount discount);
    ReportPart createPart();
}
