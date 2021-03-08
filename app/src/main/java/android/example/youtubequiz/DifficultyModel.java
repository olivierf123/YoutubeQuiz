package android.example.youtubequiz;

public class DifficultyModel {

    public static String difficultyGame;

    private String difficulty;

    public DifficultyModel(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public static String getDifficultyGame() {
        return difficultyGame;
    }

    public static void setDifficultyGame(String difficultyGame) {
        DifficultyModel.difficultyGame = difficultyGame;
    }
}
