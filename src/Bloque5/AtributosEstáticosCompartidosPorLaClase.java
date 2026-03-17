package Bloque5;

public class AtributosEstáticosCompartidosPorLaClase {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Demostrar el uso de la palabra clave 'static' creando un contador global 
        que sepa cuántos objetos 'Factura' se han creado en todo el programa.
        */

        Factura f1 = new Factura();
        Factura f2 = new Factura();
        Factura f3 = new Factura();

        // Para ver el total, no le preguntamos a f1 o f2, le preguntamos a la Clase entera
        System.out.println("Total de facturas emitidas: " + Factura.cantidadFacturas);

        /*
        EXPLICACIÓN
        - Un atributo normal (sin static) pertenece a UN solo objeto.
        - Un atributo 'static' pertenece a la CLASE. Es como una variable global compartida 
          entre todos los objetos de ese tipo.
        - Por eso, cada vez que hacemos 'new Factura()', el contador global sube 1.
        */
    }
}

class Factura {
    // Variable estática (compartida por todas las facturas)
    public static int cantidadFacturas = 0;

    Factura() {
        // Cada vez que nace una nueva factura, sumamos 1 al contador global
        cantidadFacturas++;
    }
}
