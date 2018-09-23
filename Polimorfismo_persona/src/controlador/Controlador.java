package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

	private Mundo bd;
	private Interfaz gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new Interfaz();
		
		
		gui.imprimir();
	}
}
