package Bloque3;

public class MétodoConMúltiplesParámetros {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un método que reciba dos números enteros, los sume 
        e imprima el resultado.
        */
		
		sumarYMostrar(10,5);
		sumarYMostrar(50,100);
	}
	
	public static void sumarYMostrar(int n1,int n2) {
		int resultado = n1 + n2;
		System.out.println("La suma de " + n1 + " + " + n2 + " es: " + resultado);
	}
	
	/*
    EXPLICACIÓN
    - Puedes pasar tantos parámetros como necesites, separados por comas.
    - El orden en que pasas los valores al llamar al método debe coincidir 
      con el orden definido en el método.
    */
	

}
