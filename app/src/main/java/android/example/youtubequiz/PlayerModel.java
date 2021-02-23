package android.example.youtubequiz;

import com.google.firebase.auth.FirebaseAuth;

public class PlayerModel {
    private String username;
    private String email;
    private int PlayerScore;
    private int scoretoAdd;
    public static int numberOfLives=1;

    public PlayerModel(String username, String email, int PlayerScore) {
        this.username = username;
        this.email = email;
        this.PlayerScore = PlayerScore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPlayerScore() {
        return PlayerScore;
    }

    public void setPlayerScore(int playerScore) {
        PlayerScore = playerScore;
    }

    public void resetPlayerScore(){
        PlayerScore = 0;
    }

    //Modify player score in the Database
    public void addScore(int scoretoAdd){
        FirebaseQuery.g_firestore.collection("USERS")
                .document(FirebaseAuth.getInstance().getUid())
                .update("USER_SCORE",FirebaseQuery.player.getPlayerScore()+scoretoAdd);
    }

    public static int getNumberOfLives() {
        return numberOfLives;
    }

    public static void setNumberOfLives(int numberOfLives) {
        PlayerModel.numberOfLives = numberOfLives;
    }
}
