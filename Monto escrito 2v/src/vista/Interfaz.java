package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.Persistencia;

public class Interfaz extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private Panelingresar panelEntrada;
	private PanelResultados panelResultado;
	private Persistencia p;
	
	
	public Interfaz()
	{
		setSize(550,400);
		setResizable(false);
		setTitle("Monto escrito");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelEntrada = new Panelingresar();
		add(panelEntrada, BorderLayout.NORTH);
		
		panelResultado = new PanelResultados();
		add(panelResultado, BorderLayout.CENTER);
		
		panelEntrada.getBtnConvertir().addActionListener(this);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getActionCommand().equals(panelEntrada.CONVERTIR))
		{

			panelResultado.getTxtMonto().setText(p.calcularMonto(Integer.parseInt(panelEntrada.getNumero())));
		}
		
	}
}
