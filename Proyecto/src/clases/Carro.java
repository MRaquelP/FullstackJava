package clases;

import java.util.Scanner;

//Clase Padre que define los distintos carros que administra la PKS
public class Carro {
	
	//atributos
	
	protected String tipoCarro;
	protected int cantidadOcupantes;
	protected String fechaIngresoInst;
	protected int fila; //ubicación en el tablero virtual de 15x15 atributos fila y columna.
	protected int columna;
	
	

	//toString
	@Override
	public String toString() {
		return "Carro [tipoCarro=" + tipoCarro + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInst="
				+ fechaIngresoInst + ", fila=" + fila + ", columna=" + columna + "]";
	}

	//constructores
		
	
	public Carro(String tipoCarro, int cantidadOcupantes, String fechaIngresoInst, int fila, int columna) {
		super();
		
		this.tipoCarro = tipoCarro;
		this.cantidadOcupantes = cantidadOcupantes;
		this.fechaIngresoInst = fechaIngresoInst;
		this.fila = fila;
		this.columna = columna;
		
		
	}

	
	
	public Carro(){
		tipoCarro();
		cantidadOcupantes();
		FechaIngresoInst();
		fila();
		columna();
	}
	
	//getters y setters
	
	
	
	public String getTipoCarro() {
		return tipoCarro;
	}

	
	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public String getFechaIngresoInst() {
		return fechaIngresoInst;
	}

	public void setFechaIngresoInst(String fechaIngresoInst) {
		this.fechaIngresoInst = fechaIngresoInst;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	
	//metodo que solicita el tipo de carro, desde el constructor Carro
	public void tipoCarro() {
			
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa el tipo de Carro:");
	tipoCarro = scan.nextLine();
	}
		
	//metodo que solicita cantidad de ocupantes, desde el constructor Carro
	public void cantidadOcupantes() {
			
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa la cantidad de Ocupantes del tipo de carro " + getTipoCarro() + ":");
	cantidadOcupantes = scan.nextInt();
	}
	
	//metodo que solicita fecha de ingreso en la institucion, desde el constructor Carro
	public void FechaIngresoInst() {
					
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa la fecha de Ingreso del carro " + getTipoCarro() + ":");
	fechaIngresoInst = scan.nextLine();
	}
	
	//metodo que solicita ingresar la coordenada Fila, desde el constructor Carro
	public void fila() {
						
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa fila donde esta el carro " + getTipoCarro() + ":");
	fila = scan.nextInt();
	}
	
	//metodo que solicita ingresar la coordenada Columna, desde el constructor Carro
	public void columna() {
							
	Scanner scan = new Scanner (System.in);
	System.out.println("Ingresa columna donde esta el carro " + getTipoCarro() + ":");
	columna = scan.nextInt();
		}
	
	//metodo despliegue de datos
	
	public void despliegueDatos() {
		System.out.println("Tipo de Carro:" +  getTipoCarro());
		System.out.println("Cantidad de Ocupantes:" +  getCantidadOcupantes());
		System.out.println("Fecha de Ingreso:" +  getFechaIngresoInst());
		System.out.println("Fila:" +  getFila());
		System.out.println("Columna:" +  getColumna());
		
	}
}