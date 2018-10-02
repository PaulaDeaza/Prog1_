package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import modelo.Persistencia;

public class Panelingresar extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JTextField numero;
	private JLabel entrada;
	private JButton btnConvertir;

	public final static String CONVERTIR = "Convertir";

	
	public Panelingresar()
	{
		setLayout(new GridLayout(2, 2));
		TitledBorder titulo = BorderFactory.createTitledBorder("Número a ingresar");
		titulo.setTitleColor(Color.BLACK);
		setBorder(titulo);
		
		entrada = new JLabel("Ingrese el monto a convertir");
		numero = new JTextField("");
		numero.setForeground(Color.BLUE);
		numero.setBackground(Color.LIGHT_GRAY);
		btnConvertir = new JButton("Convertir");
		btnConvertir.setActionCommand(CONVERTIR);
		
		add(entrada);
		
		add(numero);
		add(new JLabel(""));
		add(btnConvertir);
		
		
			
	}

	public JTextField getNumero() {
		return numero;
	}

	public void setNumero(JTextField numero) {
		this.numero = numero;
	}

	public JLabel getEntrada() {
		return entrada;
	}

	public void setEntrada(JLabel entrada) {
		this.entrada = entrada;
	}

	public JButton getBtnConvertir() {
		return btnConvertir;
	}

	public void setBtnConvertir(JButton btnConvertir) {
		this.btnConvertir = btnConvertir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getConvertir() {
		return CONVERTIR;
	}
	
}
