package modelo;

public abstract class Avion extends Vehiculo implements Flyer
{
	
	protected double altura;
	
	public Avion()
	{
		this.altura = 12.000 ;
		super.distancia = 290;
	}
	public abstract String despegar();
	public abstract String aterrizar();
	
}
