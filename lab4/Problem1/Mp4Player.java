package lab4.Problem1;

public class Mp4Player implements IMp4Player {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file : " + fileName);
    }
}
