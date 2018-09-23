package modelo;

public class Mundo {

	Heroes h;
	Desterrados d;
	Mortales m;

	public Mundo()
	{
		this.h = new Heroes("Kira", "Astar");
		this.d = new Desterrados("Renk");
		this.m = new Mortales("Daniel", "Paula");
	}

	public Heroes getH() {
		return h;
	}

	public void setH(Heroes h) {
		this.h = h;
	}

	public Desterrados getD() {
		return d;
	}

	public void setD(Desterrados d) {
		this.d = d;
	}

	public Mortales getM() {
		return m;
	}

	public void setM(Mortales m) {
		this.m = m;
	}


}
