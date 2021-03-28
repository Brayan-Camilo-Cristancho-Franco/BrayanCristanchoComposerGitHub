package co.edu.unbosque.view;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class View {

	private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo txt", "txt");

	public void escribirDato(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public String guardarDireccionArchivo() {

		String seleccion = "";
		boolean m;
		JFileChooser filechooser = new JFileChooser("C:\\data");
		
		do {
		filechooser.setFileFilter(filter);	
		int opcion = filechooser.showSaveDialog(filechooser);	
		if (opcion == JFileChooser.APPROVE_OPTION ) {
			
			m=true;
			seleccion = filechooser.getSelectedFile() + ".txt";
		} else {
			m=false;
			JOptionPane.showMessageDialog(null, "No ha guardado correctamente su archivo");

		}
		}while(m==false );

		return seleccion;
	}

	public String nombreArtista() {
		String nombreArtista="";
		nombreArtista=JOptionPane.showInputDialog("Por favor ingrese el nombre del artista que va a cantar esta canción");
		return nombreArtista;
	}
	
	public String nombreCompositor() {
		String nombreCompositor="";
		nombreCompositor=JOptionPane.showInputDialog("Por favor ingrese el nombre del compositor de esta canción");
		return nombreCompositor;
	}


}
