package modelo;

import javax.swing.JOptionPane;

public class Mund {
	private double cat1;
	private double cat2;
	private double h;
	private double x;
	
	public Mund()
	{
		this.cat1 = 0;
		this.cat2=0;
		this.h = 0;
		this.x= 0;
	}
	public void calcularHipotenusa()
	{
		cat1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del primer cateto"));
		cat2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del segundo cateto"));
		x = Math.pow(cat1, 2) + Math.pow(cat2, 2);
		h = Math.sqrt(x);
		JOptionPane.showMessageDialog(null, "La hipotenusa es: " + h);
	
	}

}
