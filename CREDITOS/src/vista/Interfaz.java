package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public Interfaz()
	{
		
	}
	public String pedirPeriodo()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el periodo", "Periodo", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirInteres()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el valor de los intereses", "Interes", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirInversion()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el valor de la inversion", "Inversion", JOptionPane.INFORMATION_MESSAGE);	
	}
	public void imprimirTasa(String titulo,double tasaEfect)
	{
		String respuesta = "";
		respuesta = ("La tasa efectiva es: "+ tasaEfect);
		escribirResultado(respuesta, titulo);
	}
	public void imprimirAn(String titulo, double anualidad)
	{
		String respuesta = "";
		respuesta = ("La anualidad es: "+ anualidad);
		escribirResultado(respuesta, titulo);
	}
	public void imprimirC(String titulo, double cuota)
	{
		String respuesta = "";
		respuesta = ("La cuota es: "+ cuota);
		escribirResultado(respuesta, titulo);
	}
	private void escribirResultado(String titulo,String respuesta) {

		JOptionPane.showMessageDialog(null, titulo, respuesta, JOptionPane.INFORMATION_MESSAGE);
	}

}
