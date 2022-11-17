package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO("Blanco"), NEGRO("Negro");
	
	String cadenaAMostrar;
	
	public(String CadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	@Override
	public String toString() {
		return cadenaAMostrar;
	}
}
