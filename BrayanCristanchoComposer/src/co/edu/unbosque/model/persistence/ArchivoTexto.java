package co.edu.unbosque.model.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


import java.io.FileWriter;

public class ArchivoTexto {

	

	public int escribirArchivo(String dato,String archivoData) {
		
		File f =new File(archivoData);

		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);

			pw.print(dato);

			fw.close();


		} catch (IOException e) {

			return -1;
		}

		return 0;
	}

	public String leerArchivo(String archivoData) {
		
		File f=new File(archivoData);
		String linea = "";
		String cadena = "";

		try {

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {

				cadena += "\n" + linea;

				linea = br.readLine();

			}
			fr.close();

		} catch (IOException e) {

			return null;

		}

		return cadena;
	}

}
