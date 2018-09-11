package modelo;

public class SuperMan extends Kryptonian implements Flyer
{

	private double altura;
	public SuperMan()
	{
		this.altura = 3;
		super.poder = "Invisibilidad";
	
	}
	public String saltarMuros()
	{
		return "Mis piernas son extremadamente largas, capaces de saltar muros de 50 metros";
	}
	public String detenerBala()
	{
		return "Soy capaz de detener balas de ametralladoras";
		
	}
	@Override
	public String despegar() {
		return "Puedo despegar desde el mar, mido " + this.altura+" metros, tengo el poder de "+ super.poder;
	}

	@Override
	public String aterrizar() {
		return "Puedo aterrizar en fuego y lugares rocosos";
		
	}

	@Override
	public String fly() {
		return "Vuelo a 800km/h";
	}

	@Override
	public String salvar() {
		
		return "He salvado aproximadamente 52839 vidas";
	}

	@Override
	public String comer() {
		
		return "¡¡SUPER MAN!!, me alimento de frutas y verduras";
	}

	
}
