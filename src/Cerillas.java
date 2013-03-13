import java.util.Scanner;


public class Cerillas {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); //Scanner
		int cerillas, mano, result; //Variables
		
		while(keyboard.hasNextInt()){ //Mientras keden datos
			cerillas = keyboard.nextInt(); //leemos cerillas totales
			mano = keyboard.nextInt(); //leemos cerillas que podemos quitar
			result = cerillas - calcul(cerillas, mano);
			if (result == 0)
				System.out.println("PIERDO");
			else
				System.out.println(result);
		}
		keyboard.close();

	}

	static int calcul(int cerillas, int mano) {
		int res = 1;
		while (res <= cerillas) { //Partimos de 1 (la ultima cerilla, y le sumamos...
			res += mano+1; 			// ...la jugada perfecta -> la mano +1, hasta llegar al total
		}
		return res-=mano+1;		// hay k eliminar la ultima iteracion que pasa del total
	}

}
