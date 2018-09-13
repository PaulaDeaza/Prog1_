package controlador;

import Vista.Interfaz;
import modelo.Credito;


public class Controlador {

	private Credito c;
	private Interfaz gui;

	
	public Controlador()
	{
		gui = new Interfaz();
		c = new Credito();
		
		c.setIntereses(Double.parseDouble(gui.pedirIntereses())/100);
	    c.calcularTasaEfect();
	   
	    
	    c.setPeriodo(Double.parseDouble(gui.pedirPeriodo()));
	    c.caclularAnualidad();
	   
	    
	    c.setInversion(Double.parseDouble(gui.pedirInversion()));
	    c.caclularCuota();
	    
	    gui.imprimirTasa("Tasa Efectiva", c.getTasaEfect()*100);
	    gui.imprimirAnualidad("Anualidad", c.getAnualidad());
	    gui.imprimirCuota("Cuota", c.getCuota());
	}
}
