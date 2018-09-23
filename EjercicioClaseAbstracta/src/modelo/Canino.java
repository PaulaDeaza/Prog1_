package modelo;

public class Canino extends Mamifero
{
	private String añosVida;

	public Canino()
	{
		this.datosMamifero();
	}
	
	public void datosMamifero() {
		// TODO Auto-generated method stub
		super.numPatas = 4;
		super.comida = "concentrado";
		super.sonido = "GUAU GUAU";
		super.raza = "dalmata";
		this.añosVida = "de 10 a 13 años";
		
	}
	@Override
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Soy un " + super.raza);
		System.out.println("Poseo "+super.numPatas + " patas");
		System.out.println("Vivo aproximadamente "+ this.añosVida);
		System.out.println("Me alimento de "+super.comida);
		System.out.println("Hago " + super.sonido);
		
	}


	

	
		
	}

