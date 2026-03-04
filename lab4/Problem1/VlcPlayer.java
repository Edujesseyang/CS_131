package lab4.Problem1;

public class VlcPlayer implements IVlcPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc file : " + fileName);
    }
}
