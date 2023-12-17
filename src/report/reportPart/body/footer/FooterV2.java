package report.reportPart.body.footer;

public class FooterV2 extends Footer{
    public FooterV2(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("(Footer Version 2)" + java.time.LocalDateTime.now() + "\t" + title);
    }

    @Override
    public double originalPrice() {
        return 200.0;
    }
}
