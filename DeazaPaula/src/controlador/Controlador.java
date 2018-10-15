package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador implements ActionListener {

	private Mundo bd;

	private Interfaz gui;

	public Controlador() throws IOException {

		bd = new Mundo();
		gui = new Interfaz(this);
		gui.setVisible(true);


		bd.getConfig().getPropiedades();
		bd.getVentas().leerArchivoProductos(bd.getConfig().getArchivoProducto());
		bd.getVentas().leerArchivoDetalleVentas(bd.getConfig().getArchivoDetalleVenta());
		bd.getVentas().consolidarVentas(bd.getConfig().getIVA());
		
		
	}
		public void actionPerformed(ActionEvent evento) {
			// TODO Auto-generated method stub
			if (evento.getActionCommand().equals(gui.getConsolidado().CONSOLIDADO)) 
			{
			
				gui.getConsolidado().getTxtC().setText(bd.getVentas().generarReporteVentas());
			
			}
			else if(evento.getActionCommand().equals(gui.getListado().LISTADO))
			{
				gui.getListado().getTxtLista().setText(bd.getVentas().generarReporteXProducto());
			}

	}

	}

