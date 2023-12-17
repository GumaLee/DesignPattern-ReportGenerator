package report.reportPart.cover.backCover;

public class BackCoverV1 extends BackCover {
    public BackCoverV1(String writerName, String writerPhoneNumber) {
        super(writerName, writerPhoneNumber);
    }

    @Override
    public void generate() {
        System.out.println("============ Back Cover Version 1 ============");
        System.out.println("Writer: " + writerName);
        System.out.println("Contact: " + writerPhoneNumber + "\n");
        System.out.println("=============================================\n");
    }

    @Override
    public double originalPrice() {
        return 1000.0;
    }
}


