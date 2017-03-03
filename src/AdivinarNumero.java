import java.util.Scanner;

/**
 * Simule un juego el cual consiste en adivinar un número. debe pedir un número N y luego ir pidiendo número indicando “mayor”o “menor” 
 * segun sea mayor o menor con respecto a N. el proceso termina cuando el usuario acierta. Recuerde debe hacer uso de algun bucle while o for. al 
 * final debe indicar la catidad de números ingresados para adivinar el número.
 */

/**
 * @author carlosjoseanguiano
 *
 */
public class AdivinarNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int piensaNumero;
		int dameNumero;
		int contador = 0;
		Scanner pnumero = new Scanner(System.in);
		Scanner dnumero = new Scanner(System.in);

		System.out.println("Piensa un numero");
		piensaNumero = pnumero.nextInt();
		do {
			System.out.println("Dame un numero a la suerte");
			dameNumero = dnumero.nextInt();
			
			if (dameNumero > piensaNumero) {
				System.out.println("Ingresaste un numero mayor que :" + piensaNumero);
				contador++;
			}
			else if (dameNumero == piensaNumero) {
				System.out.println("Ingresaste el numero correcto");

			} 
				
			else {
				System.out.println("Ingresaste un numero menor que :" + piensaNumero);
				contador++;

			}
			
		} while (dameNumero != piensaNumero);
		
		System.out.println("Para adivinar el numero ingresaste " + contador +" valores");
		System.out.println(dameNumero);
	}

}
