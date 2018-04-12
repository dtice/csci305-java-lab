package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{
	public RandomBot(String name){
		super(name);
	}
	@Override
	public Element play(){
		Random rand = new Random();
		int r = rand.nextInt(5) + 1;
		switch(r){
		//Rock
		case 1:
			return new Rock("Rock");
		//Paper
		case 2:
			return new Paper("Paper");
		//Scissors
		case 3:
			return new Scissors("Scissors");
		//Lizard
		case 4:
			return new Lizard("Lizard");
		//Spock
		case 5:
			return new Spock("Spock");
		default:
			return new Rock("Rock");
		}
	}
}