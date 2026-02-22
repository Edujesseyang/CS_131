package CS31LAB3.Q7;

public class PasswordResetService {
    private final EmailSender client;
    public PasswordResetService(EmailSender client){
       this.client =client;
    }

    public void reset(String email){
        client.send(email + "Your new password is ...");
    }
}
