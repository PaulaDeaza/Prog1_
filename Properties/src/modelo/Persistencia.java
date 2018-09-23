package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Persistencia {
	
	
	private Properties prop = new Properties();
	private String archivoprop = "C:\\data\\archivo.properties";
	public void setPropiedades() {
		try {
			prop.setProperty("Nombre", " Paula");
			prop.setProperty("Edad", " 18");
			prop.setProperty("Identificación", " 1019153655");
			prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void getPropiedades() {
		try {
			// load a properties file for reading
			prop.load(new FileInputStream(archivoprop));
			// get the properties and print
			prop.list(System.out);
			//Reading each property value
			System.out.println(prop.getProperty("Nombre"));
			System.out.println(prop.getProperty("Edad"));
			System.out.println(prop.getProperty("Identificación"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
