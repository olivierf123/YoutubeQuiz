package android.example.youtubequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.lives_radiob_1){
                    PlayerModel.setNumberOfLives(1);
                }else if (checkedId == R.id.lives_radiob_3){
                    PlayerModel.setNumberOfLives(3);

                }else if (checkedId == R.id.lives_radiob_5){
                    PlayerModel.setNumberOfLives(5);
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

}