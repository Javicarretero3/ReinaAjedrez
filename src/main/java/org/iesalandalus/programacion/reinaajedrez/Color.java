package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO, NEGRO;
	String cadenaAMostrar;
	
	public String getCadenaAMostrar () {
		return cadenaAMostrar;
	}
	
	@Override
	public String toString() {
		return "Cadena -> " + cadenaAMostrar;
	}
}
