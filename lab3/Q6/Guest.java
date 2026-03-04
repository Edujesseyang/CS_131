package lab3.Q6;

public class Guest implements Readable{

    public Guest(){
    }

    @Override
    public void deleteUser() {
        System.out.println("Deleting user...");
    }

    @Override
    public void view(){
        System.out.println("Viewing content...");
    }
}
