package Bloque5;

public class EncapsulamientoPrivacidadYGetters {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una clase 'CuentaBancaria' con un saldo privado.
        Demostrar que no se puede acceder al saldo directamente, sino a través de un método Getter.
        */

        CuentaBancaria miCuenta = new CuentaBancaria(1500.75);

        // miCuenta.saldo = 5000; // ERROR: Si descomentas esto, Eclipse marcará error.

        // Para leer el saldo, OBLIGATORIAMENTE usamos el Getter
        double dineroActual = miCuenta.getSaldo();
        System.out.println("El saldo de su cuenta es: $" + dineroActual);

        /*
        EXPLICACIÓN
        - En POO, los atributos nunca deben ser 'public'. Siempre se declaran 'private'.
        - 'private' significa que solo la propia clase puede ver y modificar esa variable.
        - Si el main quiere leer el dato, le creamos un método público llamado "Getter" (getSaldo).
        - Esto protege los datos internos de manipulaciones externas accidentales.
        */
    }
}

class CuentaBancaria {
    // Variable PRIVADA
    private double saldo;

    CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para "leer" el valor (GET)
    public double getSaldo() {
        return this.saldo;
    }
}
