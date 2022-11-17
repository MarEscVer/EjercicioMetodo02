package unico;

public class Ejercicio02 {

	public static void main(String[] args) {

/* Implementar un método al que se le pasen dos números
 * enteros y muestre todos los números comprendidos entre ellos.
 */

		int num1;
		int num2;
		num1 = Util.leerInt("Introduzca un primer número: ");
		num2 = Util.leerInt("Introduzca un segundo número: ");
		numComprendidos(num1, num2);
		
	}
	
	public static void numComprendidos(int n1, int n2) {
		
		int mayor;
		int menor;
		
		if (n1 > n2) {
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}
		
		for (int i=menor; i <= mayor; i++) {
			System.out.println(i);
		}
	}
	
}
