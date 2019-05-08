package co.grandcircus;

import java.util.Scanner;

// user
public class Player3 extends Player{
	private String name;
	private int pl3 = 0;
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPl3() {
		return pl3;
	}


	public void setPl3(int pl3) {
		this.pl3 = pl3;
	}


	public Roshambo generateRoshambo() {	
		System.out.println("1. Rock \n2. Paper \n3. Scissors");
		Scanner sc = new Scanner(System.in);
		int num = Validator.getInt(sc, "Enter your choice (1-3): ");

		switch(num) {
		case 1: 
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPPER;
		case 3: 
			return Roshambo.SCISSOR;
		}
		return null;
	}
}
