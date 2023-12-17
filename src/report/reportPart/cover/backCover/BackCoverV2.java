package report.reportPart.cover.backCover;

public class BackCoverV2 extends BackCover {
    public BackCoverV2(String writerName, String writerPhoneNumber) {
        super(writerName, writerPhoneNumber);
    }

    @Override
    public void generate() {
        System.out.println("============ Back Cover Version 2 ============");
        System.out.println("Writer: " + writerName);
        System.out.println("Contact: " + writerPhoneNumber + "\n");
        System.out.println("=============================================\n");
    }

    @Override
    public double originalPrice() {
        return 2000.0;
    }
}
