package co.edu.unbosque.controller;

import co.edu.unbosque.model.Gesti�nArchivos;
import co.edu.unbosque.view.View;

public class Controller {

	private Gesti�nArchivos m;
	private View gui;

	public Controller() {
		m = new Gesti�nArchivos();
		gui = new View();
		funcionar();
	}

	public void funcionar() {
		
        
		gui.escribirDato(m.gestionarPropiedades(gui.nombreArtista(),gui.nombreCompositor())); 
		gui.escribirDato(m.gestionarArchivoCadena(gui.guardarDireccionArchivo()));
		

	}

}
