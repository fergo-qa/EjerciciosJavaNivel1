package Bloque3;

public class MétodoConRetorno {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un método que calcule el área de un cuadrado. 
        El método no debe imprimir nada, debe DEVOLVER el resultado al main.
        */
		
		int ladoCuadrado = 7;
		
		// Guardamos lo que el método nos "devuelve" en una variable.
		int resultadoArea = calcularArea(ladoCuadrado);
		
		System.out.println("El área de un cuadrado de lado " + ladoCuadrado + " es: " + resultadoArea);
	}
	
	// Cambiamos 'void' por 'int' porque el método devolverá un entero.
	public static int calcularArea(int lado) {
		int area = lado * lado;
		return area; // La palabra 'return' envía el valor de vuelta a quien llamó al método.
	}
	
	/*
    EXPLICACIÓN
    - El tipo de retorno (int, String, double, etc.) indica qué tipo de dato "sale" del método.
    - Un método con retorno es como una máquina: le das algo, lo procesa y te entrega un producto.
    - Una vez que se ejecuta el 'return', el método termina inmediatamente.
    */
	

}
