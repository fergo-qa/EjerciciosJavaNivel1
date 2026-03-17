package Bloque5;

public class SobrecargaDeConstructores {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una clase 'Producto'. Proveer dos formas de crearlo: 
        una sabiendo su precio, y otra sin saberlo (asumiendo un precio por defecto de 0.0).
        */

        // Usamos el constructor con dos parámetros
        Producto prod1 = new Producto("Teclado Mecánico", 85.50);
        
        // Usamos el constructor con un solo parámetro
        Producto prod2 = new Producto("Mouse Genérico");

        prod1.mostrarProducto();
        prod2.mostrarProducto();

        /*
        EXPLICACIÓN
        - Igual que con los métodos, puedes tener varios constructores si reciben distintos parámetros.
        - Esto da flexibilidad: permite crear objetos con mucha información o con información parcial.
        */
    }
}

class Producto {
    String nombre;
    double precio;

    // Constructor 1: Conoce todo
    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Constructor 2: Solo conoce el nombre
    Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0; // Precio por defecto
    }

    void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + " - Precio: $" + this.precio);
    }
}
