package Bloque1;

public class OperadoresLógicos {

	public static void main(String[] args) {

		/*
        CONSIGNA
        En una tienda, un cliente tiene descuento si su compra supera los 100 dólares 
        O si tiene una tarjeta de membresía VIP.
        Determinar si un cliente específico recibe el descuento.
        */
		
		double montoCompra = 85.50;
		boolean tieneMembresiaVIP = true;
				
		// Operador OR ( || ) - Evalúa si al menos una condición es verdadera
		boolean aplicaDescuento = (montoCompra > 100) || tieneMembresiaVIP;
		
		System.out.println("Monto de la compra: $" + montoCompra);
		System.out.println("Tiene tarjeta VIP: " + tieneMembresiaVIP);
		System.out.println("¿Recibe descuento en su compra?: " + aplicaDescuento);
		
		/*
        EXPLICACIÓN
        - Los operadores lógicos conectan múltiples condiciones.
        - '||' (OR): Devuelve true si la primera condición es verdadera, O la segunda es verdadera, O ambas lo son.
        - '&&' (AND): Devolvería true SOLO si el monto es mayor a 100 Y además tiene membresía.
        - En este caso, aunque la compra es menor a 100, como tiene VIP (true), el resultado final es true.
        */
		
	}

}
