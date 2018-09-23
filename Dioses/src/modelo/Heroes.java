package modelo;

public class Heroes extends KublaKan
{

	private String nombre1, nombre2;
	public Heroes(String nombre1, String nombre2)
	{
		this.nombre1 = "Kira";
		this.nombre2 = "Astar";
		super.alma = true;
		super.colorDeOjos = "azul";
		super.estatura = 3;
		super.edad = 25;	
	}
	public void datosHeroes()
	{
		System.out.println("¡¡Heroes!!");
		System.out.println("Somos " + this.nombre1 + " y "+ this.nombre2  );
		System.out.println("Medimos " + super.estatura + " metros");
		System.out.println("Tenemos "+super.edad + " años");
		System.out.println("Nuestros ojos son de color " + super.colorDeOjos);
	}
	public void crearFuego()
	{
		System.out.println("Podemos crear fuego");
	}
	public void volar()
	{
		System.out.println("Podemos volar por los aires");
	}
	public void detenerTime()
	{
		System.out.println("Tenemos la capacidad de detener el tiempo");
	}
	public void habitar() {
		System.out.println("Habitamos al norte del planeta");
		
	}
	public void sentir(){
		
		System.out.println("Tenemos la capacidad de sentirme a mi miso y a seres de otros mundos");
		System.out.println("---------------------------------------------------------------");
	}
	

}
