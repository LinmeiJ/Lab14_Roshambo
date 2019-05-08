package co.grandcircus;

public enum Roshambo {
	ROCK, PAPPER, SCISSOR;
	
	public String toString(){
		switch(this){
		case ROCK:
			return "Rock";
		case PAPPER:
			return "Papper";
		default:
			return "Scissor";
		}
	}
}
