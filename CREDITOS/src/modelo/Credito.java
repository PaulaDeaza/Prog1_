package modelo;

public class Credito {

	private double periodo;
	private double interes;
	private double inversion;
	private double tasaEfect;
	private double anualidad;
	private double cuota;
	
	public Credito()
	{
		double periodo = 0;
		double interes = 0;
		double inversion = 0;
	}
	public void caclularTasaEfectiva()
	{
		
		double c = Math.pow(1.0+(interes), (1.0/12.0));
		tasaEfect = (c-1.0 );
	
	}
	public void calcularAnualidad()
	{	
		double tasaE = tasaEfect;
		double parte1 = 1 + tasaEfect;
		double parte2 = Math.pow(parte1, -periodo);
		double parte3 = 1 - parte2;
		anualidad = (double)(parte3 / tasaEfect);
	}
	public void caclularCuota()
	{
		cuota =  (inversion / anualidad);
	}
	public double getPeriodo() {
		return periodo;
	}
	public void setPeriodo(double periodo) {
		this.periodo = periodo;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
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
