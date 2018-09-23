package modelo;

public class Triangulo implements Figuras
{

	private double lado;
	private double base;
	private double altura;
	double area;
	double perimetro;
	public Triangulo()
	{
		lado = 0;
		base = 0;
		altura = 0;
		area = 0;
	}

	public void calcularArea() {
		area = (base*altura)/2;
	}
	public void calcularPerimetro() {
		perimetro = 2*lado+ base;
	}

	public double getLado1() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
