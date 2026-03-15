package Bloque4;

import java.util.ArrayList; // IMPORTANTE: Debemos importar esta clase para usarla

public class IntroducciónAArrayList {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un ArrayList de Strings para almacenar una lista de compras.
        Agregar 3 productos e imprimir la lista completa.
        */
		
		// Así se declara un ArrayList. Fíjate que el tipo de dato va entre <>
		ArrayList<String> listaCompras = new ArrayList<>();
		
		// Usamos el método .add() para agregar elementos.
		listaCompras.add("Leche");
		listaCompras.add("Pan");
		listaCompras.add("Huevos");
		
		// Los ArrayLists se pueden imprimir directamente y se ven muy bien en consola.
		System.out.println("Mi lista de compras: " + listaCompras);
		
		/*
        EXPLICACIÓN
        - A diferencia de los Arrays tradicionales (que tienen tamaño fijo), 
          los ArrayLists son DINÁMICOS. Pueden crecer y encogerse automáticamente.
        - Para usar un ArrayList, Eclipse te pedirá que importes 'java.util.ArrayList' en la parte superior.
        - Solo pueden guardar Objetos (String, Integer, Double). No aceptan tipos primitivos puros como 'int' o 'double'.
        */
		
	}

}
