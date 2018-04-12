/**
 * An abstract class that the concrete "move" classes inherit from
 */
package csci305.javalab;

public abstract class Element{
	String name;
	public Element(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	//Compares one element to the next
	abstract Outcome compareTo(Element e);
}