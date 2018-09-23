package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public Interfaz()
	{
		
	}
	public String pedirRadio()
	{
		return JOptionPane.showInputDialog(null,"Ingrese el radio del circulo", "Radio",JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirLadoCuadrado()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el lado del cuadrado", "Lado", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirLadoT()
	{
		return JOptionPane.showInputDialog(null, "Ingrese el lado del triangulo", "Lado", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirBase()
	{
		return JOptionPane.showInputDialog(null, "Ingrese la base del triangulo", "Base", JOptionPane.INFORMATION_MESSAGE);
	}
	public String pedirAltura()
	{
		return JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo", "Altura", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void imprimirDatos(String figura,double area, double perimetro)
	{
		String texto = "";
		texto = "El area es: " + area + "\n";
		texto = texto + "El perimetro es: " + perimetro;
		escribirResultado(texto, figura);
	}
	private void escribirResultado(String texto, String titulo) {

		JOptionPane.showMessageDialog(null, texto, titulo, JOptionPane.INFORMATION_MESSAGE );
		
	}


}
