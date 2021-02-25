package android.example.youtubequiz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ScoreScreenFragment extends Fragment {

    //TODO ADD LE TOTAL SCORE du joueuer AU TOTAL SCORE SUR LA DATABASE et dans la variable total player score

    TextView rightanwersTv, wronganswersTv;
    Button homepageB;

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