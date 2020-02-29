package clases;

import java.util.Scanner;

//Clase hija que define carro Trupalla
public class Trupalla extends Carro {
	
	//atributos
	private int nivelArmadura;
	private String nombreManipula;
	
	//toString
	@Override
	public String toString() {
		return "Trupalla [tipoCarro=" + tipoCarro + ", cantidadOcupantes=" + cantidadOcupantes + ", fechaIngresoInst=" + fechaIngresoInst + ", fila=" + fila + ", columna=" + columna + ", nivelArmadura=" + nivelArmadura + ", nombreManipula=" + nombreManipula + "]";
	}

		
	//getters and setters
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getNombreManipula() {
		return nombreManipula;
	}

	public void setNombreManipula(String nombreManipula) {
		this.nombreManipula = nombreManipula;
	}
	
	//constructor
	public Trupalla(String tipoCarro, int cantidadOcupantes, String fechaIngresoInst, int fila, int columna, int nivelArmadura, String nombreManipula) {
		super(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna);
		this.nivelArmadura = nivelArmadura;
		this.nombreManipula = nombreManipula;
		
	}
	
	
	public Trupalla(){
		
		nivelArmadura();
		nombreManipula();
	}
		
	//metodo que solicita el nivel de Armadura del Carro, entre 1 y 5
		public void nivelArmadura() {
						
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa el nivel de Armadura del " + getTipoCarro() + "entre 1 y 5:");
		nivelArmadura = scan.nextInt();
		}
		
	//metodo que solicita el nivel de Armadura del Carro, entre 1 y 5
		public void nombreManipula() {
								
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa el nombre de la Persona que manipula el " + getTipoCarro() + ":");
		nombreManipula = scan.nextLine();
		}
}
