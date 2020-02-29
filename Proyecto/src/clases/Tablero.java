package clases;
import java.util.ArrayList;
import java.util.Scanner;
import ejercicio.Principal;
import clases.Caguano;
import clases.Carro;
import clases.Huevo;
import clases.Kromi;

import clases.Trupalla;



public class Tablero {

	static Huevo h;
	
	static int pK=0;
	static int pC=0;
	static int pT=0;
	
	static ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();
	
	
	//crear matriz 15x15
	static String matriz[][]= new String[15][15];
		
	//genera matriz	
		public static void inicio() {
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				matriz[i][j]=" ";
			}
		}

		System.out.println("PKS: Posicionando Vehiculos...");
		System.out.println("...");
		matriz= ubicaVehiculos(matriz);
		imprimeMatriz(matriz);
		lanzarHuevo(matriz);
		imprimeMatriz(matriz);

	}
		
		//Recibe la matriz y posiciona vehiculos
	public static String[][] ubicaVehiculos(String[][] matriz){

		int randomX, randomY; //generamos variables para el eje X e Y
		boolean agregado=false; //booleano que muestre si efectivamente se creo el carro correspondiente, repite con el do while hasta que lo haya hecho 
		
		// 3 kromis: ocupa 3 espacios, vertical. K
		for(int i=0; i<3;i++) { 
			//hacer para las 3 kromis
			do{
				randomX=(int)(Math.random() * (14-0)-1);  //guardamos en la variable un INT random que no puede pasarse de 14 ni de 0
				randomY=(int)(Math.random() * (14-0)-1);  ////el -1 es parte de la magia del random, se usa para que incluya el ultimo valor del rango
				
				Principal.getKr().get(i).setFila(randomX); //desde principal recibimos el arraylist con nombre - kr - y obtenemos el indice que corresponde a la fila
				Principal.getKr().get(i).setColumna(randomY); //se asignan a X e Y
																
				if(matriz[randomX][randomY]==" " && randomX<=12) {  //Si la la matriz con el valor X e Y esta vacía y es menor o igual a 12, podemos crear (menor para que no se pase del rango)
					if(matriz[randomX+1][randomY]==" " && matriz[randomX+2][randomY]==" ") { 
	//si la matriz del Eje X +1 y del Eje y está vacía y además +2 con el mismo eje sigue vacia entonces podemos crear ya que los 3 espacios estarían libres
						matriz[randomX][randomY]="K"; //Muestra la K en la posición 1
						matriz[randomX+1][randomY]="K"; //Muestra la K en la posición 2
						matriz[randomX+2][randomY]="K"; //Muestra la K en la posición 3
						agregado=true;
					}

				}
			}while(agregado==false); //repetir hasta que agregado sea falso
			agregado=false;
		}

		// 5 Caguanos: dos espacios, horizontal. C
		for(int i=0; i<5;i++) {
			do{
				randomX=(int)(Math.random() * (14-0)-1);
				randomY=(int)(Math.random() * (14-0)-1);
				
				Principal.getCa().get(i).setFila(randomX);
				Principal.getCa().get(i).setColumna(randomY);
								
				if(matriz[randomX][randomY]==" " && randomY<=13) { 
					if(matriz[randomX][randomY+1]==" ") {
						matriz[randomX][randomY]="C";
						matriz[randomX][randomY+1]="C";
						agregado=true;
					}

				}
			}while(agregado==false);
			agregado=false;
		}
		

		// 10 Trupallas: un espacio. T
		for(int i=0; i<10;i++) {
			do{
				randomX=(int)(Math.random() * (14-0)-1);
				randomY=(int)(Math.random() * (14-0)-1);
				
				Principal.getTr().get(i).setFila(randomX);
				Principal.getTr().get(i).setColumna(randomY);
								
				if(matriz[randomX][randomY]==" " && randomY<=14) {
					matriz[randomX][randomY]="T";
					agregado=true;
				}
			}while(agregado==false);
			agregado=false;
		}
		
		/* For para revisar la posición en la que quedó cada carro
		
		 for(int i=0; i<Principal.getKr().size();i++) {
				System.out.println("Kromi"+i + ": "+ Principal.getKr().get(i).getFila()+", " + Principal.getKr().get(i).getColumna());
			}
			
			for(int i=0; i<Principal.getCa().size();i++) {
				System.out.println("Caguano"+i + ": "+ Principal.getCa().get(i).getFila()+", " + Principal.getCa().get(i).getColumna());
			}
			
			for(int i=0; i<Principal.getTr().size();i++) {
				System.out.println("Trupalla"+i + ": "+ Principal.getTr().get(i).getFila()+", " + Principal.getTr().get(i).getColumna());
			} 		
		*/
		
		return matriz;
				
	}

	//muestra la matriz
	public static void imprimeMatriz(String[][] matriz) {
		System.out.print("\t");
		for(int j=0;j<15;j++) {
			System.out.print(j+"\t");
		}
		System.out.print("\n");
		for(int i=0;i<15;i++) {
			System.out.print(i+"\t");
			for(int j=0;j<15;j++) {
				System.out.print("["+matriz[i][j]+"]"+"\t");
			}
			System.out.print("\n");
		}
	}
	
	
	public static Huevo lanzarHuevo(String[][] matriz) {
		
		Scanner leer = new Scanner(System.in);
				
		
		System.out.println("\n¡Te hemos entregado una cantidad ilimitada de huevos!");
		int res=0; //respuesta
		int K = 0, C = 0, T = 0; //valor de kromi, caguano y trapulla
		int golpes=0; int huevos=0; //golpes acertados y huevos lanzados
	
						
		do {
			
			int fila, columna = 0;
			System.out.println("Ingresa la coordenada donde crees que se encuentran los PKS");
			System.out.print("Ingresa la fila donde quieres lanzar el huevo: ");
			fila = leer.nextInt();
			//utilizar atributo de huevos
			
			
			while(fila>14 || fila<0) {
				System.out.println("¡Casi le das al ExtinguirPKS! - Favor ingrese un valor entre 0 y 14 para la Fila");
				fila = leer.nextInt();
			}
			
			System.out.print("Ingresa la columna donde quieres lanzar el huevo: ");
			columna = leer.nextInt();
			
			
				while(columna>14 || columna<0) {
					System.out.println("¡Casi le das a la Tía Charmander! - Favor ingrese un valor entre 0 y 14 para la Columna");
					columna = leer.nextInt();
				}
			//se crea huevo en tablero y se le asignan los valores fila y columna
				h = new Huevo(fila, columna);
				listaHuevo.add(h); 
	
				//si la matriz en huevo -fila- y -columna- contiene la letra K... entra
				if(matriz[h.getFila()][h.getColumna()].contentEquals("K")) {
					
					
					System.out.println("\n¡Le diste!");
					//cambia el valor actual por la letra H
						matriz[h.getFila()][h.getColumna()]="H";
						//suma a Kromi, suma a huevos y a golpes
					K++;					
					huevos++;
					golpes++;
					
					//si la matriz en huevo -fila- y -columna- contiene la letra C... entra

				}else if(matriz[h.getFila()][h.getColumna()].contentEquals("C") ) {
					
					System.out.println("\n¡Le diste!");
					matriz[h.getFila()][h.getColumna()]="H";
					C++;
					golpes++;
					huevos++;
					
					//si la matriz en huevo -fila- y -columna- contiene la letra T... entra

				}else if(matriz[h.getFila()][h.getColumna()].contentEquals("T")){
					
					System.out.println("\n¡Le diste!");
					matriz[h.getFila()][h.getColumna()]="H";
					T++;
					golpes++;
					huevos++;
				
					//sino, fallas, y de igual manera asigna la H			
				}else {
					System.out.println("\nNooOOooO! FALLASTE!");
					matriz[h.getFila()][h.getColumna()]="H";
					huevos++;
				}
				
				//setteo la cantidad de huevos
				h.setCant(huevos);
				
				
				//mostrar huevos lanzados
			System.out.println("Has usado ["+h.getCant()+"] huevos");
			System.out.println("¿Continuar?");
			
			System.out.println("1.- Sí");
			System.out.println("2.- No");
			//leer respuestas
			res = leer.nextInt();
									
			}while(res==1);	//hacer mientras la respuesta sea continuar
		
				//si decides no seguir, muestra el puntaje
		if(res==2) {
		
			mostrarPuntaje(matriz, huevos, golpes, K, C, T);
		}
					
			leer.close();
			return h;
	
			
	}

	
