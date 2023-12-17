package report.generator;

import report.command.Command;
import report.command.GeneratePartCommand;
import report.reportPart.ReportPart;

import java.util.List;

public class ReportGenerator {
    private final List<Command> commands;

    public ReportGenerator(List<Command> commands) {
        this.commands = commands;
    }

    public Report generateReport() {
        for (Command command : commands) {
            command.execute();
        }

        ReportPart frontCover = ((GeneratePartCommand) commands.get(0)).getPart();
        ReportPart body = ((GeneratePartCommand) commands.get(1)).getPart();
        ReportPart backCover = ((GeneratePartCommand) commands.get(2)).getPart();

        return new Report(frontCover, body, backCover);
    }
}
