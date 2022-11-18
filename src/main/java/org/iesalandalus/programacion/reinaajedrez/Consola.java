package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;
import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;

public class Consola {
	
	private Consola() {
	}
	
	public static void mostrarMenu() {
		System.out.println("1º opción: Crear reina por defecto.");
		System.out.println("2º opción: Crear reina eligiendo el color. ");
		System.out.println("2º opción: Mover. ");
	    System.out.println("2º opción: Salir. ");
	}
	
	public static int elegirOpcionMenu() {
		int opcionmenu;
		do {
			System.out.println("Elija una de las opciones anteriores. ");
			opcionmenu = Entrada.entero();
		}while (opcionmenu < 1 || opcionmenu > 4);
		return opcionmenu;
	}
	
	public static Color elegirOpcion() {
		Color color = Color.BLANCO;
		int elegircolor;
		do {
			System.out.println("Escriba el numero deseado para su reina. ");
			System.out.println("Escriba 1 para color BLANCO. ");
			System.out.println("Escriba 2 para color NEGRO. ");
			elegircolor = Entrada.entero();
		} while (elegircolor < 1 || elegircolor > 2);
		switch (elegircolor) {
		case 1:
			color = Color.BLANCO;
			break;
		case 2:
			color = Color.NEGRO;
			break;
		}
		return color;
	}
	
	public static void mostrarMenuDirecciones() {
		System.out.println("Escriba 1 para mover hacia el Norte. ");
		System.out.println("Escriba 2 para mover hacia el Noreste. ");
		System.out.println("Escriba 3 para mover hacia el Este. ");
		System.out.println("Escriba 4 para mover hacia el Sureste. ");
		System.out.println("Escriba 5 para mover hacia el Sur. ");
		System.out.println("Escriba 6 para mover hacia el Suroeste. ");
		System.out.println("Escriba 7 para mover hacia el Oeste. ");
		System.out.println("Escriba 8 para mover hacia el Noroeste. ");
	}
	
	public static Direccion elegirDireccion() {
		Direccion direccion = Direccion.NORTE;
		int elegirdireccion;
		do {
			System.out.println("Escoja un número para mover a la reina hacia la dirección deseada. ");
			elegirdireccion = Entrada.entero();
		}while (elegirdireccion < 1 || elegirdireccion > 8);
		switch(elegirdireccion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.NORESTE;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.SURESTE;
			break;
		case 5:
			direccion = Direccion.SUR;
			break;
		case 6:
			direccion = Direccion.SUROESTE;
			break;
		case 7:
			direccion = Direccion.OESTE;
			break;
		case 8:
			direccion = Direccion.NOROESTE;
			break;
		}
		return direccion;
	}
	
	public static int elegirPasos( ) {
		int elegirpasos;
	    do {
		System.out.println("Elija un número para elegir los pasos que dara la reina. ");
		elegirpasos = Entrada.entero();
	}while (elegirpasos < 1 || elegirpasos > 7); 
		return elegirpasos;
	}
	
	public static void despedirse() {
		System.out.println("Gracias por utlizar esta aplicación. ¡Esperamos verte pronto!");
	}
}
