package clases;

import java.util.Scanner;

//Clase hija que define carro Caguano
public class Caguano extends Carro {
	
	//atributos
	private String alcanceTiro;
	private String colorConfeti;
		
	//toString
	@Override
	public String toString() {
		return "Caguano [tipoCarro=" + tipoCarro + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInst=" + fechaIngresoInst + ", fila=" + fila + ", columna=" + columna + ", alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}
	
	//getters and setters
	public String getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(String alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

		
	//constructor
	
	public Caguano(){
		
		alcanceTiro();
		colorConfeti();
	
	}
	
	public Caguano(String tipoCarro, int cantidadOcupantes, String fechaIngresoInst, int fila, int columna, String alcanceTiro, String colorConfeti) {
		super(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna);
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		
	}

	//metodo que solicita el alcance de Tiro
	public void alcanceTiro() {
					
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa el alcance de tiro del carro " + getTipoCarro() + ":");
	alcanceTiro = scan.nextLine();
	}
	
	//metodo que solicita el color confeti
	public void colorConfeti() {
					
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa el color confeti que arroja el carro " + getTipoCarro() + ":");
	colorConfeti = scan.nextLine();
	}
}
