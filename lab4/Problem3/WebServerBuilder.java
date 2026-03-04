package lab4.Problem3;

public class WebServerBuilder {
    // Required parameters
    private String host;
    private int port;
    // Optional parameters with default values
    private boolean isSSL = false;
    private boolean isLogging = false;
    private int maxThreads = 10;

    public WebServerBuilder(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public WebServerBuilder enableSSL(boolean isSSL) {
        this.isSSL = isSSL;
        return this; // Return the builder itself for method chaining
    }

    public WebServerBuilder enableLogging(boolean isLogging) {
        this.isLogging = isLogging;
        return this;
    }

    public WebServerBuilder setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
        return this;
    }

    public WebServer build() {
        return new WebServer(host, port, isSSL, isLogging, maxThreads);
    }
}
