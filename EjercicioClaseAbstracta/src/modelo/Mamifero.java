package modelo;

public abstract class Mamifero
{
	protected String raza;
	protected int numPatas;
	protected String sonido;
	protected String comida;
	public Mamifero()
	{
		this.raza = "";
		this.numPatas = 0;
	}

	
	public abstract void datosMamifero();
	public abstract void imprimirDatos();
	

	
}
