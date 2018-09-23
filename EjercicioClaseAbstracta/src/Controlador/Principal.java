package Controlador;

import modelo.Canino;
import modelo.Felino;
import modelo.Mundo;

public class Principal {

	private static Mundo m;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m = new Mundo();
		m.getFel1().imprimirDatos();
		m.getCan1().imprimirDatos();
		
		
		
	}

}
