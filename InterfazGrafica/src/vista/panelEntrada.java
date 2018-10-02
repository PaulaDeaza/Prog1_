package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelEntrada extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JLabel entrada;
	private JTextField numero;
	private JButton btnConvertir;
	public final static String CONVERTIR = "Convertir";
	
	public panelEntrada()
	{
		setLayout(new GridLayout(2, 2));
		TitledBorder titulo = BorderFactory.createTitledBorder("Datos de entrada");
		titulo.setTitleColor(Color.RED);
		setBorder(titulo);
		entrada = new JLabel("Digite un valor");
		numero = new JTextField("");
		numero.setForeground(Color.DARK_GRAY);
		entrada.setBackground(Color.ORANGE);
		btnConvertir = new JButton("Convertir");
		btnConvertir.setActionCommand(CONVERTIR);
		
		add(entrada);
		add(numero);
		add(new JLabel(""));
		add(btnConvertir);
		
	}

	public JLabel getEntrada() {
		return entrada;
	}

	public void setEntrada(JLabel entrada) {
		this.entrada = entrada;
	}

	public JTextField getNumero() {
		return numero;
	}

	public void setNumero(JTextField numero) {
		this.numero = numero;
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
