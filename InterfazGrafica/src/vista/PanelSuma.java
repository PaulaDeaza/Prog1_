package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelSuma extends JPanel
{

	private static final long serialVersionUID = 1L;
	private String x;
	private String y;
	private int suma;
	private JLabel resultado;
	
	public PanelSuma()
	{
		setLayout(new GridLayout(1, 2));
		TitledBorder titulo = BorderFactory.createTitledBorder("Suma");
		titulo.setTitleColor(Color.RED);
		setBorder(titulo);
		
	x = new JOptionPane().showInputDialog("Ingrese un valor");
	y =  new JOptionPane().showInputDialog("Ingrese el segundo valor");
	suma = Integer.parseInt(x) + Integer.parseInt(y);
	resultado = new JLabel("La suma es: ");
	

	add(resultado);
	}
}
