package vista;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.Persona;
import modelo.Profesor;


public class Interfaz {

	private Persona personas[];
	
	public Interfaz()
	{
		personas = new Persona[3];
		personas[0] = new Persona();
		personas[1] = new Alumno();
		personas[2] = new Profesor();
	}
	public void imprimir()
	{
		for (int i=0 ; i<3; i++) {
			JOptionPane.showMessageDialog(null,personas[i], "Polimorfismo", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
}
