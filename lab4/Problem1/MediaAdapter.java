package lab4.Problem1;

public class MediaAdapter implements IMediaPlayer {
    private MediaFactory factory;

    public MediaAdapter(String audioType){
        this.factory = new MediaFactory(audioType);
    }

    @Override
    public void play(String audioType, String fileName) {
        factory.mediaPlay(fileName);
    }
}
