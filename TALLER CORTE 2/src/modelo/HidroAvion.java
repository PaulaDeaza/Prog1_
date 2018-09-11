package modelo;

public class HidroAvion extends Avion
{


	private String modelo;
	
	public HidroAvion() {
	
		super.altura = 4.80;
		this.modelo = "Bombardier CL-415";
		super.distancia = 300;
		
	}

	public String imprInfo()
	{
		return "Hidro-avion, modelo "+ this.modelo;
	}
	public String despegar() {
		// TODO Auto-generated method stub
		return "Despego desde superficies liquidas";
	}
	public String aterrizar() {
		// TODO Auto-generated method stub
		return "Generalmente aterrizo en el oceano pacifico";
	}
	
	public String fly() {
		
		return "Mi altura maxima de vuelo es de "+ super.altura+" metros";
	}

	@Override
	public String medirdistacia() {
		// TODO Auto-generated method stub
		return "Recorro aproximadamente "+ super.distancia+" metros";
	}


}
