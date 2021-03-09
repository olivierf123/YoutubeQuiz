package android.example.youtubequiz;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SongGameFragment extends Fragment {

    private YouTubePlayerView youtubePlayerView;
    private Button btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4,btnAnswer5,
            btnPositiveNextQuestion, btnNegativeNextQuestion;
    private PlayerUiController playerUiController;
    private TextView titleTv, messageTv;
    private YouTubePlayerView youtubeplayer;
    private Dialog epicDialog;
    private String randomVid ;
    private String difficultyFromIntent;
    private ArrayList<String> easyList;
    private ArrayList<String> mediumList;
    private ArrayList<String> hardList;
    private int numberFamily = 1;

    //TODO a la place du total score pour le player, mettre le Highest score dans une game pour le leadeboard.

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


        //Create epicdialog (wrong/right answer)
        epicDialog = new Dialog(getActivity());

        initYouTubePlayerView();
        //randomVid = (String) YoutubeVideos.youtubevideos.getVideos().keySet().toArray()[new Random().nextInt(YoutubeVideos.youtubevideos.getVideos().keySet().toArray().length)];


        //Set buttons
        btnAnswer1 = (Button) view.findViewById(R.id.Button1_answer);
        btnAnswer2 = (Button) view.findViewById(R.id.Button2_answer);
        btnAnswer3 = (Button) view.findViewById(R.id.Button3_answer);
        btnAnswer5 = (Button) view.findViewById(R.id.Button5_answer);
        btnAnswer4 = (Button) view.findViewById(R.id.Button4_answer);

        //Making Lists
        easyList = new ArrayList<>();
        mediumList = new ArrayList<>();
        hardList = new ArrayList<>();


        //If game difficulty is set to Easy
       if (DifficultyModel.getDifficultyGame().equals("easy")){
           //Get a random vid from the easyList
           easyList = getEasyList(YoutubeVideos.youtubevideos.getVideos());
           Random rand = new Random();
           randomVid = easyList.get(rand.nextInt(easyList.size()));

       }

       //If game difficulty is set to Medium
        if (DifficultyModel.getDifficultyGame().equals("medium")){
            //Get a random vid from the easyList
            mediumList = getMediumList(YoutubeVideos.youtubevideos.getVideos());
            Random rand = new Random();
            randomVid = mediumList.get(rand.nextInt(mediumList.size()));

        }

        //If game difficulty is set to Hard
        if (DifficultyModel.getDifficultyGame().equals("hard")){
           hardList = getHardList(YoutubeVideos.youtubevideos.getVideos());
           Random rand = new Random();
           randomVid = hardList.get(rand.nextInt(hardList.size()));

        }

        /***
         * Easy Difficulty
         */

        // EASY MODE : 3 languages choices

        if(DifficultyModel.getDifficultyGame().equals("easy")){

            //Hide button 4 and 5
            btnAnswer5.setVisibility(view.GONE);
            btnAnswer4.setVisibility(view.GONE);

            //Create a List of easy languages (English, french, spanish, arabe, japonais, allemand, russe)
            ArrayList<String> pickEasyLanguage = new ArrayList<>();
            pickEasyLanguage.add("English");
            pickEasyLanguage.add("French");
            pickEasyLanguage.add("Spanish");
            pickEasyLanguage.add("Arabic");
            pickEasyLanguage.add("Japanese");
            pickEasyLanguage.add("German");
            pickEasyLanguage.add("Russian");

            //returns the language of the random video
            String randomVidLanguage = YoutubeVideos.youtubevideos.getVideos().get(randomVid);

            //Set answer language in a random button between the 3 answer buttons
            Random rand = new Random();
            int randButton = rand.nextInt((3-1)+1) + 1;
            if (randButton == 1){
                btnAnswer1.setText(randomVidLanguage);
            }else if (randButton == 2){
                btnAnswer2.setText(randomVidLanguage);
            }else if (randButton == 3){
                btnAnswer3.setText(randomVidLanguage);
            }

            //Get 2 other random languages for the 2 other buttons
            Random rand2 = new Random();
            String randomLanguage = pickEasyLanguage.get(rand2.nextInt(pickEasyLanguage.size()));
            //While loop to make sure it's not the same language that is randomized
            while (randomLanguage.equals(randomVidLanguage)){
                randomLanguage = pickEasyLanguage.get(rand2.nextInt(pickEasyLanguage.size()));
            }
            String randomLanguage2 = pickEasyLanguage.get(rand2.nextInt(pickEasyLanguage.size()));
            while (randomLanguage2.equals(randomVidLanguage) | randomLanguage2.equals(randomLanguage)){
                randomLanguage2 = pickEasyLanguage.get(rand2.nextInt(pickEasyLanguage.size()));
            }

            //Set the random selected languages to the buttons
            if ((btnAnswer1.getText().equals(randomVidLanguage))){
                btnAnswer2.setText(randomLanguage);
                btnAnswer3.setText(randomLanguage2);
            }else if (btnAnswer2.getText().equals(randomVidLanguage)){
                btnAnswer1.setText(randomLanguage);
                btnAnswer3.setText(randomLanguage2);
            }else if (btnAnswer3.getText().equals(randomVidLanguage)){
                btnAnswer1.setText(randomLanguage);
                btnAnswer2.setText(randomLanguage2);
            }


            btnAnswer1.setOnClickListener(v -> {

                if (randomVidLanguage.equals(btnAnswer1.getText())) {
                    showPositivePopup();
                    PlayerModel.addrightAnswers();
                }else {
                    PlayerLosingLives(); // Player loses a life and looks if player lost the game
                    PlayerModel.addWrongAnswers();
                }
            });


            btnAnswer2.setOnClickListener(v -> {
                if (randomVidLanguage.equals(btnAnswer2.getText())){
                    showPositivePopup();
                    PlayerModel.addrightAnswers();

                }else{
                    PlayerLosingLives(); // Player loses a life and looks if player lost the game
                    PlayerModel.addWrongAnswers();
                }

            });

            btnAnswer3.setOnClickListener(v -> {
                if (randomVidLanguage.equals(btnAnswer3.getText())){
                    showPositivePopup();
                    PlayerModel.addrightAnswers();

                }else{
                    PlayerLosingLives(); // Player loses a life and looks if player lost the game
                    PlayerModel.addWrongAnswers();
                }

            });
        }

        /***
         * Medium Difficulty (1 random language from each language family list
         */

        if(DifficultyModel.getDifficultyGame().equals("medium")){
             btnAnswer5.setVisibility(view.GONE);

            //returns the language of the random video
            String randomVidLanguage = YoutubeVideos.youtubevideos.getVideos().get(randomVid);


            //Set answer language in a random button between the 4 answer buttons
            Random rand = new Random();
            int randButton = rand.nextInt((4-1)+1) + 1;
            if (randButton == 1){
                btnAnswer1.setText(randomVidLanguage);
            }else if (randButton == 2){
                btnAnswer2.setText(randomVidLanguage);
            }else if (randButton == 3){
                btnAnswer3.setText(randomVidLanguage);
            }else if (randButton == 4) {
                btnAnswer4.setText(randomVidLanguage);
            }

            //Get 3 other random languages for the 3 other buttons
            Random rand2 = new Random();
            String randomLanguage = YoutubeVideos.youtubevideos.getAllLanguages().
                    get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));

            //While loop to make sure it's not the same language that is randomized
            while (randomLanguage.equals(randomVidLanguage)){
                randomLanguage = YoutubeVideos.youtubevideos.getAllLanguages().
                        get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));
            }

            String randomLanguage2 = YoutubeVideos.youtubevideos.getAllLanguages().
                    get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));

            while (randomLanguage2.equals(randomVidLanguage) | randomLanguage2.equals(randomLanguage)){
                randomLanguage2 = YoutubeVideos.youtubevideos.
                        getAllLanguages().get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));
            }

            String randomLanguage3 = YoutubeVideos.youtubevideos.getAllLanguages().get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));

            while (randomLanguage3.equals(randomVidLanguage) | randomLanguage3.equals(randomLanguage) | randomLanguage3.equals(randomLanguage2)){
                randomLanguage3 = YoutubeVideos.youtubevideos.
                        getAllLanguages().get(rand2.nextInt(YoutubeVideos.youtubevideos.getAllLanguages().size()));

            }

            //Set the random selected languages to the buttons
            if ((btnAnswer1.getText().equals(randomVidLanguage))){
                btnAnswer2.setText(randomLanguage);
                btnAnswer3.setText(randomLanguage2);
                btnAnswer4.setText(randomLanguage3);
            }else if (btnAnswer2.getText().equals(randomVidLanguage)){
                btnAnswer1.setText(randomLanguage);
                btnAnswer3.setText(randomLanguage2);
                btnAnswer4.setText(randomLanguage3);
            }else if (btnAnswer3.getText().equals(randomVidLanguage)){
                btnAnswer1.setText(randomLanguage);
                btnAnswer2.setText(randomLanguage2);
                btnAnswer4.setText(randomLanguage3);
            }else if (btnAnswer4.getText().equals(randomVidLanguage)){
                btnAnswer1.setText(randomLanguage);
                btnAnswer2.setText(randomLanguage2);
                btnAnswer3.setText(randomLanguage3);

            }

                btnAnswer1.setOnClickListener(v -> {

                    if (randomVidLanguage.equals(btnAnswer1.getText())) {
                        showPositivePopup();
                        PlayerModel.addrightAnswers();
                    }else {
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }
                });


                btnAnswer2.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer2.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }

                });

                btnAnswer3.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer3.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }

                });

                btnAnswer4.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer4.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }


                });

            }

        /***
         * Hard Difficulty
         */

            if(DifficultyModel.getDifficultyGame().equals("hard")){
                //TODO HARD MODE : 5 langues, même family de langues

                Random rand2 = new Random();

                //Create a List of hard languages (from the random family)
                ArrayList<String> pickHardLanguages = new ArrayList<>();
                switch(numberFamily){
                    case 1 :
                        pickHardLanguages = YoutubeVideos.youtubevideos.getFamily1();
                        break;
                    case 2:
                        pickHardLanguages = YoutubeVideos.youtubevideos.getFamily2();
                        break;
                    case 3:
                        pickHardLanguages = YoutubeVideos.youtubevideos.getFamily3();
                        break;
                    case 4:
                        pickHardLanguages = YoutubeVideos.youtubevideos.getFamily4();
                        break;
                }

                //returns the language of the random video
                String randomVidLanguage = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                //Set answer language in a random button between the 5 answer buttons
                Random rand = new Random();
                int randButton = rand.nextInt((5-1)+1) + 1;
                if (randButton == 1){
                    btnAnswer1.setText(randomVidLanguage);
                }else if (randButton == 2){
                    btnAnswer2.setText(randomVidLanguage);
                }else if (randButton == 3){
                    btnAnswer3.setText(randomVidLanguage);
                }else if (randButton == 4) {
                    btnAnswer4.setText(randomVidLanguage);
                }else if (randButton == 5) {
                    btnAnswer4.setText(randomVidLanguage);
                }

                //Get 4 other random languages for the 4 other buttons

                String randomLanguage = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                //While loop to make sure it's not the same language that is randomized
                while (randomLanguage.equals(randomVidLanguage)){
                    randomLanguage = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));
                }

                String randomLanguage2 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                while (randomLanguage2.equals(randomVidLanguage) | randomLanguage2.equals(randomLanguage)){
                    randomLanguage2 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));
                }

                String randomLanguage3 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                while (randomLanguage3.equals(randomVidLanguage) | randomLanguage3.equals(randomLanguage) | randomLanguage3.equals(randomLanguage2)){
                    randomLanguage3 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                }

                String randomLanguage4 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));

                while (randomLanguage4.equals(randomVidLanguage) | randomLanguage4.equals(randomLanguage) |
                        randomLanguage4.equals(randomLanguage2) | randomLanguage4.equals(randomLanguage3)){
                    randomLanguage4 = pickHardLanguages.get(rand2.nextInt(pickHardLanguages.size()));
                }

                //Set the random selected languages to the buttons
                if ((btnAnswer1.getText().equals(randomVidLanguage))){
                    btnAnswer2.setText(randomLanguage);
                    btnAnswer3.setText(randomLanguage2);
                    btnAnswer4.setText(randomLanguage3);
                    btnAnswer5.setText(randomLanguage4);
                }else if (btnAnswer2.getText().equals(randomVidLanguage)){
                    btnAnswer1.setText(randomLanguage);
                    btnAnswer3.setText(randomLanguage2);
                    btnAnswer4.setText(randomLanguage3);
                    btnAnswer5.setText(randomLanguage4);
                }else if (btnAnswer3.getText().equals(randomVidLanguage)){
                    btnAnswer1.setText(randomLanguage);
                    btnAnswer2.setText(randomLanguage2);
                    btnAnswer4.setText(randomLanguage3);
                    btnAnswer5.setText(randomLanguage4);
                }else if (btnAnswer4.getText().equals(randomVidLanguage)){
                    btnAnswer1.setText(randomLanguage);
                    btnAnswer2.setText(randomLanguage2);
                    btnAnswer3.setText(randomLanguage3);
                    btnAnswer5.setText(randomLanguage4);
                }else if (btnAnswer5.getText().equals(randomVidLanguage)){
                    btnAnswer1.setText(randomLanguage);
                    btnAnswer2.setText(randomLanguage2);
                    btnAnswer3.setText(randomLanguage3);
                    btnAnswer4.setText(randomLanguage4);

                }

                btnAnswer1.setOnClickListener(v -> {

                    if (randomVidLanguage.equals(btnAnswer1.getText())) {
                        showPositivePopup();
                        PlayerModel.addrightAnswers();
                    }else {
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }
                });


                btnAnswer2.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer2.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }

                });

                btnAnswer3.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer3.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }

                });

                btnAnswer4.setOnClickListener(v -> {
                    if (randomVidLanguage.equals(btnAnswer4.getText())){
                        showPositivePopup();
                        PlayerModel.addrightAnswers();

                    }else{
                        PlayerLosingLives(); // Player loses a life and looks if player lost the game
                        PlayerModel.addWrongAnswers();
                    }


                });

            }

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

    //Get the list of easy langauges (English, french, spanish, arabe, japonais, allemand, russe)
    public ArrayList<String> getEasyList(HashMap<String, String> myhashmap){

        ArrayList<String> easyList = new ArrayList<>();

        for (Map.Entry<String, String> entry: myhashmap.entrySet()){
            if(entry.getValue().equals("English")) {
                easyList.add(entry.getKey());

            }else if (entry.getValue().equals("French")){
                easyList.add(entry.getKey());

            }else if ((entry.getValue().equals("Spanish"))){
                easyList.add(entry.getKey());

            }else if ((entry.getValue().equals("Arabic"))){
                easyList.add(entry.getKey());

            }else if((entry.getValue().equals("Japanese"))){
                easyList.add(entry.getKey());

            }else if ((entry.getValue().equals("German"))){
                easyList.add(entry.getKey());

            }else if ((entry.getValue().equals("Russian"))){
                easyList.add(entry.getKey());
            }
        }

        return easyList;
    }


    //Get the list of Medium Languages. Picks 1 language per family of language lists.
    public ArrayList<String> getMediumList(HashMap<String, String> myhashmap){
        ArrayList<String> mediumList = new ArrayList<>();
        Random rand = new Random();
        String vidFamily1 = YoutubeVideos.youtubevideos.getFamily1().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily1().size()));
        String vidFamily2 = YoutubeVideos.youtubevideos.getFamily2().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily2().size()));
        String vidFamily3 = YoutubeVideos.youtubevideos.getFamily3().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily3().size()));
        String vidFamily4 = YoutubeVideos.youtubevideos.getFamily4().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily4().size()));

        for (Map.Entry<String, String> entry: myhashmap.entrySet()){
            if(entry.getValue().equals(vidFamily1)) {
                mediumList.add(entry.getKey());

            }else if (entry.getValue().equals(vidFamily2)){
                mediumList.add(entry.getKey());

            }else if (entry.getValue().equals(vidFamily3)){
                mediumList.add(entry.getKey());

            }else if (entry.getValue().equals(vidFamily4)){
                mediumList.add(entry.getKey());
            }
        }
        return mediumList;

    }

    public ArrayList<String> getHardList(HashMap<String, String> myhashmap){

        ArrayList<String> hardList = new ArrayList<>();
        Random rand = new Random();
        String vid1 = null,vid2 = null,vid3 = null,vid4 = null;

        //Get a random family.
        int randomFamily = rand.nextInt((4-3) + 1) + 1;

        //TODO Faire facon plus efficient. Modifier.
        //get randomFamily
        switch(randomFamily){
            case 1:
                vid1 = YoutubeVideos.youtubevideos.getFamily1().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily1().size()));
                vid2 = YoutubeVideos.youtubevideos.getFamily2().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily1().size()));
                vid3 = YoutubeVideos.youtubevideos.getFamily3().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily1().size()));
                vid4 = YoutubeVideos.youtubevideos.getFamily4().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily1().size()));
                numberFamily=1;
                break;
            case 2:
                vid1 = YoutubeVideos.youtubevideos.getFamily1().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily2().size()));
                vid2 = YoutubeVideos.youtubevideos.getFamily2().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily2().size()));
                vid3 = YoutubeVideos.youtubevideos.getFamily3().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily2().size()));
                vid4 = YoutubeVideos.youtubevideos.getFamily4().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily2().size()));
                numberFamily=2;
                break;
            case 3:
                vid1 = YoutubeVideos.youtubevideos.getFamily1().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily3().size()));
                vid2 = YoutubeVideos.youtubevideos.getFamily2().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily3().size()));
                vid3 = YoutubeVideos.youtubevideos.getFamily3().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily3().size()));
                vid4 = YoutubeVideos.youtubevideos.getFamily4().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily3().size()));
                numberFamily=3;
                break;
            case 4:
                vid1 = YoutubeVideos.youtubevideos.getFamily1().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily4().size()));
                vid2 = YoutubeVideos.youtubevideos.getFamily2().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily4().size()));
                vid3 = YoutubeVideos.youtubevideos.getFamily3().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily4().size()));
                vid4 = YoutubeVideos.youtubevideos.getFamily4().get(rand.nextInt(YoutubeVideos.youtubevideos.getFamily4().size()));
                numberFamily=4;
                break;
        }

        for (Map.Entry<String, String> entry: myhashmap.entrySet()){
            if(entry.getValue().equals(vid1)) {
                hardList.add(entry.getKey());

            }else if (entry.getValue().equals(vid2)){
                hardList.add(entry.getKey());

            }else if (entry.getValue().equals(vid3)){
                hardList.add(entry.getKey());

            }else if (entry.getValue().equals(vid4)){
                hardList.add(entry.getKey());
            }
        }
        return hardList;

    }
}



