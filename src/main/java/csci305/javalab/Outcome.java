package csci305.javalab;

public class Outcome
{
	String action;
	String result;
	public Outcome(String action, String result){
		this.action = action;
		this.result = result;
	}
	public String getAction()
	{
		return action;
	}
	public String getResult()
	{
		return result;
	}
}
