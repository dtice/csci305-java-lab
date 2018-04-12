package csci305.javalab;

public abstract class Element{
	String name;
	public Element(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	abstract Outcome compareTo(Element e);
}