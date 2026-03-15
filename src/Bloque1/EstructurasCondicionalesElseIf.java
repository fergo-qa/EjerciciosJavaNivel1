package Bloque1;

public class EstructurasCondicionalesElseIf {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dada la nota de un examen (del 0 al 100), imprimir la calificación en letras:
        A (90 a 100), B (80 a 89), C (70 a 79), D (60 a 69), F (menos de 60).
        */
		
		int nota = 97;
		
		System.out.println("Tu nota numérica es: " + nota);
		
		if(nota >= 90) {
			System.out.println("Clasificación: A");
		} else if (nota >= 80) {
			System.out.println("Clasificación: B");
		} else if (nota >= 70) {
			System.out.println("Clasificación: C");
		} else if (nota >= 60) {
			System.out.println("Clasificación: D");
		} else {
			System.out.println("Clasificación: F. Necesitas estudiar más.");
		}
		
		/*
		EXPLICACIÓN
        - 'else if' nos permite comprobar múltiples condiciones secuencialmente.
        - El programa lee de arriba hacia abajo. Cuando una condición se cumple (ej. nota >= 70), 
          ejecuta ese bloque y sale de toda la estructura, ignorando los 'else if' que quedan abajo.
        - El 'else' final atrapa cualquier caso que no haya cumplido ninguna de las condiciones anteriores.
        */
        
	}

}
