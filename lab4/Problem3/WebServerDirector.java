package lab4.Problem3;

public class WebServerDirector {
    public WebServerDirector(){
    }

    public WebServer buildProductionServer(WebServerBuilder builder) {
        return builder.enableSSL(true)
                .enableLogging(true)
                .setMaxThreads(500)
                .build();
    }

    public WebServer buildTestServer(WebServerBuilder builder) {
        return builder.enableSSL(false).enableLogging(true)
                .setMaxThreads(10)
                .build();
    }

}
