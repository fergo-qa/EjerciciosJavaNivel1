package Bloque4;

import java.util.ArrayList;

public class FiltrarDatosDeUnArrayList {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Teniendo una lista de nombres, crear un programa que imprima SOLAMENTE 
        los nombres que empiezan con la letra 'A'.
        */
		
		ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alberto");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Beatriz");
        nombres.add("Andrés");

        System.out.println("Nombres que empiezan con la letra 'A':");
        
        for (String nombre : nombres) {
            // Convertimos a mayúsculas por seguridad y usamos .startsWith()
            if (nombre.toUpperCase().startsWith("A")) {
                System.out.println("- " + nombre);
            }
        }
        
        /*
        EXPLICACIÓN
        - Aquí combinamos todo lo aprendido: ArrayLists, bucle For-each, 
          estructuras condicionales (if) y métodos de String (.toUpperCase y .startsWith).
        - Filtrar datos es una de las tareas más comunes que harás como programador.
        */
        
	}

}
