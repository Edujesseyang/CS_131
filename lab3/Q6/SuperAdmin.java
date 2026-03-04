package lab3.Q6;

public class SuperAdmin implements Readable, Commentable, AdminWritable{
    public SuperAdmin(){

    }

    @Override
    public void modifySystem() {
        System.out.println("Changing server setting... ");
    }

    @Override
    public void comment() {
        System.out.println("Commenting... ");
    }

    @Override
    public void view() {
        System.out.println("Viewing... ");
    }

    @Override
    public void deleteUser() {
        System.out.println("Deleting user... ");
    }
}
