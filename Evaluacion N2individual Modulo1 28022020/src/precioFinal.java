/**
* @M.Raquel.Parra.Roldán
*/

import java.util.*;
import java.util.ArrayList;

public class precioFinal extends Electrodomestico{
	
	private char cEnergetic;	
	private char A; char B; char C; char D; char E; char F;
	
	public precioFinal(String electro, int precioBase, String color, char cEnergetic, char a, char b, char c, char d,
			char e, char f, float peso, char cEnergetic2, char a2, char b2, char c2, char d2, char e2, char f2) {
		super(electro, precioBase, color, cEnergetic, a, b, c, d, e, f, peso);
		cEnergetic = cEnergetic2;
		A = a2;
		B = b2;
		C = c2;
		D = d2;
		E = e2;
		F = f2;
	}

	public static void mostrarDatos() {
		System.out.println("Clase: "+getElectro()+
				"\nColor: " +getColor()+
				"\nPrecio: " +getPrecioBase()+
				"\nConsumo energetico: "+ getcEnergetic());
	
	
	
	}
	
	
}
