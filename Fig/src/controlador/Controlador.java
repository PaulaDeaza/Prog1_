package controlador;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.Triangulo;
import vista.Interfaz;

public class Controlador {

	private Circulo cir;
	private Cuadrado c;
	private Triangulo t;
	private Interfaz gui;
	
	public Controlador()
	{
		cir = new Circulo();
		c = new Cuadrado();
		t = new Triangulo();
		gui = new Interfaz();
		
		//cambiarLado(ingrese el lado)
		c.setLado(Double.parseDouble(gui.pedirLadoCuadrado()));
		c.calcularArea();
		c.calcularPerimetro();
		gui.imprimirDatos("Cuadrado", c.getArea(), c.getPerimetro());
		
		cir.setRadio(Double.parseDouble(gui.pedirRadio()));
		cir.calcularArea();
		cir.calcularPerimetro();
		gui.imprimirDatos("Circulo", cir.getArea(), cir.getPerimetro());
	
		t.setLado(Double.parseDouble(gui.pedirLadoT()));
		t.setBase(Double.parseDouble(gui.pedirBase()));
		t.setAltura(Double.parseDouble(gui.pedirAltura()));
		
		t.calcularArea();
		t.calcularPerimetro();
		gui.imprimirDatos("Triangulo", t.getArea(), t.getPerimetro());
		
		
	}
}
