package report.reportPart.body.header;

public class HeaderV2 extends Header{
    public HeaderV2(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("(Header Version 2) " + title + "\n");
    }

    @Override
    public double originalPrice() {
        return 200.0;
    }
}
