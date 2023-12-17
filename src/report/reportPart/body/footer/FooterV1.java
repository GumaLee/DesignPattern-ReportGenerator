package report.reportPart.body.footer;

public class FooterV1 extends Footer{
    public FooterV1(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("(Footer Version 1)" + java.time.LocalDateTime.now() + "\t" + title);
    }

    @Override
    public double originalPrice() {
        return 100.0;
    }
}
