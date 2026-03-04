package lab4.Problem1;

public class MediaFactory {
    private VlcPlayer vlcPlayer;
    private Mp4Player mp4Player;

    public MediaFactory(String audioType) {
        if (audioType.equalsIgnoreCase("Vlc")) {
            vlcPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("Mp4")) {
            mp4Player = new Mp4Player();
        }
    }

    public void mediaPlay(String fileName){
        if(vlcPlayer != null){
            vlcPlayer.playVlc(fileName);
        } else if (mp4Player != null){
            mp4Player.playMp4(fileName);
        } else {
            System.out.println("Filetype is not supported.");
        }
    }

}
