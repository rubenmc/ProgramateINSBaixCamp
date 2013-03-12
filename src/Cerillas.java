import java.util.Scanner;


public class Cerillas {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int cerillas, mano, result;
		
		while(keyboard.hasNextInt()){
			cerillas = keyboard.nextInt();
			mano = keyboard.nextInt();
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
		while (res <= cerillas) {
			res += mano+1;
		}
		return res-=mano+1;
	}

}
