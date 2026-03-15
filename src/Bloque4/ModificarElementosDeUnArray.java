package Bloque4;

public class ModificarElementosDeUnArray {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un Array de Strings para guardar los nombres de 3 ciudades.
        Modificar la segunda ciudad y mostrar el tamaño total del Array.
        */
		
		// Otra forma de crear un Array: indicando de antemano cuántos espacios tendrá.
		String[] ciudades = new String[3];
		
		ciudades[0] = "Madrid";
		ciudades[1] = "Bogotá";
		ciudades[2] = "Lima";
		
		System.out.println("Ciudad original en posición 1: " + ciudades[1]);
		
		// Sobrescribimos el valor en el índice 1.
		ciudades[1] = "Buenos Aires";
		
		System.out.println("Nueva ciudad en posición 1: " + ciudades[1]);
		
		// .length nos dice cuántos espacios tiene el Array en total.
		System.out.println("El array tiene capacidad para " + ciudades.length + " ciudades.");
		
		/*
        EXPLICACIÓN
        - Cuando usas 'new String[3]', creas un Array vacío con exactamente 3 espacios fijos.
        - El tamaño de un Array tradicional en Java NUNCA puede cambiar una vez creado.
        - 'array.length' es una propiedad (no lleva paréntesis) que devuelve el tamaño del Array.
        */
		
	}

}
