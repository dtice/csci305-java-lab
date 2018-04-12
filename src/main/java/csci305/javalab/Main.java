package csci305.javalab;

import java.util.Map;
import java.util.stream.IntStream;
import java.util.HashMap;

public class Main
{
	final static Map moves = new HashMap();
	public static void main(String args[]){
		Rock rock = new Rock("Rock");
		Paper paper = new Paper("Paper");
		Scissors scissors = new Scissors("Scissors");
		Lizard lizard = new Lizard("Lizard");
		Spock spock = new Spock("Spock");
		//When a game is completed, add outcome to hash
		//TODO: Implement bots & players
	}
}
