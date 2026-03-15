package Bloque2;

public class BucleForContadorDescendenteConPasoPersonalizado {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Imprimir los números del 50 al 0, bajando de 10 en 10.
        */
		
		for(int i = 50; i >= 0; i -= 10) {
			System.out.println("Valor actual: " + i);
		}
		
		/*
        EXPLICACIÓN
        - En el 'for', el tercer segmento (i -= 10) permite definir cómo cambia la variable.
        - Usamos '>=' porque queremos incluir el número 0 en la impresión.
        */
		
	}

}
