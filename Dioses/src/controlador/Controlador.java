package controlador;

import modelo.Mundo;

public class Controlador {

	Mundo m = new Mundo();
	public  Controlador()
	{
		m.getH().datosHeroes();
		m.getH().crearFuego();
		m.getH().detenerTime();
		m.getH().habitar();
		m.getH().sentir();
		
		m.getM().imprimirDatos();
		m.getM().adquirirC();
		m.getM().ejercerProfesion();
		m.getM().tenerFamilia();
		m.getM().sentir();
		m.getM().habitar();
		
		m.getD().imprimirDatosDesterrados();
		m.getD().habitar();
		m.getD().sentir();
		m.getD().arrastrar();
	}
}
