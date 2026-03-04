package lab3.Q7;

public class GmailClient implements EmailSender{
    @Override
    public void send(String message) {
        System.out.println("Sending via g-mail API : " + message);
    }
}
