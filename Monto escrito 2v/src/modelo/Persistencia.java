package modelo;

public class Persistencia {

	private String unidades[] = {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco", "seis" ,"siete" ,"ocho" ,"nueve","diez"};
	private String decenas[] = {"Veinte", "Treinta","Cuarenta","Cincuenta", "Sesenta","Setenta", "Ochenta", "Noventa"};
	private String otros[] = {"once", "doce","trece","catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
	private String monto = "";
	
	public String calcularMonto(int pNum)
	{
		
		if(pNum>=0 && pNum<=10)
		{
			monto = unidades[pNum] + " euros";
			
		}
		else if(pNum>10 && pNum<=19)
		{
			monto = otros[pNum-11] + " euros";
		}
		else if(pNum>=20 && pNum<100)
		{
			int dec = pNum / 10;
			int uni = pNum % 10;
			monto =  (decenas[dec-2] +" y " + unidades[uni] + " euros");
		}
		else{
			monto = "¡¡ERROR!! -----> Ingrese un número entre 0 y 99";
		}
		return monto;
	
	}

	public String getMonto() {
		return monto;
	}


	public void setMonto(String monto) {
		this.monto = monto;
	}

	
}
