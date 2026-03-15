package Bloque3;

public class ReutilizaciónDeMétodos {

	public static void main(String[] args) {
		
		/*
        CONSIGNA
        Crear un método que calcule el precio final con un IVA del 21%.
        Llamarlo con diferentes precios de productos.
        */
		
		double playstation = 500.0;
		double iphone = 1000.0;
		
		System.out.println("Precio final PS5: " + calcularPrecioFinal(playstation));
		System.out.println("Precio final Iphone: " + calcularPrecioFinal(iphone));
	}
	
	public static double calcularPrecioFinal(double precioBase) {
		return precioBase * 1.21;
	}
	
	/*
    EXPLICACIÓN
    - Si el gobierno cambiara el IVA al 25%, solo tendrías que cambiar 
      una línea de código en el método, y todo tu programa se actualizaría.
    */
	

}
