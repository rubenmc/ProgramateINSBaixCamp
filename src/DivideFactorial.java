import java.util.Scanner;
/**
 * 
 * Divide el factorial del segundo numero por el primero y devuelve YES si el residuo es 0 o NO si el residuo es diferente a 0
 * 
 *Correcto en el juez
 *
 */
public class DivideFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = Integer.parseInt(scan.next());
		int n = Integer.parseInt(scan.next());
		boolean sortida = false;
		while (!sortida) {
			if (!(p<0 && n<0)) {//Comprovamos si los numeros son positivos
				if(n==0){ //Si el numero es 0 lo cambiamos a 1
					n=1;
				}
				if(p<=n){
					System.out.println("YES");
				} else if (n%p==0){
					System.out.println("YES");
				} else {
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
// Añado comentario para ordenar
