package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{

	private Mundo m;
	private Interfaz gui;
	
	public Controlador()
	{
		m = new Mundo();
		gui = new Interfaz();
		
		gui.setVisible(true);
	}
	
}
