package Bloque4;

public class OperacionesMatemáticasConArrays {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado un Array de precios, calcular la suma total de todos los precios 
        y luego calcular el promedio.
        */
		
		double[] precios = {150.50,200.0,50.15,99.99};
		double sumaTotal = 0;
		
		for(int i = 0; i < precios.length; i++) {
			sumaTotal += precios[i]; // Acumulamos cada precio en la variable.
		}
		
		double promedio = sumaTotal / precios.length;
		
		System.out.println("La suma total es: $" + sumaTotal);
		System.out.println("El precio promedio es: $" + promedio);
		
		/*
        EXPLICACIÓN
        - Para sumar todos los elementos, inicializamos un acumulador en 0 antes del bucle.
        - En cada iteración, sumamos el elemento actual ('precios[i]') al acumulador.
        - Finalmente, dividimos la suma total entre la cantidad de elementos ('precios.length') para sacar el promedio.
        */
		
	}

}
