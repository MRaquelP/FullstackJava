/**
* @M.Raquel.Parra.Roldán
*/

import java.util.*;
import java.util.ArrayList;

//Clase Padre
public class Electrodomestico {
	static Electrodomestico electro = new Electrodomestico();//instanciador de electro
	
	private static final char A = 0;
	private static final char B = 0;
	private static final char C = 0;
	private static final char D = 0;
	private static final char E = 0;
	private static final char F = 0;

	//Atributo de clase padre
	protected static int precioBase;
	protected static char cEnergetic;
	protected static float peso;
	protected static String color;
	
	
	//Constructor
	public Electrodomestico(Electrodomestico electro, int precioBase, 
			String color, char cEnergetic, char a, char b, char c,
			char d, char e, char f, float peso) {
		super();
		this.electro = electro;
		this.precioBase = precioBase;
		this.color = color;
		this.cEnergetic = cEnergetic;
		char A = a;
		char B = b;
		char C = c;
		char D = d;
		char E = e;
		char F = f;
		this.peso = peso;
	}


	public Electrodomestico() {
	}


	//Getters
	public static Electrodomestico getElectro() {
		return electro;
	}

	public static int getPrecioBase() {
		return precioBase;
	}

	public static String getColor() {
		return color;
	}

	public static char getcEnergetic() {
		return cEnergetic;
	}

	public char getA() {
		return A;
	}

	public char getB() {
		return B;
	}

	public char getC() {
		return C;
	}

	public char getD() {
		return D;
	}

	public char getE() {
		return E;
	}

	public char getF() {
		return F;
	}

	public float getPeso() {
		return peso;
	}
	

	public static void main1(String[] args) {
		Electrodomestico electro = new Electrodomestico();
		lavadora lav = new lavadora(precioBase);
		lavadora.mostrarDatos();
		
	for(boolean ciclo = true; ciclo;) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("     - Menu de electrodomesticos-    "+
					   "1) Seleccion de producto"+
					   "2) Color"+
					   "3) Precio"+
					   "4) Consumo energetico"+
					   "5) Peso de productos"+
					   "6) Salir"+
					   "____________________________________");
	

	
			int val = Validacion(sc.nextLine());
			System.out.println("-----------------------");
			switch(val) 
			{
			case 1:
				lavadora.mostrarDatos();
				television.mostrarDatos();
				break;
			case 2:
				Electrodomestico.getColor();
				break;
			case 3:
				precioFinal.mostrarDatos();
				break;
			case 4:
				Electrodomestico.cEnegetic();
				break;
			case 5:
				System.err.println("Gracias por visitar nuestra galeria de Electrodomesticos");
				ciclo = false;
			}
			
		}
	}
	private static void cEnegetic() {
		
		
	}


	public static void main(String[] args) {
		
		
		}


	private static int Validacion(String nextLine) {
		return 0;
	}
}

