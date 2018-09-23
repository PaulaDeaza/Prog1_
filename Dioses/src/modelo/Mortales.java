package modelo;

public class Mortales extends KublaKan
{

	private String n1, n2;
	public Mortales(String n1, String n2)
	{
		this.n1 = "Paula";
		this.n2 = "Daniel";
		super.colorDeOjos = "Violeta";
		super.alma = true;
		super.edad = 18;
		super.estatura = 500;
		
	}
	public void imprimirDatos()
	{
		System.out.println("¡¡MORTALES!!");
		System.out.println("Me llamo "+ this.n1 );
		System.out.println("Mido " + super.estatura + " metros");
		System.out.println("Tengo " + super.edad + " años");
		System.out.println("Mi color de ojos es: " + super.colorDeOjos);
		
		System.out.println("Me llamo "+ this.n2 );
		System.out.println("Mido " + super.estatura + " metros");
		System.out.println("Tengo " + super.edad + " años");
		System.out.println("Mi color de ojos es: " + super.colorDeOjos);
		
	}
	public void adquirirC()
	{
		System.out.println("Tenemos la capacidad de adquirir conocimiento");
	}
	public void tenerFamilia()
	{
		System.out.println("Tenemos una familia");
	}
	public void ejercerProfesion()
	{
		System.out.println("Somos ingenieros de sistemas");
	}
	public void habitar() {
		System.out.println("Habitamos el este del planeta");
		System.out.println("------------------------------------------");
		
	}
	public void sentir() {
		System.out.println("Podemos sentir al presencia de otros mortales");
		
		
	}

}
