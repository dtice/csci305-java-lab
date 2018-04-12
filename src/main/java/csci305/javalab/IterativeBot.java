package csci305.javalab;

public class IterativeBot extends Player{
	private int choice = 1;
	public IterativeBot(String name){
		super(name);
	}
	@Override
	public Element play(){
		if(choice > 5) choice = 1;
		switch(choice){
			//Rock
			case 1:
				choice++;
				return new Rock("Rock");
			//Paper
			case 2:
				choice++;
				return new Paper("Paper");
			//Scissors
			case 3:
				choice++;
				return new Scissors("Scissors");
			//Lizard
			case 4:
				choice++;
				return new Lizard("Lizard");
			//Spock
			case 5:
				choice++;
				return new Spock("Spock");
			default:
				return new Rock("Rock");
		}
	}
}