package lab3.Q1;

import lab3.Q2.INotification;
import lab3.Q2.SMSNotification;

public class UserService {
    private final String DB_URL = "jdbc:mysql://localhost:3306/mydb"; // generated
    private final String SMTP_SERVER = "smtp.gmail.com";
    private final String NOTICE_MESSAGE = "User registered and email sent!";

    public void registerUser(String username, String email) throws Exception {
        if(!email.contains("@")){
            throw new Exception("Invalid Email");
        }

        User newUser = new User(username, email);
        UserRepository userRepo = new UserRepository(newUser, DB_URL);
        EmailService emailService = new EmailService(newUser, SMTP_SERVER);
        System.out.println("User registered and email sent!");
        INotification notification = new SMSNotification(NOTICE_MESSAGE);
        notifyUser(notification);

    }

    public void notifyUser(INotification notification){
        notification.sent();
    }
}
