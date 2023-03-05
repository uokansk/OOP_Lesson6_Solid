package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)6));
        items.add(new ReportItem("Second", (float)5));
    }

    public void output(Output report){
        report.output(items);
    }
}