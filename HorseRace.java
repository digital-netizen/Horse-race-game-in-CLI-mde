package HorseRaceGame;

/*This file is the a file that has the main method that tasks every aspect of the horse race simulator*/

import java.util.*;
import java.util.Scanner;

public class HorseRace extends Race{
	public static void main(String args[]) {
		int i;// Race
		int TotalLengthOfRace = 100; //The total length of a race
		
		Scanner input = new Scanner(System.in);
	    boolean exit = false;
	    
	    //Call a class named Race to operate the total length of a race
	    Race race = new Race(TotalLengthOfRace);
	    
	    //start the race
	    race.start();
	    
        while (!exit) {
        	
            System.out.println("Please type the word 'race' and hit enter to another turn (quit to exit): ");
            String userInput = input.nextLine();
            
            if(userInput != null) {
                if ("quit".equals(userInput)) {
                    System.out.println("Exit program");
                    exit = true;    
                } 
                else if ("race".equals(userInput)) {
                	
                	for(int horseNum = 0; horseNum < 5; horseNum++){
                	
                		race.printLane(horseNum);		
                	}
                }
            }
        }
        input.close();
	}
}
 