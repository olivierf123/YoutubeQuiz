package android.example.youtubequiz;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;

import java.util.Random;

import jp.wasabeef.blurry.Blurry;

public class SongGameActivity extends YouTubeBaseActivity {
    private YouTubePlayerView mYoutubePlayerView;
    private YouTubePlayer mYouTubePlayer;
    private YouTubePlayer.OnInitializedListener mOnInitializedListener;
    private Button startButton, btnEnglish, btnFrench,btnSpanish;

    private final String API_KEY = YoutubeConfig.getApiKey();

    //Create Hashmap videos
    YoutubeVideos youtubevideos = new YoutubeVideos();
    //Pick random video
    private String randomYoutubeVideo= (String) youtubevideos.getVideos().keySet().toArray()[new Random().nextInt(youtubevideos.getVideos().keySet().toArray().length)];

    //TODO METTRE YOUTUBE EN FRAGMENT ET LORSQUE RÉPONSE CORRECT OUVRIR UN AUTRE FRAGMENT AVEC NOM AUTEUR ETC.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_game);

        youTubePlayerInitialize();

        startButton = (Button) findViewById(R.id.click_to_start_button);
        btnEnglish = findViewById(R.id.english_button);
        btnFrench = findViewById(R.id.french_button);
        btnSpanish = findViewById(R.id.spanish_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        ////Remove video from HashMap
        youtubevideos.getVideos().remove(randomYoutubeVideo);

        //get a new video
        randomYoutubeVideo = (String) youtubevideos.getVideos().keySet().toArray()[new Random().nextInt(youtubevideos.getVideos().keySet().toArray().length)];
        mYouTubePlayer.loadVideo(randomYoutubeVideo);

            }
        });

        btnEnglish.setOnClickListener(v -> {

            if ((youtubevideos.getVideos().get(randomYoutubeVideo)).equals("English")){
                Toast.makeText(this, "Good answer ", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Bad answer ", Toast.LENGTH_SHORT).show();
            }
            });
    }

    private void youTubePlayerInitialize() {
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if(!b){
                    mYouTubePlayer =youTubePlayer;
                    mYouTubePlayer.loadVideo(randomYoutubeVideo);
                }
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        mYoutubePlayerView.initialize(API_KEY,mOnInitializedListener);
    }

    }