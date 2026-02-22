package CS31LAB3.Q7;

public class OutlookClient implements EmailSender{
    @Override
    public void send(String message) {
        System.out.println("sending via Outlook : " + message);
    }
}
