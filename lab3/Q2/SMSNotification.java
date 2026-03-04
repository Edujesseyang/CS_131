package lab3.Q2;

public class SMSNotification implements INotification {
    private String message;
    public SMSNotification(String message){
        this.message = message;
    }

    @Override
    public void sent() {
        System.out.println(message);
    }
}
