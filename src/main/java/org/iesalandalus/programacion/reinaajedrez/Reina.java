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
		return new Posicion(posicion);
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = new Posicion(posicion);
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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (pasos < 1) {
			throw new IllegalArgumentException(
					"La reina no se puede mover con un número inferior a 1. ");
		} else if (pasos > 7) {
			throw new IllegalArgumentException(
					"La reina no se pude mover con un número mayot a 7. ");
		} else if (direccion == null) {
			throw new NullPointerException("La direccion asignada no puede ser nula. ");
		}
		if (direccion == Direccion.NORTE) {
			posicion = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
		} else if (direccion == Direccion.SUR) {
			posicion = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
		} else if (direccion == Direccion.ESTE) {
			posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.OESTE) {
			posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - (char) pasos));
		} else if (direccion == Direccion.NORESTE) {
			posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.NOROESTE) {
			posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - (char) pasos));
		} else if (direccion == Direccion.SURESTE) {
			posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + (char) pasos));
		} else if (direccion == Direccion.SUROESTE) {
			posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - (char) pasos));
		}
	}

}
