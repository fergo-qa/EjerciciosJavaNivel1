package Bloque5;

public class ComportamientoMétodosDeInstancia {

	public static void main(String[] args) {
		/*
        CONSIGNA
        Crear una clase 'Coche' con atributos de marca y modelo.
        Añadir un método a la clase para que el coche pueda "arrancar" y "acelerar".
        */

        Coche miAuto = new Coche();
        miAuto.marca = "Toyota";
        miAuto.modelo = "Corolla";

        System.out.println("Auto registrado: " + miAuto.marca + " " + miAuto.modelo);
        
        // Llamamos a los métodos propios de ESTE objeto
        miAuto.arrancar();
        miAuto.acelerar();

        /*
        EXPLICACIÓN
        - Además de datos (atributos), los objetos tienen comportamiento (métodos).
        - A diferencia de los métodos de la Fase 3, aquí NO usamos la palabra 'static'.
        - Al no ser estáticos, estos métodos pertenecen a cada coche individualmente.
        */
	}
	
}

class Coche {
    String marca;
    String modelo;

    // Método de instancia (comportamiento del objeto)
    void arrancar() {
        System.out.println("El motor del " + marca + " está encendido... Brum brum!");
    }

    void acelerar() {
        System.out.println("El " + modelo + " está acelerando.");
    }

}
