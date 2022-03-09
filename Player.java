public class Player {
    private String name;
    private int score;
    static int highScore;

    public Player(String name, int score) {
        this.name = name;
        score = 0;
    }

    public void incrementScore() {
        score++;
    }

    public void incrementScoreN(int n) {
        score += n;
    }

    public String getName() {
        return name;
    }
}
