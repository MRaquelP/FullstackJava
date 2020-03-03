/**
* @M.Raquel.Parra.Roldán
*/

import java.util.*;
import java.util.ArrayList;

public class television extends Electrodomestico {
	private int resolucion;
	private String sintonizadorTDT;
	
	//Constructor clase hija
	public television(String electro, int precioBase, String color, char cEnergetic, char a, char b, char c, char d,
			char e, char f, float peso, int resolucion, String sintonizadorTDT) {
		super(electro, precioBase, color, cEnergetic, a, b, c, d, e, f, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}



	public static void mostrarDatos() {
		television Tv = new television();
		String getsintonizadorTDT = toString();
		String getResolucion;
		System.out.println("Clase: "+getElectro()+
				"\nColor: " +getColor()+
				"\nPrecio: " +getPrecioBase()+
				"\nConsumo energetico: "+ getcEnergetic()+
				"\nResolucion: "+ getResolucion()+
				"\nSintonizador: "+ getsintonizadorTDT());
		
		
	
	}


	private static String getsintonizadorTDT() {
		return null;
	}


	private static String getResolucion() {
		return null;
	}
	
	
	
}
