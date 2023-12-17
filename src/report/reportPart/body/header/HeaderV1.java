package report.reportPart.body.header;

public class HeaderV1 extends Header {
    public HeaderV1(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("(Header Version 1) " + title + "\n");
    }

    @Override
    public double originalPrice() {
        return 100.0;
    }
}
