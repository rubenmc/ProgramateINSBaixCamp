import java.util.Scanner;
/**
 * 
 * @author Ruben
 * Divide el factorial del segundo numero por el primero y devuelve YES si el residuo es 0 o NO si el residuo es diferente a 0
 * 
 * 
 * A terminar:
 * 
 * Da Run Error
 * Comprovar si el primero es primo?
 *
 */
public class DivideFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = Integer.parseInt(scan.next());
		int n = Integer.parseInt(scan.next());
		int res;
		boolean sortida = false;
		while (!sortida) {
			if (!(p<0 && n<0)) {//Comprovamos si los numeros son positivos
				//Inicializamos res
				res = 1;
				if (n != 0) { //Si es 0 dejamos a res en 1, si no, calculamos el factorial
					for (int x = 1; x < n; x++) {
						res = res * x;
					}
				}
				//Si la division no da residuo imprimimos YES
				if (res % p == 0) {
					System.out.println("YES");
				} else { //Si la division da residuo imprimimos NO
					System.out.println("NO");
				}
				//Recogemos los nuevos casos
				p = Integer.parseInt(scan.next());
				n = Integer.parseInt(scan.next());
			} else {
				sortida = true;//Cambiamos la variable para salir del bucle
			}
		}
		scan.close();

	}

}
