package HorseRaceGame;

/*Race file is a file that makes horses, lanes, and start race. 
 In other words, this file does operations of the horse race game.*/

import java.util.*;

public class Race{
	//make a class named Horse1
	Horse[] h = new Horse[5];
	
	//declare variables
	static int length; //the length of the elements in an array
	static int finish=0; //a variable that determines if a game ends or continues
	static int winner; //a variable that determines what horse number is a winner of a race.
	
	//build a constructor to initialize
	public Race() {}
	
	//build a parameterized constructor	
	public Race(int l) {
		length = l;
	}
		
		
	//make a method for printLane
	public void printLane(int horseNum) {
		
		//get the position of each horse
		int p = h[horseNum].getPosition();
		
		if(p >= this.length){
			this.finish = 1;
			this.winner = horseNum;
		}
		
		for(int i=0; i < p; i++){
			System.out.print("..");
		}
		
		System.out.println(""+ horseNum + "");
		
		/*I make and call advance method in the printLane. This is because horses advance and run on the lanes.
		Therefore, I call a method named advance in the printLane */
		h[horseNum].advance();
		
		if(horseNum == 4 && this.finish == 1){
			System.out.println("No.horse: " + winner + " wins! ");
			System.exit(0);
		
			/*if(this.finish==1){
				System.out.println(""+ winner + " this horse wins!");
				System.exit(0);
			}*/
		}
	}
	
	//make a public method for start 
	public void start() {
		
		for(int horseNum = 0; horseNum < 5; horseNum++){
			h[horseNum] = new Horse();	
		}
	}
}


 