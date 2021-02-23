package android.example.youtubequiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private EditText userName,password,email,confirmPassword;
    private Button signUpB;
    private ImageView facebookIV, twitterIV;
    private Toolbar back_toolbar;
    private FirebaseAuth mAuth;
    private String emailString, passwordString, confirmPasswordString, userNameString;
    private Dialog progressDialog;
    private TextView dialogText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userName = findViewById(R.id.signup_username);
        password = findViewById(R.id.signup_password);
        email = findViewById(R.id.signup_email);
        confirmPassword = findViewById(R.id.signup_confirm_password);
        signUpB = findViewById(R.id.signup_button);
        facebookIV = findViewById(R.id.signup_facebook);
        twitterIV =  findViewById(R.id.signup_twitter);
        back_toolbar = findViewById(R.id.back_toolbar);


        progressDialog = new Dialog(SignUpActivity.this);
        progressDialog.setContentView(R.layout.dialog_layout);
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        dialogText = progressDialog.findViewById(R.id.dialog_text);
        dialogText.setText("Please wait ...");


        mAuth = FirebaseAuth.getInstance();

        setSupportActionBar(back_toolbar);

        signUpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validate()){
                    createNewUser();
                }

            }
        });

        //When user clicks on the navigation button (Back arrow). Goes back goes back to previous activity
        back_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    //Create new User in Firebase
    private void createNewUser(){

        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(emailString, passwordString)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            Toast.makeText(SignUpActivity.this,"Sign Up Sucessfull",Toast.LENGTH_SHORT).show();

                            FirebaseQuery.createUserData(emailString,userNameString, new CustomCompleteListener() {
                                @Override
                                public void onSucess() {

                                    FirebaseQuery.loadData(new CustomCompleteListener() {
                                        @Override
                                        public void onSucess() {
                                            progressDialog.dismiss();
                                            Intent intent= new Intent(SignUpActivity.this,MainActivity.class);
                                            startActivity(intent);
                                            SignUpActivity.this.finish();

                                        }

                                        @Override
                                        public void onFailure() {
                                            Toast.makeText(SignUpActivity.this,"Error",Toast.LENGTH_SHORT).show();

                                        }
                                    });

                                }

                                @Override
                                public void onFailure() {
                                    Toast.makeText(SignUpActivity.this,"Cannot Create user",Toast.LENGTH_SHORT).show();
                                    progressDialog.dismiss();

                                }
                            });


                        } else {
                            progressDialog.dismiss();
                            // If sign in fails, display a message to the user.
                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                });

    }

    public boolean validate(){
        userNameString= userName.getText().toString().trim();
        passwordString = password.getText().toString().trim();
        emailString = email.getText().toString().trim();
        confirmPasswordString = confirmPassword.getText().toString().trim();

        if (userNameString.isEmpty()){
            userName.setError("Enter Username");
            return false;
        }
        if (emailString.isEmpty()){
            email.setError("Enter Email");
            return false;

        }
        if (passwordString.isEmpty()){
            password.setError("Enter Password");
            return false;

        }
        if (confirmPasswordString.isEmpty()){
            confirmPassword.setError("Enter Password");
            return false;
        }

        if (passwordString.compareTo(confirmPasswordString)!=0){
            Toast.makeText(SignUpActivity.this,"Password does not match",Toast.LENGTH_SHORT).show();
            return false;

        }
        return true;
    }

}