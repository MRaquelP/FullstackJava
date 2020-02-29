package ejercicio;
import java.util.ArrayList;
import java.util.Scanner;

import clases.Caguano;
import clases.Carro;
import clases.Huevo;
import clases.Kromi;
import clases.Tablero;
import clases.Trupalla;

//import ejercicio.Tablero;

public class Principal {
	
	//variables
	Scanner scan = new Scanner(System.in);

	static ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();	
	static ArrayList<Carro> carro = new ArrayList<Carro>();
	static ArrayList<Trupalla> tr = new ArrayList<Trupalla>();
	static ArrayList<Kromi> kr = new ArrayList<Kromi>();
	static ArrayList<Caguano> ca = new ArrayList<Caguano>();
	static Tablero t = new Tablero();
	

	//metodos
	public static void menu() {
		
		int eleccion=0;
				
		Scanner scan = new Scanner (System.in);
		do {
			try {
			System.out.println("\n - - Mata PKS - - ");
			System.out.println("------------------");
			System.out.println("Opción 1: Ingreso de Carros");
			System.out.println("Opción 2: Reporte de Carros Ingresados");
			System.out.println("Opción 3: Jugar");
			System.out.println("Opción 4: Salir");
			
			eleccion = scan.nextInt();
			//scan.nextLine();
			
			switch (eleccion) {
				case 1: 
					 menuCarros();
					break;
				
				case 2: 
					verReporte();
					break;
				
				case 3: 
					Tablero.inicio();
					System.exit(0);
					break;
				
				case 4: 				
					System.out.println("Hasta Luego!");
					System.exit(0);
					break;
				
				
				default:
					System.out.println("Error");
					break;
			
			}
			
			}catch(java.util.InputMismatchException excepcion) {
				System.out.println("Introduce un número entre 1 y 4");
			}
			
		}while (eleccion !=4);
		
		scan.close();
	}
	
