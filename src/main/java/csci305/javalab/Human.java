package csci305.javalab;

public class Human extends Player {
	public Human(String name){
		super(name);
	}
	@Override
	public Element play(){
		return new Rock("Rock");
	}
}