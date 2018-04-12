/**
 * A bot that selects moves in order
 */
package csci305.javalab;

public class IterativeBot extends Player{
	private int choice = 1;
	public IterativeBot(String name){
		super(name);
	}
	//Selects moves in order
	@Override
	public Element play(){
		if(choice > 5) choice = 1;
		switch(choice){
			//Rock
			case 1:
				choice++;
				return Main.moves.get("Rock");
			//Paper
			case 2:
				choice++;
				return Main.moves.get("Paper");
			//Scissors
			case 3:
				choice++;
				return Main.moves.get("Scissors");
			//Lizard
			case 4:
				choice++;
				return Main.moves.get("Lizard");
			//Spock
			case 5:
				choice++;
				return Main.moves.get("Spock");
			default:
				return Main.moves.get("Rock");
		}
	}
}