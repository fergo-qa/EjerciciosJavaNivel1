package Bloque4;

import java.util.ArrayList;

public class RecorrerUnArrayListForTradicionalVsForEach {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un ArrayList con nombres de lenguajes de programación.
        Recorrerlo usando un 'for' tradicional y luego usando un bucle 'for-each'.
        */
		
		ArrayList<String> lenguajes = new ArrayList<>();
		lenguajes.add("Java");
		lenguajes.add("Phyton");
		lenguajes.add("JavaScript");
		
		System.out.println("--- Usando For Tradicional ---");
		// Usamos .size() para el límite y .get(i) para obtener el elemento.
		for(int i = 0; i < lenguajes.size(); i++) {
			System.out.println("Lenguaje " + i + ": " + lenguajes.get(i));
		}
		
		System.out.println("--- Usando Bucle For-each ---");
		// Se lee: "Por cada 'String lenguaje' dentro de la lista 'lenguajes'..."
		for(String lenguaje : lenguajes) {
			System.out.println("Me gusta programar en " + lenguaje);
		}
		
		/*
        EXPLICACIÓN
        - Para obtener un valor de un ArrayList NO usamos corchetes [], usamos el método .get(índice).
        - El bucle 'For-each' (el segundo ejemplo) es una versión simplificada del 'for' 
          especialmente diseñada para recorrer colecciones completas sin preocuparnos por los índices.
        */
		
	}

}
