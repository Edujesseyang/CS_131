package lab3.Q5;

public class SimplePrinter implements Printer{
    public SimplePrinter(){

    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
