package lab4.Problem3;

public class main {
    public static void main(String[] args) {
        WebServerBuilder b1 = new WebServerBuilder("prod.myapp.com", 433);
        WebServerBuilder b2 = new WebServerBuilder("localhost", 8080);
        WebServerDirector d = new WebServerDirector();
        WebServer w1 = d.buildProductionServer(b1);
        w1.printStatus();
        WebServer w2 = d.buildTestServer(b2);
        w2.printStatus();
    }
}
