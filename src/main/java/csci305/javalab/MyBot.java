package csci305.javalab;

public class MyBot extends Player{
	public MyBot(String name){
		super(name);
	}
	@Override
	public Element play(){
		return new Rock("Rock");
	}
}