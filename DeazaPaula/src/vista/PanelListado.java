package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelListado extends JPanel
{

	private static final long serialVersionUID = 1L;
	private JButton btnListado;
	public static final String LISTADO = "Listado";
	private JTextArea txtLista;
	public PanelListado()
	{
		setLayout(new GridLayout(2, 2));
		btnListado = new JButton("Listado de ventas por producto");
		btnListado.setActionCommand(LISTADO);
		
		btnListado.setForeground(Color.WHITE);
		btnListado.setBackground(Color.BLACK);
		txtLista = new JTextArea("");
		txtLista.setForeground(Color.BLACK);
		txtLista.setBackground(Color.WHITE);
		
		add(btnListado);
		add(txtLista);
	}

	public JTextArea getTxtLista() {
		return txtLista;
	}

	public void setTxtLista(JTextArea txtLista) {
		this.txtLista = txtLista;
	}

	public JButton getBtnListado() {
		return btnListado;
	}

	public void setBtnListado(JButton btnListado) {
		this.btnListado = btnListado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getListado() {
		return LISTADO;
	}

}