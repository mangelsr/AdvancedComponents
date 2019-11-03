package ec.edu.espol.fiec.android.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView= (VideoView) findViewById(R.id.VIDEO);

        Uri url = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");

        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(url);
        videoView.requestFocus();
        videoView.start();
    }
}
