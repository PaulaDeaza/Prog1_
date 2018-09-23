package modelo;

public abstract class KublaKan 
{
	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected boolean alma;
	public KublaKan() {
		this.edad = edad;
		this.estatura = estatura;
		this.colorDeOjos = colorDeOjos;
		this.alma = alma;
	}
	public abstract void habitar();
	public abstract void sentir();

}
