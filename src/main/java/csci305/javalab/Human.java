package csci305.javalab;

import java.util.Scanner;

public class Human extends Player {
	public Human(String name){
		super(name);
	}
	@SuppressWarnings("resource")
	@Override
	public Element play(){
		System.out.println("(1) : Rock \n (2) : Paper \n (3) : Scissors \n (4) : Lizard \n (5) : Spock");
		boolean valid = false;
		while(!valid){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your move: ");
			int choice = in.nextInt();
			if(choice < 1 || choice > 5) System.out.println("Invalid Move. Please try again.");
			else{
				valid = true;
				switch(choice){
				//Rock
				case 1:
					return new Rock("Rock");
				//Paper
				case 2:
					return new Paper("Paper");
				//Scissors
				case 3:
					return new Scissors("Scissors");
				//Lizard
				case 4:
					return new Lizard("Lizard");
				//Spock
				case 5:
					return new Spock("Spock");
				default:
					return new Rock("Rock");
				}
			}
			in.close();
		}

		return null;
	}
}