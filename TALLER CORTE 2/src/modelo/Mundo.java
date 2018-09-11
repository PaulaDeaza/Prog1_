package modelo;

public class Mundo {
	
	private Bird pajaro;
	private SuperMan sm;
	private Helicoptero h;
	private HidroAvion sp;
	
	public Mundo()
	{
		pajaro = new Bird();
		sm = new SuperMan();
		h = new Helicoptero();
		sp = new HidroAvion();
	}
	public Bird getPajaro() {
		return pajaro;
	}

	public void setPajaro(Bird pajaro) {
		this.pajaro = pajaro;
	}

	public SuperMan getSm() {
		return sm;
	}

	public void setSm(SuperMan sm) {
		this.sm = sm;
	}

	public Helicoptero getH() {
		return h;
	}

	public void setH(Helicoptero h) {
		this.h = h;
	}

	public HidroAvion getSp() {
		return sp;
	}

	public void setSp(HidroAvion sp) {
		this.sp = sp;
	}

}
