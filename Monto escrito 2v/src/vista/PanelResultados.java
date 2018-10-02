package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField montoEscrito;
	private JTextField txtMonto;
	
	PanelResultados()
	{
	
		setLayout(new GridLayout(2, 1));
		TitledBorder border = new TitledBorder("Monto");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		resultado = new JLabel("El monto escrito es: ");
		txtMonto = new JTextField("");
		txtMonto.setForeground(Color.BLACK);
		txtMonto.setBackground(Color.WHITE);
		
		add(resultado);
		add(txtMonto);
		
		
		}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}

	public JTextField getMontoEscrito() {
		return montoEscrito;
	}

	public void setMontoEscrito(JTextField montoEscrito) {
		this.montoEscrito = montoEscrito;
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
