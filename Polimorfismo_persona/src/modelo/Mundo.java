package modelo;

public class Mundo {

	private Alumno al;
	private Profesor p;
	private Persona per;
	
	public Mundo()
	{
		al = new Alumno();
		p = new Profesor();
		per = new Persona();
	}
	

	public Alumno getAl() {
		return al;
	}

	public void setAl(Alumno al) {
		this.al = al;
	}

	public Profesor getP() {
		return p;
	}

	public void setP(Profesor p) {
		this.p = p;
	}

	public Persona getPer() {
		return per;
	}

	public void setPer(Persona per) {
		this.per = per;
	}
	
}
