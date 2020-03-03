/**
* @M.Raquel.Parra.Roldán
*/

import java.util.*;
import java.util.ArrayList;

public class lavadora extends Electrodomestico {
	private static char c;
	private static char f;
	private static char d;
	private static char e;
	private static char a;
	private static int carga;
	private static char b;
	
	//Get
	public static int getCarga() {
		return carga;
	}

	//Constructor clase hija
	public lavadora(int carga) {
		
		super(electro, getPrecioBase(), color, getcEnergetic(), a, b, c, d, e, f, peso);
		this.carga = carga;
	}




		public static void mostrarDatos() {
			System.out.println("Clase: "+getElectro()+
					"\nColor: " +getColor()+
					"\nPrecio: " +getPrecioBase()+
					"\nConsumo energetico: "+ getcEnergetic()+
					"\nCarga: "+ getCarga());
			
			
		}
	
	
	
	

	


}
