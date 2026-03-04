package lab3.Q2;

public class EmailNotification implements INotification {
    private String message;

    public EmailNotification(String message){
        this.message = message;
    }

    @Override
    public void sent() {
        System.out.println(message);
    }
}
