package Bloque4;

import java.util.ArrayList;

public class ModificarYEliminarEnUnArrayList {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un ArrayList con nombres de colores.
        Cambiar el segundo color, eliminar el último y mostrar el tamaño final.
        */
		
		ArrayList<String> colores = new ArrayList<>();
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		
		System.out.println("Colores iniciales: " + colores);
		
		// .set(índice, nuevoValor) reemplaza un elemento.
		colores.set(1, "Amarillo"); // Reemplazamos "Verde" por "Amarillo".
		
		// .remove(índice) elimina un elemento.
		colores.remove(2); // Eliminamos "Azul".
		
		System.out.println("Colores después de modificar: " + colores);
		
		// En los ArrayList usamos .size() en lugar de .length para saber el tamaño.
		System.out.println("Cantidad de colores ahora: " + colores.size());
		
		/*
        EXPLICACIÓN
        - Los ArrayList tienen métodos preconstruidos muy útiles.
        - Al usar .remove(), el ArrayList se encoge automáticamente y los elementos 
          que estaban a la derecha se recorren hacia la izquierda para tapar el hueco.
        */
	}

}
