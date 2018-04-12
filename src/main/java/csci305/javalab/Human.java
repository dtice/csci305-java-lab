/**
 * A class for a human player in the RPSLS game
 */
package csci305.javalab;

import java.util.Scanner;

public class Human extends Player {
	public Human(String name){
		super(name);
	}
	@SuppressWarnings("resource")
	@Override
	public Element play(){
		System.out.println("\n(1) : Rock \n (2) : Paper \n (3) : Scissors \n (4) : Lizard \n (5) : Spock");
		boolean valid = false;
		while(!valid){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your move: ");
			int choice = in.nextInt();
			if(choice < 1 || choice > 5) System.out.println("Invalid Move. Please try again.");
			else{
				valid = true;
				switch(choice){
				//Rock
				case 1:
					return Main.moves.get("Rock");
				//Paper
				case 2:
					return Main.moves.get("Paper");
				//Scissors
				case 3:
					return Main.moves.get("Scissors");
				//Lizard
				case 4:
					return Main.moves.get("Lizard");
				//Spock
				case 5:
					return Main.moves.get("Spock");
				default:
					return Main.moves.get("Rock");
				}
			}
			in.close();
		}

		return null;
	}
}