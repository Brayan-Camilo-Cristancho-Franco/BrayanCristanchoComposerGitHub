package co.edu.unbosque.controller;

import co.edu.unbosque.model.GestiónArchivos;
import co.edu.unbosque.view.View;

public class Controller {

	private GestiónArchivos m;
	private View gui;

	public Controller() {
		m = new GestiónArchivos();
		gui = new View();
		funcionar();
	}

	public void funcionar() {
		
        
		gui.escribirDato(m.gestionarPropiedades(gui.nombreArtista(),gui.nombreCompositor())); 
		gui.escribirDato(m.gestionarArchivoCadena(gui.guardarDireccionArchivo()));
		

	}

}
