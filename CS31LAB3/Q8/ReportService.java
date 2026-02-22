package CS31LAB3.Q8;

public class ReportService {
    private final DataRepository database;

    public ReportService(DataRepository database){
        this.database = database;
    }

    public void generateReport(){
        String data = database.executeQuery("SELECT * FROM sales");
        System.out.println("Generating report with : " + data);
    }
}
