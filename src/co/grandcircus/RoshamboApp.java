package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {
/*****************@author Linmei Mill*****************/
	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors!");

		Scanner sc = new Scanner(System.in);
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		
		String name = Validator.getString(sc, "Enter you name: ");
		p3.setName(name);

		System.out.println("Hello " + p3.getName()+ ",");
		String continuePlay = "y";
		int choosePlayer = Validator.getInt(sc," would you like to play against Player1 or Player2?(1/2): "); 

		do {
			if(choosePlayer == 1) {
				userAgainsPlayer1(p1, p3);
			}else if( choosePlayer == 2) {
				userAgainstPlayer2(p2, p3);
			}else { 
				System.out.println("Please enter 1 or 2 only");
			}
			continuePlay = Validator.getStringMatchingRegex(sc, "Try again?(y/n)", "[yYnN ]+");
		}while(continuePlay.equalsIgnoreCase("y"));
		System.out.println("Player1: " + p1.getPl1());
		System.out.println("Player2: " + p2.getPl2());
		System.out.println(p3.getName() +": " + p3.getPl3());
		System.out.println("Good game!");
	
	}

	private static void userAgainstPlayer2(Player2 p2, Player3 p3) {
		Roshambo  r = p2.generateRoshambo();
		Roshambo u = p3.generateRoshambo();
		if(r.equals(u)) {
			System.out.println("Player2: " + r);
			System.out.println(p3.getName() + ": "+ u);
			System.out.println("Even!");
		}else if(r.equals(Roshambo.ROCK) && u.equals(Roshambo.PAPPER) ||
				r.equals(Roshambo.PAPPER) && u.equals(Roshambo.SCISSOR) ||
				r.equals(Roshambo.SCISSOR) && u.equals(Roshambo.ROCK)){
			System.out.println("Player2: " + r);
			System.out.println(p3.getName() + ": "+ u);
			System.out.println(p3.getName() + " Win!");
			p3.setPl3(p3.getPl3()+1);
		}else {
			System.out.println("Player2: " + r);
			System.out.println(p3.getName() + ": "+ u);
			System.out.println(p3.getName()+ " Lost!");
			p2.setPl2(p2.getPl2()+1);
		}
	}

	private static void userAgainsPlayer1(Player1 p1, Player3 p3) {
		Roshambo player1Result = p1.generateRoshambo();
		Roshambo userResult = p3.generateRoshambo();
		if(userResult.equals(player1Result)) {
			System.out.println("Player1: " + player1Result);
			System.out.println(p3.getName() + ": "+ userResult);
			System.out.println("Even!");
		}else if(userResult.equals(Roshambo.PAPPER)) {
			System.out.println("Player1: " + player1Result);
			System.out.println(p3.getName() + ": "+ userResult);
			System.out.println(p3.getName() + " Win!");
			p3.setPl3(p3.getPl3()+1);
		}else {
			System.out.println("Player1: " + player1Result);
			System.out.println(p3.getName() + ": " + userResult);
			System.out.println(p3.getName() + " Lost!");
			p1.setPl1(p1.getPl1()+1);
		}
	}

}
