package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public String pedirNumero()
	{
		return JOptionPane.showInputDialog(null,"Ingrese el numero a convertir","N�mero", JOptionPane.INFORMATION_MESSAGE);
	}
	public void evaluarM(String monto)
	{
		String cadena = "";
		cadena = "El monto es de: "+ monto+" euros";
		imprimirResultado(cadena, monto);
	}
	public void imprimirResultado(String cadena, String monto) {
		
		JOptionPane.showMessageDialog(null, cadena, monto, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
}
