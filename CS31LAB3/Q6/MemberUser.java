package CS31LAB3.Q6;

public class MemberUser implements Commentable, Readable{
    public MemberUser(){

    }

    @Override
    public void comment() {
        System.out.println("I am leaving a review...");
    }

    @Override
    public void view() {
        System.out.println("I am reading...");
    }

    @Override
    public void deleteUser() {
        System.out.println("Deleting user...");
    }
}
