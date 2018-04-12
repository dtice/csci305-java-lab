/**
 * DNF :(
 */

package csci305.javalab;

public class LastPlay extends Player{
	public LastPlay(String name){
		super(name);
	}
	//As long as the other player always selects rock, this bot works as expected :-)
	@Override
	public Element play(){
		//Always plays last move the other player made
		return new Rock("rock");
	}
}