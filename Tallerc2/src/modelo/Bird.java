package modelo;

public class Bird extends Animal implements Flyer {

	private String tipo;

	public Bird()
	{
		this.tipo = "aguila";
	}
	public String info()
	{
		return this.tipo;
	}
	public String comer() 
	{
		return "Me alimento de sepientes y ratones";
	}
	public String despegar() 
	{
		return "Me es muy dificil volar, ya que mis alas son muy pesadas y mis plumas son gruesas";
	}
	public String aterrizar() {
		return "Por lo general aterrizo en selvas húmedas";
	}

	public String fly() {
		return "Vuelo a 900 metros de altura";

	}
	public String construirNido()
	{

		return "Construyo mis nidos a aproximadamente 200 metros de altura";
	}
	public String ponerHuevos(){

		return "En promedio pongo de 1 a tres huevos";
	}


}
