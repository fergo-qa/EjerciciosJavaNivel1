package Bloque2;

public class BucleWhileSimulaciónDeCarga {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Simular la carga de un archivo. El porcentaje empieza en 0 y aumenta 
        de 20 en 20 hasta llegar a 100 usando un bucle 'while'.
        */
		
		int porcentaje = 0;
		
		while(porcentaje <= 100) {
			System.out.println("Cargando archivo..." + porcentaje + "%");
			porcentaje += 20; // Incremento de 20 en 20
		}
		
		System.out.println("¡Carga completa!");
		
		/*
        EXPLICACIÓN
        - El incremento no siempre tiene que ser de 1 en 1. 
        - Aquí controlamos el avance con '+= 20'.
        */
		
	}

}
