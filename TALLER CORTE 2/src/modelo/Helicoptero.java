package modelo;

public class Helicoptero extends Avion
{

	private int numPasajeros;
	public Helicoptero()
	{
		super.altura = 8.800;
		this.numPasajeros = 3;
		super.distancia =290;
	}
	public String imprimirInfo()
	{
		return "Helicoptero, mi tope máximo de pasajeros son "+ this.numPasajeros;
	}
	public String acelerar() 
	{
		return "Vuelo a una velocidad de 400km/h";
	}
	@Override
	public String fly() {
		return "Vuelo a una altura de "+super.altura+" metros";
	}
	@Override
	public String despegar() {
		return "Despego desde un helipuerto";
	}
	@Override
	public String aterrizar() {
		return "Aterrizo en un campo abierto";
	}
	@Override
	public String medirdistacia() {
		
		return "Recorro aproximadamente "+ super.distancia+" k/h";
	}
	
}
