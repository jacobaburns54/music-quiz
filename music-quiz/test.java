import java.util.Scanner;

public class test {
    public static void playAudio(String filePath) 
	{ 
		try
		{ 
		  //add the path to the audio file
			SoundPlayer.thePath = filePath; 
		
			SoundPlayer simpleSoundPlayer = 
							new SoundPlayer(); 
			
			simpleSoundPlayer.play(); 

            //i have no idea why this is here but program doesn't work if i delete it
			Scanner scanned = new Scanner(System.in); 
			while (true) 
			scanned.close(); 
		} 
		
		catch (Exception e) 
		{ 
			System.out.println("Experienced an error while playing sound."); 
			e.printStackTrace(); 
		
		}
	}
	
}
