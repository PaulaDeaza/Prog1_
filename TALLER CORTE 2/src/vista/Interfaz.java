package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	public Interfaz()
	{
		
	}
 
	public void imprimirInfoPajaro(String info, String comer, String despegar, String aterrizar, String fly, String nido, String huevo )
	{
		String linea = "";
		linea = "Soy un "+info+"\n"+comer+"\n"+despegar+"\n"+aterrizar+"\n"+fly+"\n"+nido+"\n"+huevo;
		escribirInP(linea);
	}
	private void escribirInP(String linea) {
		JOptionPane.showMessageDialog(null, linea,"PAJARO", JOptionPane.INFORMATION_MESSAGE);
	}
	public void imprimirInfoSuperMan(String comer, String despegar, String aterrizar, String fly, String salta, String detiene, String salva)
	{
		String linea = "";
		linea = "Soy  "+comer+"\n"+despegar+"\n"+aterrizar+"\n"+fly+"\n"+salta+"\n"+salva;
		escribirInSuperMan(linea);
	}
	public void escribirInSuperMan(String linea) {
		JOptionPane.showMessageDialog(null, linea,"SUPER MAN", JOptionPane.INFORMATION_MESSAGE);
	}
	public void imprimirInfoHelic(String info,String despegar, String aterrizar, String fly, String acelerar, String medir )
	{
		String linea = "";
		linea = "Soy un "+info+"\n"+despegar+"\n"+aterrizar+"\n"+fly+"\n"+acelerar+"\n"+medir;
		escribirInH(linea);
	}
	private void escribirInH(String linea) {
		JOptionPane.showMessageDialog(null, linea,"HELICOPTERO", JOptionPane.INFORMATION_MESSAGE);
	}
	public void imprimirInfoHidroA(String info,String despegar, String aterrizar, String fly, String medir )
	{
		String linea = "";
		linea = "Soy un "+info+"\n"+despegar+"\n"+aterrizar+"\n"+fly+"\n"+medir;
		escribirInHidro(linea);
	}
	private void escribirInHidro(String linea) {
		JOptionPane.showMessageDialog(null, linea,"HIDRO-AVIÓN", JOptionPane.INFORMATION_MESSAGE);
	}

	
	
}
