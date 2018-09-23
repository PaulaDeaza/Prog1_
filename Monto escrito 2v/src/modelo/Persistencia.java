package modelo;

public class Persistencia {

	private String unidades[] = {"cero", "uno", "dos" ,"tres" ,"cuatro" ,"cinco", "seis" ,"siete" ,"ocho" ,"nueve","diez"};
	private String decenas[] = {"veinte", "treinta","cuarenta","cincuenta", "sesenta","setenta", "ochenta", "noventa"};
	private String otros[] = {"once", "doce","trece","catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
	private String monto = "";
	
	public String calcularMonto(int pNum)
	{
		
		if(pNum>=0 && pNum<=10)
		{
			monto = unidades[pNum];
			System.out.println(monto);
		}
		else if(pNum>10 && pNum<=19)
		{
			monto = otros[pNum-11];
		}
		else if(pNum>=20 && pNum<100)
		{
			int dec = pNum / 10;
			int uni = pNum % 10;
			monto =  (decenas[dec-2] +" y " + unidades[uni]);
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
