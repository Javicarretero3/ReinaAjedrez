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
	
	

}
