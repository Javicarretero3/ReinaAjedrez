package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;

	public Reina() {
		color = Color.BLANCO;
		try {
			posicion = new Posicion(1, 'd');
		} catch (OperationNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public Reina(Color color) {
		setColor(color);
		if (color == Color.NEGRO) {
			try {
				posicion = new Posicion(8, 'd');
			} catch (OperationNotSupportedException e) {
				e.printStackTrace();
			}
		} else if (color == Color.BLANCO) {
			try {
				posicion = new Posicion(1, 'd');
			} catch (OperationNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mover(Direccion direccion, int pasos) {
		if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("Los pasos deben estar comprendidos entre 1 y 7. ");
		}
		switch (direccion) {
		case NORTE:
			try {
				posicion = new Posicion(posicion.getFila() + pasos, posicion.getColumna());
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case SUR:
			try {
				posicion = new Posicion(posicion.getFila() - pasos, posicion.getColumna());
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case ESTE:
			try {
				posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case OESTE:
			try {
				posicion = new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case NORESTE:
			try {
				posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case NOROESTE:
			try {
				posicion = new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case SURESTE:
			try {
				posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		case SUROESTE:
			try {
				posicion = new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - pasos));
			} catch (OperationNotSupportedException e) {
				System.out.println("La reina se ha salido del tablero. ¡Prueba otra vez! ");
			}
			break;
		}
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Posicion getPosicion() {
		return new Posicion(posicion);
	}

	private void setPosicion(Posicion posicion) {
		this.posicion = new Posicion(posicion);
	}

	@Override
	public String toString() {
		return "Color = " + color + ", Posición => " + posicion;
	}
}
