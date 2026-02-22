package CS31LAB3.Q5;

public interface MultiFunctionPrinter extends Fax, Printer, Scanner{
    void internetUpload(String doc);
}
