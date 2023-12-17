package report.reportPart.cover.frontCover;

public class FrontCoverV1 extends FrontCover {
    public FrontCoverV1(String title, String writerName) {
        super(title, writerName);
    }

    @Override
    public void generate() {
        System.out.println("=========== Front Cover Version 1 ===========");
        System.out.println("Title: " + title);
        System.out.println("Writer: " + writerName);
        System.out.println("=============================================\n\n");
    }

    @Override
    public double originalPrice() {
        return 1000.0;
    }
}
