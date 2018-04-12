/**
 * A bot that randomly selects a move
 */
package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{
	public RandomBot(String name){
		super(name);
	}
	//Selects a random move
	@Override
	public Element play(){
		Random rand = new Random();
		int r = rand.nextInt(5);
		switch(r){
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
}