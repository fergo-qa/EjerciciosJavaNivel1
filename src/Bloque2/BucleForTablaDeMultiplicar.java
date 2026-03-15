package Bloque2;

public class BucleForTablaDeMultiplicar {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado un número (por ejemplo, el 5), imprimir su tabla de multiplicar 
        del 1 al 10.
        */
		
		int tablaDel = 5;
		
		System.out.println("Tabla del " + tablaDel + ":");
		
		for(int i = 1; i <= 10; i++) {
			int resultado = tablaDel * i;
			System.out.println(tablaDel + " X " + i + " = " + resultado);
		}
		
		/*
        EXPLICACIÓN
        - Aquí combinamos una variable fija con el contador 'i' que cambia en cada vuelta.
        - En la primera vuelta 'i' vale 1, en la segunda 2, y así hasta 10.
        */
		
	}

}
