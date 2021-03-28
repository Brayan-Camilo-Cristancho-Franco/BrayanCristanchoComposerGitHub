package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.LetraCanci�n;

import java.io.File;

import co.edu.unbosque.model.persistence.ArchivoTexto;
import co.edu.unbosque.model.persistence.Propiedades;

public class Gesti�nArchivos {

	public String gestionarPropiedades(String nombreArtista,String nombreCompositor) {
		Propiedades prop = new Propiedades();

		prop.escribirPropiedades(nombreArtista,nombreCompositor);

		return "Se leyeron estas propiedades:" + "\n" + prop.leerPropiedades();
	}
	
	public String gestionarArchivoCadena(String archivoSeleccionado) {

		LetraCanci�n a = new LetraCanci�n();
		ArchivoTexto archivo = new ArchivoTexto();
		
		archivo.escribirArchivo(a.mostrarLetraCanci�n(),archivoSeleccionado);

		return "Le� este dato : " + archivo.leerArchivo(archivoSeleccionado);

	}

	

}
