package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelResultados extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField txtMonto;
	
	public panelResultados()
	{
		setLayout(new GridLayout(2, 1));
		TitledBorder border = new TitledBorder("Resultados");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		resultado = new JLabel("El resultado es: ");
		txtMonto = new JTextField("");
		txtMonto.setForeground(Color.RED);
		txtMonto.setBackground(Color.DARK_GRAY);
		
		add(resultado);
		add(txtMonto);
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	public JTextField getTxtMonto() {
		return txtMonto;
	}

	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
