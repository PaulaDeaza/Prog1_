package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

	Mundo bd;
	Interfaz gui;
	
	public Controlador()
	{
		bd = new Mundo();
		gui = new Interfaz();
		gui.imprimirInfoPajaro(bd.getPajaro().info(), bd.getPajaro().comer(), bd.getPajaro().despegar(), bd.getPajaro().aterrizar(),bd.getPajaro().fly(), bd.getPajaro().construirNido(), bd.getPajaro().ponerHuevos());
		gui.imprimirInfoSuperMan(bd.getSm().comer(), bd.getSm().despegar(), bd.getSm().aterrizar(), bd.getSm().fly(), bd.getSm().saltarMuros(), bd.getSm().detenerBala(), bd.getSm().salvar());
		gui.imprimirInfoHelic(bd.getH().imprimirInfo(), bd.getH().despegar(), bd.getH().aterrizar(), bd.getH().fly(),bd.getH().acelerar(), bd.getH().medirdistacia());
		gui.imprimirInfoHidroA(bd.getSp().imprInfo(),bd.getSp().despegar(), bd.getSp().aterrizar(), bd.getSp().fly(), bd.getSp().medirdistacia());
	}
	
}
