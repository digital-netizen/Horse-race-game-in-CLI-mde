package HorseRaceGame;

/*Horse file is a file that operates the positions of each horse and make horses move on the race game*/
import java.util.*;


public class Horse{
	//declare variables
	int position = 0; //determines the position of each horse
	int meter = 20; //the number of meter that each horse will move
	
	
	//build a constructor to initialize
	public Horse() {}
	
	//construct a public method for advance
	public void advance() {

	        try {
	        	this.position = position +((int)(Math.random() * meter));
	        }
	        catch (Exception exc) {
	        	exc.getStackTrace();
	     }
	}
	
	//make a public method for getPosition
	public int getPosition(){
		return position;
	}
}
 