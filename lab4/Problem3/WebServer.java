package lab4.Problem3;

public class WebServer {
    private String host;
    private int port;
    private boolean isSSL;
    private boolean isLogging;
    private int maxThreads;

    // Package-private constructor so only the Builder can instantiate it
    WebServer(String host, int port, boolean isSSL, boolean isLogging, int
            maxThreads) {
        this.host = host;
        this.port = port;
        this.isSSL = isSSL;
        this.isLogging = isLogging;
        this.maxThreads = maxThreads;
    }

    public void printStatus() {
        System.out.println("WebServer [Host=" + host + ", Port=" + port +
                ", SSL=" + ", MaxThreads=" + maxThreads + "]");
    }
}

