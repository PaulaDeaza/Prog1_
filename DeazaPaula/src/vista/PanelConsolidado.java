package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class PanelConsolidado extends JPanel

{

	private static final long serialVersionUID = 1L;
	private JButton btnConsolidado;
	public static final String CONSOLIDADO = "Consolidado";
	private JTextArea txtC;
	
	public JTextArea getTxtC() {
		return txtC;
	}

	public void setTxtC(JTextArea txtC) {
		this.txtC = txtC;
	}

	public PanelConsolidado()
	{
		setLayout(new GridLayout(2,2));	
		btnConsolidado = new JButton("Consolidado de ventas del día");
		btnConsolidado.setActionCommand(CONSOLIDADO);
		
		btnConsolidado.setForeground(Color.WHITE);
		btnConsolidado.setBackground(Color.BLACK);
		txtC = new JTextArea("");
		txtC.setForeground(Color.BLACK);
		txtC.setBackground(Color.WHITE);
		
		
		add(btnConsolidado);
		add(txtC);
	}

	public JButton getBtnConsolidado() {
		return btnConsolidado;
	}

	public void setBtnConsolidado(JButton btnConsolidado) {
		this.btnConsolidado = btnConsolidado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getConsolidado() {
		return CONSOLIDADO;
	}
}

	