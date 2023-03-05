package solid;

import solid.dip.DisplayReport;
import solid.dip.Output;
import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        Output disRep = new DisplayReport();
        Output printRep = new PrintReport();
        report.calculate();
        report.output(printRep);
        report.output(disRep);
    }

}
