/**
 * An abstract class that the player classes inherit from
 */
package csci305.javalab;

public abstract class Player {
	String name;
	public Player(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	//Returns a move from the player
	abstract Element play();
}