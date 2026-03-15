package Bloque1;

public class EstructurasCondicionalesIfElse {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado un número entero, determinar si es par o impar utilizando 
        la estructura if-else y el operador módulo (%).
        */
		
		int numero = 21;
		
		//El operador módulo (%) devuelve el resto de una división.
		// Si el resto de dividir por 2 es 0, el numero es par.
		if(numero % 2 == 0) {
			System.out.println("El número " + numero + " es PAR.");
		} else {
			System.out.println("El número " + numero + " es IMPAR.");
		}
		
		/*
        EXPLICACIÓN
        - El 'if' evalúa la condición entre paréntesis. Si es 'true', ejecuta las llaves de arriba.
        - Si es 'false', ignora el primer bloque y ejecuta automáticamente lo que está dentro del 'else'.
        - El operador '%' (módulo) es fundamental en programación para saber si un número es múltiplo de otro.
        */
		
	}

}
