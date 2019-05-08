package co.grandcircus;

public class Player1 extends Player {
	private int pl1 = 0;
	
	public int getPl1() {
		return pl1;
	}

	public void setPl1(int pl1) {
		this.pl1 = pl1;
	}

	// rock player
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
