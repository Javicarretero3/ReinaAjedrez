package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila >= 1 || fila <= 8) {
			throw new IllegalArgumentException("La reina esta fuera del tablero");
	    }else {
		    this.fila = fila; 
	    }
	}
	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna >= 1 || columna <= 6) {
			throw new IllegalArgumentException("La reina esta fuera del tablero");
		}else {
			this.columna = columna;
		}
	}
	
	
	
	
}
