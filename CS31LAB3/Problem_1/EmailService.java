package CS31LAB3.Problem_1;

public class EmailService {

    private String smtpServer;
    private User user;
    public EmailService(User user, String smtpServer){
        this.user = user;
        this.smtpServer = smtpServer;
    }

    public void smtpConn(){
        System.out.println("Connecting to SMTP Server : " + smtpServer);
        SmtpSession smtp = new SmtpSession(user);
        String message = "Subject: Welcome! Body: Hello " + user.getName();
        smtp.SEND(message);
        smtp.LOGOUT();
    }
}
