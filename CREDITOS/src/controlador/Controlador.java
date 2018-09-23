package controlador;

import modelo.Credito;
import vista.Interfaz;

public class Controlador {

	private Credito c;
	private Interfaz gui;
	
	public Controlador()
	{
		c = new Credito();
		gui = new Interfaz();
		
		c.setInteres(Double.parseDouble(gui.pedirInteres()));
		c.caclularTasaEfectiva();
		
		c.setPeriodo(Double.parseDouble(gui.pedirPeriodo()));
		c.calcularAnualidad();
		
		c.setInversion(Double.parseDouble(gui.pedirInversion()));
		c.caclularCuota();
	
		gui.imprimirTasa("Tasa efectiva", c.getTasaEfect());
		gui.imprimirAn("Anualidad", c.getAnualidad());
		gui.imprimirC("Cuota", c.getCuota());
	}
}
