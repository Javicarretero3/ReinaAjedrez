package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;
	
	public Reina() throws OperationNotSupportedException {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public Reina(Color color) throws OperationNotSupportedException {
		this();
		setColor(color);
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
		} else if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'd');
		}
	}

}
