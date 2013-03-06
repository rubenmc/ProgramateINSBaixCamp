import java.util.Scanner;

class LecturaInfinitaJava {

	public static boolean casoDePrueba(Scanner scan) {
		if (scan.hasNext())
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		while (casoDePrueba(scan)) {
			// algo
		}

	}
}
