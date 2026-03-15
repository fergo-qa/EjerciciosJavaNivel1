package Bloque1;

public class OperadoresAritméticos {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Declarar dos variables numéricas enteras. Calcular y mostrar por consola 
        el resultado de su suma, resta, multiplicación y división.
        */
		
		int numero1 = 20;
		int numero2 = 5;
		
		int suma = numero1 + numero2;
		int resta = numero1 + numero2;
		int multiplicacion = numero1 + numero2;
		int division = numero1 / numero2;
		
		System.out.println("Los números son: " + numero1 + " y " + numero2);
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
		System.out.println("El resultado de la division es: " + division);

		/*
        EXPLICACIÓN
        - Usamos los operadores aritméticos básicos: + (suma), - (resta), * (multiplicación), / (división).
        - Guardamos el resultado de la operación en una nueva variable antes de imprimirla. 
          Esto es una buena práctica porque nos permite reutilizar el resultado más adelante si lo necesitamos.
        */
		
	}

}
