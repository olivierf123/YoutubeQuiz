package android.example.youtubequiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ScoreScreenFragment extends Fragment {

    TextView rightanwersTv, wronganswersTv;
    Button homepageB;
    Toolbar mActionBarToolbar;

    public ScoreScreenFragment() {
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
        View view = inflater.inflate(R.layout.fragment_score_screen, container, false);

        rightanwersTv = view.findViewById(R.id.rightanswers_textview);
        homepageB = view.findViewById(R.id.back_to_menu);

        rightanwersTv.setText("Total Score:  " + PlayerModel.getRightAnswers() + " points");

        //Add Player score to the total score of the player in the database
       PlayerModel.addScore(PlayerModel.getRightAnswers());

       //SEt title toolbar
        mActionBarToolbar = (Toolbar)  view.findViewById(R.id.toolbar_scorescreen_frag);
        mActionBarToolbar.setTitle(R.string.app_name);


        homepageB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();

            }
        });

        return view;
    }

}