package modelo;

public class Canino extends Mamifero
{
	private String a�osVida;

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
		this.a�osVida = "de 10 a 13 a�os";
		
	}
	@Override
	public void imprimirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Soy un " + super.raza);
		System.out.println("Poseo "+super.numPatas + " patas");
		System.out.println("Vivo aproximadamente "+ this.a�osVida);
		System.out.println("Me alimento de "+super.comida);
		System.out.println("Hago " + super.sonido);
		
	}


	

	
		
	}

