package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.LetraCanción;

import java.io.File;

import co.edu.unbosque.model.persistence.ArchivoTexto;
import co.edu.unbosque.model.persistence.Propiedades;

public class GestiónArchivos {

	public String gestionarPropiedades(String nombreArtista,String nombreCompositor) {
		Propiedades prop = new Propiedades();

		prop.escribirPropiedades(nombreArtista,nombreCompositor);

		return "Se leyeron estas propiedades:" + "\n" + prop.leerPropiedades();
	}
	
	public String gestionarArchivoCadena(String archivoSeleccionado) {

		LetraCanción a = new LetraCanción();
		ArchivoTexto archivo = new ArchivoTexto();
		
		archivo.escribirArchivo(a.mostrarLetraCanción(),archivoSeleccionado);

		return "Leí este dato : " + archivo.leerArchivo(archivoSeleccionado);

	}

	

}
