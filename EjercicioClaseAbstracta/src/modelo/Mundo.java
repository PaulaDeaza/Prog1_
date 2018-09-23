package modelo;

public class Mundo {
	private Canino can1;
	private Felino fel1;


	public Mundo()
	{
		can1 = new Canino();
		fel1 = new Felino();
		
	}


	public Canino getCan1() {
		return can1;
	}


	public void setCan1(Canino can1) {
		this.can1 = can1;
	}


	public Felino getFel1() {
		return fel1;
	}


	public void setFel1(Felino fel1) {
		this.fel1 = fel1;
	}
	


}
