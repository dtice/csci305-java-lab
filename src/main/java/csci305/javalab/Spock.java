package csci305.javalab;

public class Spock extends Element{
	public Spock(String name){
		super(name);
	}
	@Override
	public Outcome compareTo(Element e){
		switch(e.getName()){
			case "Rock":
				return new Outcome("Spock vaporizes Rock","Win");
			case "Paper":
				return new Outcome("Paper disproves Spock","Lose");
			case "Scissors":
				return new Outcome("Spock smashes Scissors","Win");
			case "Lizard":
				return new Outcome("Lizard decapitates Spock","Lose");
			case "Spock":
				return new Outcome("Spock equals Spock","Tie");
			default:
				return null;
		}
	}
}