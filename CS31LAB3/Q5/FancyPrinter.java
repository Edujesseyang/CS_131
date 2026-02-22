package CS31LAB3.Q5;

public class FancyPrinter implements MultiFunctionPrinter {
    public FancyPrinter(){

    }

    @Override
    public void internetUpload(String doc) {
        System.out.println("uploading to cloud : " + doc);
    }

    @Override
    public void Fax(String doc) {
        System.out.println("Faxing document :" + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing document : " + doc);
    }

    @Override
    public void scan(String doc) {
        System.out.println("Scanning document : " + doc);
        ;
    }
}
