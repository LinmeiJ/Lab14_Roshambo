package co.grandcircus;
import java.util.Random;

public class Player2 extends Player {
	private int pl2 = 0;
	Random rand =  new Random();

	
	public int getPl2() {
		return pl2;
	}
	
	public void setPl2(int pl2) {
		this.pl2 = pl2;
	}
	
	public Roshambo generateRoshambo() {
		int r= rand.nextInt(3) + 1;
		switch(r) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPPER;
		default: 
			return Roshambo.SCISSOR;
		}
	}

}
