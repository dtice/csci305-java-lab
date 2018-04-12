package csci305.javalab;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main
{
	final static Map moves = new HashMap();
	public static void main(String args[]){
		Rock rock = new Rock("Rock");
		Paper paper = new Paper("Paper");
		Scissors scissors = new Scissors("Scissors");
		Lizard lizard = new Lizard("Lizard");
		Spock spock = new Spock("Spock");
		
		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Dill\n");
		System.out.println("Please Choose two players: \n\t(1) Human \n\t(2) StupidBot \n\t(3) RandomBot \n\t(4) IterativeBot \n\t(5) LastPlayBot \n\t(6) MyBot\n");
		System.out.println("Select player 1: ");
		Player p1 = selectPlayer();
		System.out.println("Select player 2: ");
		Player p2 = selectPlayer();
		System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!");
		System.out.println();
		int p1Score = 0;
		int p2Score = 0;
		for(int i = 1; i < 6; i++){
			System.out.println("Round " + i + ":");
			Element p1Move = p1.play();
			System.out.println("\tPlayer 1 chose " + p1Move.getName());
			Element p2Move = p2.play();
			System.out.println("\tPlayer 2 chose " + p2Move.getName());
			//Always compare p1 to p2, if result = win, p1 wins. if result = lose, p2 wins, tie = tie
			Outcome comparison = p1Move.compareTo(p2Move);
			System.out.println("\t" + comparison.getAction());
			switch(comparison.getResult()){
			case "Win":
				System.out.println("\tPlayer 1 won the round\n");
				p1Score++;
				break;
			case "Lose":
				System.out.println("\tPlayer 2 won the round\n");
				p2Score++;
				break;
			case "Tie":
				System.out.println("\tRound was a tie\n");
				break;
			default:
				break;
			}
		}
		System.out.println("The score is " + p1Score + " to " + p2Score + ".");
		if(p1Score > p2Score) System.out.println("Player 1 won the game!");
		else if(p1Score < p2Score) System.out.println("Player 2 won the game!");
		else System.out.println("Game was a tie");
		//When a game is completed, add outcome to hash
	}
	@SuppressWarnings("resource")
	public static Player selectPlayer(){
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		while(!valid){
			int choice = in.nextInt();
			if(choice < 1 || choice > 6) System.out.println("Invalid Selection. Please Try Again.");
			else{
				switch(choice){
				//1 Human
				case 1:
					System.out.println("Enter Human's name: \n");
					String name = in.nextLine();
					return new Human(name);
				//2 StupidBot
				case 2:
					return new StupidBot("StupidBot");
				//3 RandomBot
				case 3:
					return new RandomBot("RandomBot");
				//4 IterativeBot
				case 4:
					return new IterativeBot("IterBot");
				//5 LastPlayBot
				case 5:
					return new LastPlay("LastPlay");
				//6 MyBot
				case 6:
					return new MyBot("MyBot");
				default:
					return new RandomBot("Default");
				}
			}
		}
		return new RandomBot("RandomBot");
	}
}
