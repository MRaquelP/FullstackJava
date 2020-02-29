package clases;

import java.util.Scanner;

//Clase hija que define carro Kromi
public class Kromi extends Carro {
	
	//atributos
	private String añoFabricacion;
	private String marca;
			
	//toString
	@Override
	public String toString() {
		return "Kromi [tipoCarro=" + tipoCarro + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInst=" + fechaIngresoInst + ", fila=" + fila + ", columna=" + columna + ", añoFabricacion=" + añoFabricacion + ", marca=" + marca + "]";
	}
	
	//getters and setters	
	public String getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

			
	//constructores
	
	public Kromi(){
		
		añoFabricacion();
		marca();
	}
	
	public Kromi(String tipoCarro, int cantidadOcupantes, String fechaIngresoInst, int fila, int columna, String añoFabricacion, String marca) {
		super(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna);
		this.añoFabricacion = añoFabricacion;
		this.marca = marca;
		
	}

	//metodo que solicita año de fabricación
		public void añoFabricacion() {
				
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa el año de fabricacion del carro " + getTipoCarro() + ":");
		añoFabricacion = scan.nextLine();
		}
		
		//metodo que solicita fecha de ingreso de la marca
		public void marca() {
						
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa la marca del carro " + getTipoCarro() + ":");
		marca = scan.nextLine();
		}
}

