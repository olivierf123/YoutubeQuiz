package android.example.youtubequiz;

import com.google.firebase.auth.FirebaseAuth;

public class PlayerModel {
    private String username;
    private String email;
    private int PlayerScore;
    private int scoretoAdd;
    public static int numberOfLives=1;
    public static int rightAnswers;
    public static int wrongAnswers;

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
    public static void addScore(int scoretoAdd){
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

    public static int getRightAnswers() {
        return rightAnswers;
    }

    public static void setRightAnswers(int rightAnswers) {
        PlayerModel.rightAnswers = rightAnswers;
    }

    public static int getWrongAnswers() {
        return wrongAnswers;
    }

    public static void setWrongAnswers(int wrongAnswers) {
        PlayerModel.wrongAnswers = wrongAnswers;
    }

    public static void addrightAnswers(){
       PlayerModel.setRightAnswers(PlayerModel.getRightAnswers()+1);
    }

    public static void addWrongAnswers(){
        PlayerModel.setWrongAnswers(PlayerModel.getWrongAnswers()+1);
    }


}
