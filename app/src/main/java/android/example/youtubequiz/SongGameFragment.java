package android.example.youtubequiz;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.PlayerUiController;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class SongGameFragment extends Fragment {

    private YouTubePlayerView youtubePlayerView;
    private Button btnEnglish, btnFrench, btnSpanish, btnPositiveNextQuestion, btnNegativeNextQuestion;
    private PlayerUiController playerUiController;
    private TextView titleTv, messageTv;
    private YouTubePlayerView youtubeplayer;
    private Dialog epicDialog;
    private String randomVid = (String) YoutubeVideos.youtubevideos.getVideos().keySet().toArray()[new Random().nextInt(YoutubeVideos.youtubevideos.getVideos().keySet().toArray().length)];

    public SongGameFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_song_game, container, false);
        youtubeplayer = (YouTubePlayerView) view.findViewById(R.id.youtube_player_view);
        btnEnglish = (Button) view.findViewById(R.id.english_button);
        btnFrench = (Button) view.findViewById(R.id.french_button);
        btnSpanish = (Button) view.findViewById(R.id.spanish_button);

        //Create epicdialog (wrong/right answer)
        epicDialog = new Dialog(getActivity());

        initYouTubePlayerView();

        btnEnglish.setOnClickListener(v -> {

             if (YoutubeVideos.youtubevideos.getVideos().get(randomVid).equals("English")) {
                 showPositivePopup();
                 PlayerModel.addrightAnswers();
             }else {
                 PlayerLosingLives(); // Player loses a life and looks if player lost the game
                 PlayerModel.addWrongAnswers();
             }
        });

        btnFrench.setOnClickListener(v -> {
            if (YoutubeVideos.youtubevideos.getVideos().get(randomVid).equals("French")){
                showPositivePopup();
                PlayerModel.addrightAnswers();

            }else{
                PlayerLosingLives(); // Player loses a life and looks if player lost the game
                PlayerModel.addWrongAnswers();
            }

        });

        btnSpanish.setOnClickListener(v -> {
            if (YoutubeVideos.youtubevideos.getVideos().get(randomVid).equals("Spanish")){
                showPositivePopup();
                PlayerModel.addrightAnswers();

            }else{
               PlayerLosingLives(); // Player loses a life and looks if player lost the game
                PlayerModel.addWrongAnswers();
            }

        });
       return view;

    }

    private void initYouTubePlayerView() {
        getLifecycle().addObserver(youtubeplayer);
        youtubeplayer.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                YouTubePlayerUtils.loadOrCueVideo(
                        youTubePlayer, getLifecycle(),
                       randomVid,0f
                );
            }
        });
    }

    public void setNextFragment(Fragment fragment){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.song_game_FLFragment,fragment,"Fragment1");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void showPositivePopup(){
        epicDialog.setContentView(R.layout.epic_popup_positive);
        btnPositiveNextQuestion = (Button) epicDialog.findViewById(R.id.btnPositiveNextQuestion);
        titleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        messageTv = (TextView) epicDialog.findViewById(R.id.messageTv);

        btnPositiveNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set new fragment to go to next question
                setNextFragment(new SongGameFragment());
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();

    }

    public void showNegativePopup(){
        epicDialog.setContentView(R.layout.epic_popup_negative);
        btnNegativeNextQuestion = (Button) epicDialog.findViewById(R.id.btnNegativeNextQuestion);
        titleTv = (TextView) epicDialog.findViewById(R.id.titleTv);
        messageTv = (TextView) epicDialog.findViewById(R.id.messageTv);

        btnNegativeNextQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set new fragment to go to next question
                setNextFragment(new SongGameFragment());
                epicDialog.dismiss();
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();

    }

    public void PlayerLosingLives() {
        if (PlayerModel.getNumberOfLives() > 1) {
            int lives = PlayerModel.getNumberOfLives();
            PlayerModel.setNumberOfLives(lives-1);
            showNegativePopup();
        } else {
            setScoreScreenFragment();
        }
    }

    public void setScoreScreenFragment(){
        Fragment scoreScreenFragment = new ScoreScreenFragment();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.song_game_FLFragment, scoreScreenFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

}