public static void mostrarPuntaje(String matriz[][], int huevos, int golpes, int K, int C, int T) {
		int matarK = 0, matarC =0;  
		//int dedMikro=0; int dedCagu=0;
		
		/* pendiente, es para la asignacion de cuando muere una kromi o caguano completo
		if(matriz[h.getFila()][h.getColumna()].contentEquals("K") && matriz[(h.getFila()-1)][h.getColumna()].contentEquals("K") && matriz[(h.getFila()-2)][h.getColumna()].contentEquals("K")) {

			dedMikro++;
			matarK = matarK + 10;
			System.out.println("Mataste ["+dedMikro+"] Kromi(s). Ganaste "+(matarK)+" en total");
		
		}
		
		if(matriz[h.getFila()][h.getColumna()].contentEquals("C") && matriz[(h.getFila())][(h.getColumna()+1)].contentEquals("C")) {
			dedCagu++;
			matarC = matarC + 7;
			
		} */
			
	
		System.out.println("Has golpeado "+K+" veces a las Kromis.");
		System.out.println("Has golpeado "+C+" veces a los Caguanos.");
		System.out.println("Has golpeado "+T+" veces a las Trupallas.");
		
		
		System.out.println("\n Diste "+golpes+" golpes.");
		
		//mostrar datos que quedaron pendientes
		//System.out.println("Mataste ["+dedMikro+"] Kromi(s). Ganaste "+(matarK)+" puntos adicionales");
		//System.out.println("\n Mataste ["+dedCagu+"] Caguanos(s). Ganaste "+(matarC)+" puntos adicionales");
		//System.out.println("\n Mataste ["+T+"] Trapullas(s). No hay puntos adicionales por muerte");
		
		System.out.println("\n Tu puntaje total es de: "+((K*3)+(C*2)+T+matarK+matarC));
		
	}

}
