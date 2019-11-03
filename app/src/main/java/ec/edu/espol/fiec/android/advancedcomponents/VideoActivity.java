package ec.edu.espol.fiec.android.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = findViewById(R.id.VIDEO);

        Uri url = Uri.parse("https://storage.googleapis.com/webfundamentals-assets/videos/chrome.mp4");

        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(url);
        videoView.requestFocus();
        videoView.start();
    }
}
