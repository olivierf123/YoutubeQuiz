package android.example.youtubequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class SplashActivity extends AppCompatActivity {

    private TextView mAppName;
    private ImageView mAppLogo;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mAppName = findViewById(R.id.app_name);
        mAppLogo = findViewById(R.id.app_logo);

        //Animation of home screen
        //TODO changer ou enlever le splash art
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.animation);
        mAppName.setAnimation(anim);
        mAppLogo.setAnimation(anim);

        mAuth = FirebaseAuth.getInstance();

         FirebaseQuery.g_firestore = FirebaseFirestore.getInstance();


        new Thread(){

            public void run(){

                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

         //       If user logged, goes directly to MainActivity. If not logged it goes to LoginActivity

                if (mAuth.getCurrentUser() != null){

                    FirebaseQuery.loadData(new CustomCompleteListener() {
                        @Override
                        public void onSucess() {
                            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                            startActivity(intent);
                            SplashActivity.this.finish();
                        }

                        @Override
                        public void onFailure() {
                            Toast.makeText(SplashActivity.this,"Error",Toast.LENGTH_SHORT).show();


                        }
                    });



                }else {
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish(); //Destroys SplashActivity
                }

            }


        }.start();

    }
}