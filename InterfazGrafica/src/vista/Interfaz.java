package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Interfaz extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private panelResultados pr;
	private panelEntrada panelen;
	
	public Interfaz()
	{
		setSize(300,400);
		setResizable(false);
		setTitle("Ejemplo Interfaz");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		panelen = new panelEntrada();
		add(panelen,BorderLayout.NORTH);
		
		pr = new panelResultados();
		add(pr,BorderLayout.CENTER);
		panelen.getBtnConvertir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(panelen.CONVERTIR)) {
			pr.getTxtMonto().setText(panelen.getNumero().getText()+ " Procesado");
		}
	}

}
