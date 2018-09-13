package modelo;

import java.awt.print.Printable;

public class Credito {

	private double periodo;
	private double intereses;
	private double inversion;
	private double tasaEfect;
	private double anualidad;
	private double cuota;
	
	private double tabla [][];
	public Credito()
	{
		tabla = new double[(int) periodo][5];
		periodo =0 ;
		intereses = 0;
		inversion = 0;
		tasaEfect = 0;
		anualidad = 0;
		cuota = 0;
	}
	public void calcularTasaEfect()
	{

		double c = Math.pow(1.0+(intereses), (1.0/12.0));
		tasaEfect = (c-1.0 );
	}
	public void caclularAnualidad()
	{
		//double tasaE = tasaEfect;
		double parte1 = 1 + tasaEfect;
		double parte2 = Math.pow(parte1, -periodo);
		double parte3 = 1 - parte2;
		anualidad = (double)(parte3 / tasaEfect);
	}
	public void caclularCuota()
	{
		cuota =  (inversion / anualidad);
	}
	public void hacerTabla()
	{
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				double cuotaT= tabla[i][0];
				
			}
		}
	}
	public double getPeriodo() {
		return periodo;
	}
	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}
	public double getIntereses() {
		return intereses;
	}
	public void setIntereses(double intereses) {
		this.intereses = intereses;
	}
	public double getInversion() {
		return inversion;
	}
	public void setInversion(double inversion) {
		this.inversion = inversion;
	}
	public double getTasaEfect() {
		return tasaEfect;
	}
	public void setTasaEfect(double tasaEfect) {
		this.tasaEfect = tasaEfect;
	}
	public double getAnualidad() {
		return anualidad;
	}
	public void setAnualidad(double anualidad) {
		this.anualidad = anualidad;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	
}
