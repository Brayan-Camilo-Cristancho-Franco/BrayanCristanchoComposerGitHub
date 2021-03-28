package co.edu.unbosque.model.persistence;

import java.util.Random;

public class LetraCanción {

	private String letra1[];
	private String letra2[];
	private String letra3[];
	private String letra4[];
	private String letra5[];
	private String letra6[];
	private Propiedades propiedades = new Propiedades();
	
	

	
	public LetraCanción() {

		letra1 = new String[4];
		letra2 = new String[4];
		letra3 = new String[4];
		letra4 = new String[4];
		letra5 = new String[4];
		letra6 = new String[4];
		arregloLetra();

	}

	public void arregloLetra() {

		letra1[0] = "Mami ";
		letra1[1] = "Bebé ";
		letra1[2] = "Princess ";
		letra1[3] = "Mami ";

		letra2[0] = "yo quiero ";
		letra2[1] = "yo puedo ";
		letra2[2] = "yo vengo a ";
		letra2[3] = "voy a ";

		letra3[0] = "encendelte ";
		letra3[1] = "amalte ";
		letra3[2] = "ligar ";
		letra3[3] = "jugar ";

		letra4[0] = "suave ";
		letra4[1] = "lento ";
		letra4[2] = "rápido ";
		letra4[3] = "fuerte ";

		letra5[0] = "hasta que salga el sol ";
		letra5[1] = "toda la noche ";
		letra5[2] = "hasta el amanecer ";
		letra5[3] = "todo el día ";

		letra6[0] = "sin anestesia ";
		letra6[1] = "sin compromiso ";
		letra6[2] = "feis to feis ";
		letra6[3] = "sin miedo ";

	}

	public String mostrarLetraCanción() {

		Random Posición = new Random();
		int ps1, ps2, ps3, ps4, ps5, ps6;
		String letraCancion = "";
		
		
		propiedades.leerPropiedades();
		int numEstrofas=propiedades.getEstrofas();
		int numLineas=propiedades.getLineas();
		
		for(int i=0;i<numEstrofas;i++) {			
		for(int j=0;j<numLineas;j++) {
			
		ps1 = Posición.nextInt(4);
		ps2 = Posición.nextInt(4);
		ps3 = Posición.nextInt(4);
		ps4 = Posición.nextInt(4);
		ps5 = Posición.nextInt(4);
		ps6 = Posición.nextInt(4);
		
		letraCancion +=letra1[ps1] + letra2[ps2] + letra3[ps3] + letra4[ps4] + letra5[ps5] + letra6[ps6]+"\n";
			
		}
		letraCancion+="\n";
		}
		
		
		return letraCancion;

	}
}
