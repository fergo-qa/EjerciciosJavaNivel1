package Bloque5;

public class EncapsulamientoSettersYValidaciones {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una clase 'Persona' con una edad privada.
        Usar un método Setter para cambiar la edad, asegurando que nadie pueda poner 
        una edad negativa.
        */

        Persona empleado = new Persona();

        empleado.setEdad(25); // Edad válida
        System.out.println("Edad registrada: " + empleado.getEdad());

        empleado.setEdad(-5); // Intento de hackeo / error
        System.out.println("Edad tras el error: " + empleado.getEdad());

        /*
        EXPLICACIÓN
        - El método "Setter" (setEdad) sirve para modificar un atributo privado.
        - La gran ventaja del Setter es que podemos poner lógica dentro (como un 'if').
        - Si la variable fuera pública (empleado.edad = -5), nadie impediría el error. 
          Con el Setter, el objeto se defiende a sí mismo.
        */
    }
}

class Persona {
    private int edad;

    public int getEdad() {
        return this.edad;
    }

    // Método público para "escribir/modificar" el valor (SET)
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("ERROR: La edad no puede ser negativa.");
        }
    }
}