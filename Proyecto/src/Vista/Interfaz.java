package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	
	public String pedirPeriodo()
	{
		return JOptionPane.showInputDialog(null,"Ingrese el periodo", "Periodo" , JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirIntereses()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el valor de los intereses","Intereses",  JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirInversion()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el valor de la inversion", "Inversion",JOptionPane.INFORMATION_MESSAGE);
	}
	public void imprimirTasa(String dato,double tasa)
	{
		String linea = "";
		linea = "La tasa efectiva es de: "+ tasa+ "\n";
		escribirTasaEf(linea, dato);
	}
	public void escribirTasaEf(String linea, String titulo) {
		JOptionPane.showMessageDialog(null,linea,titulo, JOptionPane.INFORMATION_MESSAGE);	
	}
	public void imprimirAnualidad(String dato,double anualidad)
	{
		String linea = "";
		linea = "La anualidad es de: "+ anualidad+ "\n";
		escribirAn(linea, dato);
	}
	public void escribirAn(String linea, String titulo) {
		JOptionPane.showMessageDialog(null,linea,titulo, JOptionPane.INFORMATION_MESSAGE);	
	}
	public void imprimirCuota(String dato, double cuota)
	{
		String linea = "";
		linea = "La cuota es de: "+ cuota+ "\n";
		escribirC(linea, dato);
	}
	public void escribirC(String linea, String titulo)
	{
		JOptionPane.showMessageDialog(null,linea,titulo, JOptionPane.INFORMATION_MESSAGE);	
	}
	
	
	
	
	
	
	
	
	
}
