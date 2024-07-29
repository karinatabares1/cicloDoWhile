package cicloDoWhile;

public class Cuadrado {
	 public static void main(String[] args) {
	        int numero = 1;

	        do {
	            int cuadrado = numero * numero;
	            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
	            numero++;
	        } while (numero <= 3);
	    }
}
