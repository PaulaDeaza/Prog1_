package modelo;

public class Cuadrado implements Figuras
{

	private double lado;
	private double area;
	private double perimetro;
	
	public Cuadrado()
	{
		lado = 0;
		area = 0;
		perimetro = 0;
	}
	public void calcularArea() {
		
		area = lado * lado;
	}
	public void calcularPerimetro() {
		
		perimetro = 4*lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
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

}
