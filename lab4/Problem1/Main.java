package lab4.Problem1;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("vlc", "sound_track_1.vlc");
        player.play("mp4", "sound_track_2.mp4");
        player.play("mp3", "sound_track_3.mp3");
        player.play("avi", "sound_track_4.avi");
    }
}