	public static void menuCarros() {
		// TODO Auto-generated method stub
		
		int eleccion = 0;
			
		Scanner scan = new Scanner (System.in);
		do {
			try {
			System.out.println("Ingreso de Carros");
			System.out.println("------------------");
			System.out.println("Opción 1: Ingreso de Carros- Kromi");
			System.out.println("Opción 2: Ingreso de Carros- Caguano");
			System.out.println("Opción 3: Ingreso de Carros- Trupalla");
			System.out.println("Opción 4: Regresar");
			
			eleccion = scan.nextInt();
			//scan.nextLine();
			
			
			switch (eleccion) {
				case 1: 
					 
					menuCarrosKromi();
					break;
				
			
				case 2: 
					menuCarrosCaguano();
					break;
				
				
				case 3: 
					menuCarrosTrupalla();
					break;
				
				
				case 4: 
					
					menu();
					break;
				
			default:
					System.out.println("error");
					break;
			}
			
			}catch(java.util.InputMismatchException excepcion) {
				System.out.println("Introduce un número entre 1 y 4");
			}
				
		}while (eleccion !=4);
		scan.close();
			
	}


		
	private static void menuCarrosKromi() {
		// TODO Auto-generated method stub
		
		
		String response = "no";
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Ingreso de Carros Kromi");
			System.out.println("--------------------");
			kr.add(new Kromi());
		
			System.out.println("Desea ingresar un Carro: (si/no)");
			response = scan.nextLine();
		}while(response.equalsIgnoreCase("si"));
		
		
		
	}
	
	private static void menuCarrosCaguano() {
		// TODO Auto-generated method stub
		
		
		String response = "no";
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Ingreso de Carros Caguano");
			System.out.println("--------------------");
			ca.add(new Caguano());
		
			System.out.println("Desea ingresar un Carro: (si/no)");
			response = scan.nextLine();
		}while(response.equalsIgnoreCase("si"));
		
	}

	private static void menuCarrosTrupalla() {
		// TODO Auto-generated method stub
				
		String response = "no";
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Ingreso de Carros Trupalla");
			System.out.println("--------------------");
			tr.add(new Trupalla());
		
			System.out.println("Desea ingresar un Carro: (si/no)");
			response = scan.nextLine();
		}while(response.equalsIgnoreCase("si"));
		
	}
	
	public static void cargarDatos() {
		//variables carro		
		String tipoCarro = "";
		int cantidadOcupantes = 0;
		String fechaIngresoInst = "";
		int fila = 0;
		int columna = 0;
		int vida = 0;
		
		//variables Kromi
		String añoFabricacion = "";
		String marca = "";
		
		//variables Caguano
		String alcanceTiro = "";
		String colorConfeti = "";
		
		//variables Trupalla
		int nivelArmadura = 0;
		String nombreManipula = "";
		
		//Carga de Carros Kromis	
		
		
		
		Kromi kromi1 = new Kromi(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, añoFabricacion, marca);
		kromi1.setTipoCarro("kromi");
		kromi1.setCantidadOcupantes(5);
		kromi1.setFechaIngresoInst("26 feb 2020");
		kromi1.setFila(1);
		kromi1.setColumna(1);
		kromi1.setAñoFabricacion("2020");
		kromi1.setMarca("Toyota");
		
		
		Kromi kromi2 = new Kromi(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, añoFabricacion, marca);
		kromi2.setTipoCarro("kromi");
		kromi2.setCantidadOcupantes(7);
		kromi2.setFechaIngresoInst("26 feb 2020");
		kromi2.setFila(2);
		kromi2.setColumna(2);
		kromi2.setAñoFabricacion("2018");
		kromi2.setMarca("Volvo");
		
		
		
		Kromi kromi3 = new Kromi(tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, añoFabricacion, marca);
		kromi3.setTipoCarro("kromi");
		kromi3.setCantidadOcupantes(8);
		kromi3.setFechaIngresoInst("26 feb 2020");
		kromi3.setFila(3);
		kromi3.setColumna(3);
		kromi3.setAñoFabricacion("2019");
		kromi3.setMarca("Renault");
		
		
		
		kr.add(kromi1);
		kr.add(kromi2);
		kr.add(kromi3);
		
		
		//Carga de Carros Caguanos
				
		Caguano caguano1 = new Caguano (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna,alcanceTiro, colorConfeti); 
		caguano1.setTipoCarro("caguano");
		caguano1.setCantidadOcupantes(2);
		caguano1.setFechaIngresoInst("27 feb 2018");
		caguano1.setFila(4);
		caguano1.setColumna(4);
		caguano1.setAlcanceTiro("5 mts");
		caguano1.setColorConfeti("rojo"); 
		
		
		Caguano caguano2 = new Caguano (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna,alcanceTiro, colorConfeti); 
		caguano2.setTipoCarro("caguano");
		caguano2.setCantidadOcupantes(4);
		caguano2.setFechaIngresoInst("27 feb 2017");
		caguano2.setFila(5);
		caguano2.setColumna(5);
		caguano2.setAlcanceTiro("6 mts");
		caguano2.setColorConfeti("rojo"); 
		
		
		Caguano caguano3 = new Caguano (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna,alcanceTiro, colorConfeti); 
		caguano3.setTipoCarro("caguano");
		caguano3.setCantidadOcupantes(6);
		caguano3.setFechaIngresoInst("27 feb 2019");
		caguano3.setFila(5);
		caguano3.setColumna(5);
		caguano3.setAlcanceTiro("8 mts");
		caguano3.setColorConfeti("rojo"); 
		
		
		Caguano caguano4 = new Caguano (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna,alcanceTiro, colorConfeti); 
		caguano4.setTipoCarro("caguano");
		caguano4.setCantidadOcupantes(3);
		caguano4.setFechaIngresoInst("12 feb 2020");
		caguano4.setFila(6);
		caguano4.setColumna(6);
		caguano4.setAlcanceTiro("10 mts");
		caguano4.setColorConfeti("rojo"); 
		
		
		Caguano caguano5 = new Caguano (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna,alcanceTiro, colorConfeti); 
		caguano5.setTipoCarro("caguano");
		caguano5.setCantidadOcupantes(4);
		caguano5.setFechaIngresoInst("10 feb 2020");
		caguano5.setFila(7);
		caguano5.setColumna(7);
		caguano5.setAlcanceTiro("5 mts");
		caguano5.setColorConfeti("rojo"); 
		
		
		ca.add(caguano1);
		ca.add(caguano2);
		ca.add(caguano3);
		ca.add(caguano4);
		ca.add(caguano5);
		
		
		//Carga de Carros Trupallas
		
		Trupalla trupalla1 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla1.setTipoCarro("trupalla");
		trupalla1.setCantidadOcupantes(3);
		trupalla1.setFechaIngresoInst("10 feb 2020");
		trupalla1.setFila(2);
		trupalla1.setColumna(1);
		trupalla1.setNivelArmadura(1);
		trupalla1.setNombreManipula("Dam"); 
		
		
		Trupalla trupalla2 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla2.setTipoCarro("trupalla");
		trupalla2.setCantidadOcupantes(2);
		trupalla2.setFechaIngresoInst("12 feb 2020");
		trupalla2.setFila(4);
		trupalla2.setColumna(2);
		trupalla2.setNivelArmadura(1);
		trupalla2.setNombreManipula("Cristian"); 
		
		
		Trupalla trupalla3 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla3.setTipoCarro("trupalla");
		trupalla3.setCantidadOcupantes(4);
		trupalla3.setFechaIngresoInst("1 ene 2020");
		trupalla3.setFila(1);
		trupalla3.setColumna(3);
		trupalla3.setNivelArmadura(1);
		trupalla3.setNombreManipula("Raquel"); 
		
		
		Trupalla trupalla4 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla4.setTipoCarro("trupalla");
		trupalla4.setCantidadOcupantes(1);
		trupalla4.setFechaIngresoInst("5 ene 2019");
		trupalla4.setFila(3);
		trupalla4.setColumna(4);
		trupalla4.setNivelArmadura(1);
		trupalla4.setNombreManipula("Cecilia"); 
		
		
		Trupalla trupalla5 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla5.setTipoCarro("trupalla");
		trupalla5.setCantidadOcupantes(1);
		trupalla5.setFechaIngresoInst("5 feb 2017");
		trupalla5.setFila(6);
		trupalla5.setColumna(5);
		trupalla5.setNivelArmadura(1);
		trupalla5.setNombreManipula("Cristian"); 
		
		
		Trupalla trupalla6 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla6.setTipoCarro("trupalla");
		trupalla6.setCantidadOcupantes(2);
		trupalla6.setFechaIngresoInst("9 dic 2019");
		trupalla6.setFila(1);
		trupalla6.setColumna(6);
		trupalla6.setNivelArmadura(1);
		trupalla6.setNombreManipula("Fabian");
		
		
		Trupalla trupalla7 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla7.setTipoCarro("trupalla");
		trupalla7.setCantidadOcupantes(5);
		trupalla7.setFechaIngresoInst("2 mar 2019");
		trupalla7.setFila(5);
		trupalla7.setColumna(7);
		trupalla7.setNivelArmadura(1);
		trupalla7.setNombreManipula("Butyr"); 
		
		
		Trupalla trupalla8 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla8.setTipoCarro("trupalla");
		trupalla8.setCantidadOcupantes(2);
		trupalla8.setFechaIngresoInst("5 mar 2012");
		trupalla8.setFila(6);
		trupalla8.setColumna(8);
		trupalla8.setNivelArmadura(1);
		trupalla8.setNombreManipula("Gordon"); 
		
		
		Trupalla trupalla9 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla9.setTipoCarro("trupalla");
		trupalla9.setCantidadOcupantes(2);
		trupalla9.setFechaIngresoInst("8 ago 2016");
		trupalla9.setFila(7);
		trupalla9.setColumna(9);
		trupalla9.setNivelArmadura(1);
		trupalla9.setNombreManipula("Brayan"); 
		
		
		Trupalla trupalla10 = new Trupalla (tipoCarro, cantidadOcupantes, fechaIngresoInst, fila, columna, nivelArmadura, nombreManipula); 
		trupalla10.setTipoCarro("trupalla");
		trupalla10.setCantidadOcupantes(3);
		trupalla10.setFechaIngresoInst("8 sept 2020");
		trupalla10.setFila(8);
		trupalla10.setColumna(10);
		trupalla10.setNivelArmadura(1);
		trupalla10.setNombreManipula("Darlyn"); 
		
		
		tr.add(trupalla1);
		tr.add(trupalla2);
		tr.add(trupalla3);
		tr.add(trupalla4);
		tr.add(trupalla5);
		tr.add(trupalla6);
		tr.add(trupalla7);
		tr.add(trupalla8);
		tr.add(trupalla9);
		tr.add(trupalla10);
	
		
	}
	
	public static void verReporte() {
		
			for(int i=0; i<kr.size();i++) {
				System.out.println("Kromi"+i + ": "+ kr.get(i).toString());
			}
			
			for(int i=0; i<ca.size();i++) {
				System.out.println("Caguano"+i + ": "+ ca.get(i).toString());
			}
			
			for(int i=0; i<tr.size();i++) {
				System.out.println("Trupalla"+i + ": "+ tr.get(i).toString());
			}
		}
	
	public static void main(String[] args) {
		cargarDatos();
		menu();				
	}
	
	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public static ArrayList<Huevo> getListaHuevo() {
		return listaHuevo;
	}

	public static void setListaHuevo(ArrayList<Huevo> listaHuevo) {
		Principal.listaHuevo = listaHuevo;
	}

	public static ArrayList<Carro> getCarro() {
		return carro;
	}

	public static void setCarro(ArrayList<Carro> carro) {
		Principal.carro = carro;
	}

	public static ArrayList<Trupalla> getTr() {
		return tr;
	}

	public static void setTr(ArrayList<Trupalla> tr) {
		Principal.tr = tr;
	}

	public static ArrayList<Kromi> getKr() {
		return kr;
	}

	public static void setKr(ArrayList<Kromi> kr) {
		Principal.kr = kr;
	}

	public static ArrayList<Caguano> getCa() {
		return ca;
	}

	public static void setCa(ArrayList<Caguano> ca) {
		Principal.ca = ca;
	}

	public static Tablero getT() {
		return t;
	}

	public static void setT(Tablero t) {
		Principal.t = t;
	}

}




