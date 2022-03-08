public class Chord {
    private String name;
    private char letter;
    private boolean isMinor;
    private boolean isSharp;
    private String sound;

    public void playChord() {

    }

    public String getName() {
        return name;
    }

    public char getLetter() {
        return letter;
    }

    public boolean getIsMinor() {
        return isMinor;
    }

    public boolean getIsSharp() {
        return isSharp;
    }

    public String getSound() {
        return sound;
    }

    public Chord(String name, char letter, boolean isMinor, String sound) {
        this.name = name;
        this.letter = letter;
        this.isMinor = isMinor;
        this.sound = sound;
    }

    public Chord(String name, char letter, String sound) {
        this.name = name;
        this.letter = letter;
        this.isMinor = false;
        this.sound = sound;
    }
}