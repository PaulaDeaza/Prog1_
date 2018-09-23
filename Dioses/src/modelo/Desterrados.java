package modelo;

public class Desterrados extends KublaKan
{

	private String nombre;
	public Desterrados(String nombre)
	{
		this.nombre = "Rank";
		super.alma = false;
		super.colorDeOjos = "verdes";
		super.edad = 1500;
		super.estatura = 1.70;
	
	}
	public void imprimirDatosDesterrados()
	{
		System.out.println("¡¡DESTERRADOS!!");
		System.out.println("Me llamo " + this.nombre);
		System.out.println("Puedo vivir aproximadamente " + super.edad + " años");
		System.out.println("Mido " + super.estatura + " metros");
		System.out.println("Mis ojos son de color " + super.colorDeOjos);
		
	}
	public void habitar() {
		System.out.println("Habito en e extremo sur del planeta");
		
	}
	public void sentir() {
		System.out.println("No sentimos a nadie más que a nosotros mismos");
		
	}
	public void arrastrar()
	{
		System.out.println("Nos podemos arrastrar de un lugar a otro");
	}

}
