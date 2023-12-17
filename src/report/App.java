package report;

import report.command.Command;
import report.command.GeneratePartCommand;
import report.discount.Discount;
import report.discount.FixedDiscount;
import report.discount.PercentageDiscount;
import report.factory.*;
import report.factory.body.BodyFactory;
import report.factory.body.FooterFactory;
import report.factory.body.HeaderFactory;
import report.factory.cover.BackCoverFactory;
import report.factory.cover.FrontCoverFactory;
import report.generator.Report;
import report.generator.ReportGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static report.view.ViewInput.*;

public class App {

    public static void main(String[] args) throws IOException {
        // 사용자로부터 입력 받기
        String title = reportTitleInput();
        String writerName = writerNameInput();
        String writerPhoneNumber = writerPhoneNumberInput();
        String content = reportContentInput();

        // 버전 입력 받기
        int frontCoverVersion = frontCoverVersionInput();
        int backCoverVersion = backCoverVersionInput();
        int headerVersion = headerVersionInput();
        int footerVersion = footerVersionInput();

        // 팩토리 생성
        ReportPartFactory frontCoverFactory = new FrontCoverFactory(frontCoverVersion, title, writerName);
        ReportPartFactory headerFactory = new HeaderFactory(headerVersion, title);
        ReportPartFactory footerFactory = new FooterFactory(footerVersion, title);
        ReportPartFactory bodyFactory = new BodyFactory(headerFactory, content, footerFactory);
        ReportPartFactory backCoverFactory = new BackCoverFactory(backCoverVersion, writerName, writerPhoneNumber);

        // 할인 생성
        Discount frontCoverDiscount = new PercentageDiscount(20.0);
        Discount backCoverDiscount = new FixedDiscount(10.0);
        Discount headerDiscount = new PercentageDiscount(50.0);
        Discount footerDiscount = new FixedDiscount(20.0);

        // 할인 지정
        frontCoverFactory.setDiscount(frontCoverDiscount);
        backCoverFactory.setDiscount(backCoverDiscount);
        headerFactory.setDiscount(headerDiscount);
        footerFactory.setDiscount(footerDiscount);

        // 커맨드 생성
        Command frontCoverCommand = new GeneratePartCommand(frontCoverFactory);
        Command bodyCommand = new GeneratePartCommand(bodyFactory);
        Command backCoverCommand = new GeneratePartCommand(backCoverFactory);

        // 커맨드 리스트 생성
        List<Command> commands = new ArrayList<>();
        commands.add(frontCoverCommand);
        commands.add(bodyCommand);
        commands.add(backCoverCommand);

        // 레포트 생성
        ReportGenerator reportGenerator = new ReportGenerator(commands);
        Report report = reportGenerator.generateReport();

        System.out.println("할인 된 총 가격: " + report.getTotalPrice());
    }
}
