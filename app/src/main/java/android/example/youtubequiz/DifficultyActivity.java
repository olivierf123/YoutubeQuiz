package android.example.youtubequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DifficultyActivity extends AppCompatActivity {

    //TODO Mettre une toolbar en haut avec un Back arrow button

    private CardView difficultyView1, difficultyView2, difficultyView3;
    private List<DifficultyModel> difficulty_list = new ArrayList<>();
    private RadioButton radioB1,radioB2,radioB3;
    private RadioGroup radiogroup;
    private String numberofLivesSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        difficultyView1 = findViewById(R.id.difficulty_cardview_1);
        difficultyView2 = findViewById(R.id.difficulty_cardview_2);
        difficultyView3 = findViewById(R.id.difficulty_cardview_3);
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radiogroup_lives);

        RadioButton radioButton1 = findViewById(R.id.lives_radiob_1);
        RadioButton radioButton2 = findViewById(R.id.lives_radiob_3);
        RadioButton radioButton3 = findViewById(R.id.lives_radiob_5);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.lives_radiob_1){
                    PlayerModel.setNumberOfLives(1);
                    PlayerModel.setRightAnswers(0);
                    PlayerModel.setWrongAnswers(0);
                    radioButtonAnimate(radioButton1);

                }else if (checkedId == R.id.lives_radiob_3){
                    PlayerModel.setNumberOfLives(3);
                    PlayerModel.setRightAnswers(0);
                    PlayerModel.setWrongAnswers(0);
                    radioButtonAnimate(radioButton2);

                }else if (checkedId == R.id.lives_radiob_5){
                    PlayerModel.setNumberOfLives(5);
                    PlayerModel.setRightAnswers(0);
                    PlayerModel.setWrongAnswers(0);
                    radioButtonAnimate(radioButton3);

                }
            }
        });

        difficultyView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyActivity.this, SongGameActivity.class );
                startActivity(intent);
            }
        });

        difficultyView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyActivity.this, SongGameActivity.class );
                startActivity(intent);
            }
        });

        difficultyView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DifficultyActivity.this, SongGameActivity.class );
                startActivity(intent);
            }
        });

    }

    public void radioButtonAnimate(RadioButton radiobutton){
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                radiobutton,
                PropertyValuesHolder.ofFloat("scaleX", 1.3f),
                PropertyValuesHolder.ofFloat("scaleY", 1.3f));

        scaleDown.setDuration(500);
        scaleDown.setRepeatMode(ValueAnimator.REVERSE);
        scaleDown.setRepeatCount(2);
        scaleDown.start();
    }

}