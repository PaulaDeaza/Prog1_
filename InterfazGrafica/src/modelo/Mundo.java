package modelo;

public class Mundo {

		Persistencia BD;
		private String dato;
		private int x,y,suma;
		public Mundo() {

			dato = "";
			suma = x + y;
		}

		public String getDato() {
			return dato;
		}

		public void setDato(String dato) {
			this.dato = dato;
		}

		public void procesarDato() {
			this.dato = this.dato + " procesado";
		}

	}
