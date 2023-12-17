package report.reportPart.cover.frontCover;

public class FrontCoverV2 extends FrontCover {
    public FrontCoverV2(String title, String writerName) {
        super(title, writerName);
    }

    @Override
    public void generate() {
        System.out.println("=========== Front Cover Version 2 ===========");
        System.out.println("Title: " + title);
        System.out.println("Writer: " + writerName);
        System.out.println("=============================================\n\n");
    }

    @Override
    public double originalPrice() {
        return 2000.0;
    }
}
