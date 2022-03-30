import java.io.File; 
import java.io.IOException; 

import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Clip;  
import javax.sound.sampled.UnsupportedAudioFileException; 

public class SoundPlayer 
{ 

	//define storage for start position
	Long nowFrame; 
	Clip clip; 
	
	AudioInputStream audioStream; 
	static String thePath; 

	// initialize both the clip and streams 
	public SoundPlayer() 
		throws UnsupportedAudioFileException, 
		IOException, LineUnavailableException 
	{ 
		// the input stream object 
		audioStream = AudioSystem.getAudioInputStream(new File(thePath).getAbsoluteFile()); 
		
		// the reference to the clip 
		clip = AudioSystem.getClip(); 
 
		clip.open(audioStream); 
		
	}
	
	// play 
	public void play() 
	{
		clip.start();
	} 
} 