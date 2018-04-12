/**
 * A class for a MyBot player in the RPSLS game
 * Uses random selection for the first 2 moves then iteratively selects afterwards
 */

package csci305.javalab;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MyBot extends Player{
	Queue<Element> elements = new LinkedList<Element>();
	int moveNum = 0;
	Random rand = new Random();
	IterativeBot ib = new IterativeBot("");
	public MyBot(String name){
		super(name);
	}
	//Random for the first 2 moves, then iterative
	@Override
	public Element play(){
		//Random selection for first two moves
		if(moveNum < 2){
			moveNum++;
			//select randomly
			switch(rand.nextInt(4)+1){
			//Rock
			case 1:
				elements.add(Main.moves.get("Rock"));
				return Main.moves.get("Rock");
			//Paper
			case 2:
				elements.add(Main.moves.get("Paper"));
				return Main.moves.get("Paper");
			//Scissors
			case 3:
				elements.add(Main.moves.get("Scissors"));
				return Main.moves.get("Scissors");
			//Lizard
			case 4:
				elements.add(Main.moves.get("Scissors"));
				return Main.moves.get("Lizard");
			//Spock
			case 5:
				elements.add(Main.moves.get("Spock"));
				return Main.moves.get("Spock");
			default:
				return Main.moves.get("Rock");
			}
		}
		else{
			return ib.play();
		}
	}
}