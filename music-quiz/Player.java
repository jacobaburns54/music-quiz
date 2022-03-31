public class Player {
    private String name;
    private int score;
    static int highScore;

    public Player(String name, int score) {
        this.name = name;
        score = 0;
    }

    //mutator methods
    public void incrementScore() {
        score++;
    }
    public void incrementScoreN(int n) {
        score += n;
    }
    public void setName(String newName) {
        this.name = newName;
    } 

    //accessor methods
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
