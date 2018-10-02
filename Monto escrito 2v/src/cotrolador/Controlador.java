package cotrolador;

import modelo.Persistencia;
import vista.Interfaz;

public class Controlador {

	private Interfaz gui;
	

	private Persistencia p;
	
	public Controlador()
	{
		
		p = new Persistencia();
		gui = new Interfaz();
		
		gui.setVisible(true);
	}
}
