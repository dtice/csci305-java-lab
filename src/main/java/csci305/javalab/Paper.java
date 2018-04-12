/**
 * Paper
 */
package csci305.javalab;

public class Paper extends Element{
	public Paper(String name){
		super(name);
	}
	@Override
	public Outcome compareTo(Element e){
		//TODO: Implement compareTo method
		switch(e.getName()){
			case "Rock":
				return new Outcome("Paper covers Rock","Win");
			case "Paper":
				return new Outcome("Paper equals Paper","Tie");
			case "Scissors":
				return new Outcome("Scissors cut Paper","Lose");
			case "Lizard":
				return new Outcome("Lizard eats Paper","Lose");
			case "Spock":
				return new Outcome("Paper disproves Spock","Win");
			default:
				return null;
		}
	}
}