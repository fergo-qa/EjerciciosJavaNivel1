package Bloque5;

import java.util.ArrayList;

public class ColeccionesDeObjetosArrayListPOO {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una clase 'Estudiante'. Luego, en el main, crear un ArrayList que 
        guarde objetos de tipo Estudiante (no Strings, ni ints).
        Recorrer la lista e imprimir sus nombres.
        */

        // Un ArrayList que solo acepta Objetos de tipo Estudiante
        ArrayList<Estudiante> listaAlumnos = new ArrayList<>();

        // Creamos y agregamos directamente a la lista
        listaAlumnos.add(new Estudiante("Martín"));
        listaAlumnos.add(new Estudiante("Sofía"));
        listaAlumnos.add(new Estudiante("Lucía"));

        System.out.println("Lista de alumnos inscritos:");

        // Bucle For-each. Por cada Estudiante 'e' en 'listaAlumnos'...
        for (Estudiante e : listaAlumnos) {
            System.out.println("- " + e.getNombre());
        }

        /*
        EXPLICACIÓN
        - ¡Esta es la base de todo software moderno! Las bases de datos devuelven listas 
          y en Java las representamos como un ArrayList de Objetos.
        - Dentro de los diamantes <> ponemos el nombre de nuestra Clase.
        */
    }
}

class Estudiante {
    private String nombre;

    Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
