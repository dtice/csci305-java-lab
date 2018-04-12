package csci305.javalab;

public class MyBot extends Player{
	public MyBot(String name){
		super(name);
	}
	//Random unless the bot has used it in the last 2 moves
	@Override
	public Element play(){
		return new Rock("Rock");
	}
}