import java.util.Scanner;
/**
 * 
 * @author Ruben
 * Da Run Error
 * Se tiene que comprovar que los dos numeros son positivos
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
			if (p !=-1 && n != -1) {
				res = 1;
				if (n != 0) {
					for (int x = 1; x < n; x++) {
						res = res * x;
					}
				}
				if (res % p == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				p = Integer.parseInt(scan.next());
				n = Integer.parseInt(scan.next());
			} else {
				sortida = true;
			}
		}
		scan.close();

	}

}
