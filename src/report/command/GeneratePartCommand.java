package report.command;

import report.factory.ReportPartFactory;
import report.reportPart.ReportPart;

public class GeneratePartCommand implements Command {
    private final ReportPartFactory factory;
    private ReportPart part;

    public GeneratePartCommand(ReportPartFactory factory) {
        this.factory = factory;
    }

    @Override
    public void execute() {
        if (part == null) {
            part = factory.createPart();
        }
        part.generate();
    }

    public ReportPart getPart() {
        return part;
    }
}
