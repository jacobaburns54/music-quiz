import java.util.Scanner;

public class Chord {
    private String name;
    private char letter;
    private boolean isMinor;
    private boolean isSharp;
    private String filename;
    // SoundPlayer audioStream = new SoundPlayer();

    public void playChord() {
        Scanner userIn = new Scanner(System.in);

        //play sound filename

        System.out.println("Would you like play the sound again? (Y/N)");
        String input = userIn.nextLine();
        userIn.close();

        if(input == "N") return;
        else {
            //play sound filename
            return;
        }

    }

    public boolean AskFrom(Chord[] selection) {
        boolean isCorrect = false;
        Chord[] answers;
        if(selection.length < 4) {
            answers = new Chord[selection.length];
        }
        else {
            answers = new Chord[4];
        }

        //assign one spot in answers for correct option
        int correctAnswer = (int)(Math.random() * answers.length);
        answers[correctAnswer] = this;
        //pick (answers.length-1) random chords from selection, not repeating, not equal to current chord
        for(int i = 0; i < answers.length; i++) {
            int newOption = (int)(Math.random()*answers.length);
            if(i != correctAnswer && /*selection[newOption] DNE in answers already*/true) {
                answers[i] = selection[newOption];
                //flag var = 1
            }

        }

        int rand = (int)(Math.random() * selection.length);

        //print all 4 chords with corresponding #s
        for(int j = 0; j < selection.length; j++) {
            System.out.println((j+1) + ". " + selection[j].getName());
        }

        //user input for chord
        Scanner userIn = new Scanner(System.in);
        int chordGuessed = userIn.nextInt();
        userIn.close();

            //if correct chord selected, isCorrect = true
            if(chordGuessed == correctAnswer) {
                isCorrect = true;
            }

            //else, isCorrect = false

        return isCorrect;
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