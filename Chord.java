public class Chord {
    private String name;
    private char letter;
    private boolean isMinor;
    private boolean isSharp;
    private String filename;

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

    public String getFilename() {
        return filename;
    }

    public Chord(String name, char letter, boolean isMinor, String filename) {
        this.name = name;
        this.letter = letter;
        this.isMinor = isMinor;
        this.filename = filename;
    }

    public Chord(String name, char letter, String filename) {
        this.name = name;
        this.letter = letter;
        this.isMinor = false;
        this.filename = filename;
    }
}