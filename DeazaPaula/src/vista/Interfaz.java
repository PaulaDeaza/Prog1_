package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controlador.Controlador;
import modelo.Mundo;

public class Interfaz extends JFrame
{

	
	private static final long serialVersionUID = 1L;
	private Mundo m;
	private PanelConsolidado consolidado;
	private PanelListado listado;
	
	
	public Interfaz(Controlador control) throws IOException
	{
		m = new Mundo();
		setSize(550,180);
		setResizable(false);
		setTitle("Tienda generica");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		this.getContentPane().setBackground(Color.PINK);
		
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 2));
		
		consolidado = new PanelConsolidado();
		add(consolidado);
		
		listado = new PanelListado();
		add(listado);
		
		consolidado.getBtnConsolidado().addActionListener(control);
		listado.getBtnListado().addActionListener(control);
	}


	public Mundo getM() {
		return m;
	}


	public void setM(Mundo m) {
		this.m = m;
	}


	public PanelConsolidado getConsolidado() {
		return consolidado;
	}


	public void setConsolidado(PanelConsolidado consolidado) {
		this.consolidado = consolidado;
	}


	public PanelListado getListado() {
		return listado;
	}


	public void setListado(PanelListado listado) {
		this.listado = listado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
