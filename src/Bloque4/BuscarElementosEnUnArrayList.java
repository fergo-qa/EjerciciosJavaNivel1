package Bloque4;

import java.util.ArrayList;

public class BuscarElementosEnUnArrayList {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un ArrayList de números de empleados.
        Verificar si la lista está vacía, y comprobar si un empleado específico existe en la lista.
        */
		
		// Para guardar números enteros en un ArrayList, usamos 'Integer' en lugar de 'int'.
		ArrayList<Integer> empleadosID = new ArrayList<>();
		
		System.out.println("¿La lista está vacia antes de agregar?: " + empleadosID.isEmpty());
		
		empleadosID.add(101);
		empleadosID.add(105);
		empleadosID.add(204);
		
		int empleadoBuscado = 105;
		
		// .contains() busca si un elemento exacto existe en la lista.
		if(empleadosID.contains(empleadoBuscado)) {
			System.out.println("El empleado " + empleadoBuscado + " SÍ está en la base de datos.");
		} else {
			System.out.println("El empleado no existe.");
		}
		
		/*
        EXPLICACIÓN
        - '.isEmpty()' devuelve true si la lista no tiene elementos.
        - '.contains()' devuelve true si encuentra el valor. Es extremadamente útil 
          para evitar hacer bucles manuales de búsqueda.
        */
		
	}

}
