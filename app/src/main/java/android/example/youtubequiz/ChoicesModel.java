package android.example.youtubequiz;

/***
 * Class to choose the game you want to play
 *
 */

public class ChoicesModel {

    private String ID;
    private String name;

    public ChoicesModel(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
