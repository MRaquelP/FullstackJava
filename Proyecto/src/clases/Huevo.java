package clases;
//import java.util.Scanner;

public class Huevo {
	
	//Atributos
	private int fila;
	private int columna;
	private int cant;
	private int ptj;
	
	//Constructor
	public Huevo(int fila, int columna) {
		//super();
		this.fila = fila;
		this.columna = columna;
	}
	
	public Huevo(int fila, int columna, int cant) {
		//super();
		this.fila = fila;
		this.columna = columna;
		this.cant = cant;
	}
	

		public Huevo(int fila, int columna, int cant, int ptj) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.cant = cant;
		this.ptj = ptj;
	}

		//ToString
		@Override
		public String toString() {
			return "claseHuevo [fila=" + fila + ", columna=" + columna + ", cantidad=" + cant + ", puntaje=" + ptj + "]";
		}
		//setter y getter
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
		public int getCant() {
			return cant;
		}
		public void setCant(int cant) {
			this.cant = cant;
		}
		public int getPuntaje() {
			return ptj;
		}
		public void setPuntaje(int puntaje) {
			this.ptj = puntaje;
		}
	}