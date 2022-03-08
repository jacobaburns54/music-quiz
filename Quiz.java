// import java.lang.reflect.Method;
import java.lang.Math;
import java.util.Scanner;
public class Quiz {

    public static Chord[] fillQuizChords(int numMajor, int numMinor, Chord[] majorSelection, Chord[] minorSelection) {
        int j, numChords = numMajor + numMinor;
        Chord temp;
        Chord[] tempChords = new Chord[numChords];

        //fill major chords
        for(int i = 0; i < numMajor; i++) {
            // System.out.println("Entering major fill loop");
            j = 0;
            while(j == 0) {
                // System.out.println("Entering major while loop");
                temp = majorSelection[(int)(Math.random() * majorSelection.length)];
                if(i != 0) {
                    System.out.println("Major Chord not first");
                    if(temp.getName() != tempChords[i-1].getName()) {
                        // System.out.println("Major chord not equal to last, setting final chord value for index " + i + " to " + temp.getName());
                        tempChords[i] = temp;
                        j = 1;
                    }
                }
                else {
                    // System.out.println("First major chord, setting final chord value for index " + i + " to " + temp.getName());
                    tempChords[i] = temp;
                    j = 1;
                }
            }
        }

        //fill minor chords
        for(int i = numMajor; i < numChords; i++) {
            // System.out.println("Entering minor fill loop");
            j = 0;
            while(j == 0) {
                // System.out.println("Entering minor while loop");
                temp = minorSelection[(int)(Math.random() * minorSelection.length)];
                if(i != numMajor) {
                    // System.out.println("Minor Chord not first");
                    if(temp.getName() != tempChords[i-1].getName()) {
                        // System.out.println("Minor chord not equal to last, setting final chord value for index " + i + " to " + temp.getName());
                        tempChords[i] = temp;
                        j = 1;
                    }
                }
                else {
                    System.out.println("First minor chord, setting final chord value for index " + i + " to " + temp.getName());
                    tempChords[i] = temp;
                    j = 1;
                }
            }
        }

        return tempChords;
    }

    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);

        Chord majorChords[] = {
            new Chord("aMajor", 'A', "aMajor.mp4"),
            new Chord("bMajor", 'B', "bMajor.mp4"),
            new Chord("cMajor", 'C', "cMajor.mp4"),
            new Chord("dMajor", 'D', "DMajor.mp4"),
            new Chord("eMajor", 'E', "eMajor.mp4"),
            new Chord("fMajor", 'F', "fMajor.mp4"),
            new Chord("gMajor", 'G', "gMajor.mp4")
        };
        Chord minorChords[] = {
            new Chord("aMinor", 'A', true, "aMinor.mp4"),
            new Chord("bMinor", 'B', true, "bMinor.mp4"),
            new Chord("cMinor", 'C', true, "cMinor.mp4"),
            new Chord("dMinor", 'D', true, "DMinor.mp4"),
            new Chord("eMinor", 'E', true, "eMinor.mp4"),
            new Chord("fMinor", 'F', true, "fMinor.mp4"),
            new Chord("gMinor", 'G', true, "gMinor.mp4")
        };

        int i = 0;
        int tempMajC = 0;
        int tempMinC = 0;
        while(i == 0) {
            System.out.println("Please select difficulty:\n1. Only 3 different chords per quiz, no minor chords\n2. 5 chords per quiz, 2 of them are minor\n3. 10 chords per quiz, 5 of them are minor\n4. All major and minor chords\n5. Custom difficulty");
            int c = userIn.nextInt();

            Chord[] quizChords;
            switch(c) {
                case 1: 
                    tempMajC = 3;
                    tempMinC = 0;
                    i = 1;
                    break;
                case 2:
                    tempMajC = 3;
                    tempMinC = 2;
                    i = 1;
                    break;
                case 3:
                    tempMajC = 5;
                    tempMinC = 5;
                    i = 1;
                    break;
                case 4:
                    tempMajC = majorChords.length;
                    tempMinC = minorChords.length;
                    i = 1;
                    break;
                case 5:
                    System.out.println("# of major chords: ");
                    tempMajC = userIn.nextInt();
                    System.out.println("# of minor chords: ");
                    tempMinC = userIn.nextInt();
                    i = 1;
                    break;
                default:
                    System.out.println("You did not enter a valid option. Please try again.\n\n\n\n");
                    break;
            }
        }
        Chord[] quizChords = fillQuizChords(tempMajC, tempMinC, majorChords, minorChords);

        for(int j = 0; j < quizChords.length; j++) {
            System.out.println(quizChords[j].getName());
        }
        userIn.close();
    }
}