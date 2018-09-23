package modelo;

public class Felino extends Mamifero
{
	private int velocidad;
	
	public Felino()
	{
	
		this.datosMamifero();
	}
	
	public void datosMamifero() {
		super.numPatas = 4;
		super.comida = "carne";
		super.sonido = "GRR";
		super.raza = "Jaguar";
		this.velocidad = 60;
		
	}
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Soy un "+super.raza+", tengo " + super.numPatas +" patas");
		System.out.println("Me alimento de " + super.comida);
		System.out.println("Alcanzo una velocidad de "+ this.velocidad+ " kilometros por hora.");
		System.out.println("Y hago "+ super.sonido);
		System.out.println("------------------------------------");
		
	}

	

}
