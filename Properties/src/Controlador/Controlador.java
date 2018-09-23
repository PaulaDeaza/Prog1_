package Controlador;

import modelo.Persistencia;

public class Controlador {


Persistencia p;

public Controlador()
{
	p = new Persistencia();

	p.setPropiedades();
	p.getPropiedades();
	
}
}
