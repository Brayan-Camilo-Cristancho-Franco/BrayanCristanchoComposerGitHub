package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoprop = "./Data/archivo.properties";

	private int lineas;
	private int estrofas;

	public int escribirPropiedades(String nombreArtista,String nombreCompositor) {

		try {
			prop.setProperty("numeroDeEstrofas", "3");
			prop.setProperty("numeroDeLineas", "4");
			prop.setProperty("nombreDelArtista",nombreArtista);
			prop.setProperty("nombreDelCompositor",nombreCompositor);
			prop.store(new FileOutputStream(archivoprop), null);

		}

		catch (IOException ex) {
			return -1;
		}
		return 0;
	}

	public String leerPropiedades() {

		String linea = "";
		try {
			prop.load(new FileInputStream(archivoprop));

			prop.list(System.out);

 			linea += "Número de estrofas :" + prop.getProperty("numeroDeEstrofas") + "\n";
			linea += "Número de lineas :" + prop.getProperty("numeroDeLineas") + "\n";
			linea += "Nombre del artista que cantará la canción :" + prop.getProperty("nombreDelArtista") + "\n";
			linea+= "Nombre del compositor :"+prop.getProperty("nombreDelCompositor") + "\n";

			estrofas = Integer.parseInt(prop.getProperty("numeroDeEstrofas"));
			lineas = Integer.parseInt(prop.getProperty("numeroDeLineas"));

		} catch (IOException eX) {
			return null;
		}
		return linea;

	}

	public int getLineas() {
		return lineas;
	}

	public int getEstrofas() {
		return estrofas;
	}

}
