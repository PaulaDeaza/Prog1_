package modelo;


public class Circulo implements Figuras
{

	private double radio;
	public final static double PI = 3.1416;
	private double area;
	private double perimetro;
	
	public Circulo()
	{
		radio = 0;
		area = 0;
		perimetro = 0;
	}
	public void calcularArea() 
	{
		area = PI * Math.pow(radio, 2);
		
	}
	public void calcularPerimetro() {
		perimetro = 2*PI*radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public static double getPi() {
		return PI;
	}

}
