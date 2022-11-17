package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

import org.iesalandalus.programacion.reinaajedrez.Direccion;

import org.iesalandalus.programacion.reinaajedrez.Color;

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
	
	
		

}
