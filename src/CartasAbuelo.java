import java.util.Scanner;

public class CartasAbuelo {

	public static void main(String[] args) {


		int num1, num2;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		String frase;
		int intervalo;

		while (flag) {
			frase = scan.nextLine().trim();
			intervalo = scan.nextInt();
			if (intervalo != 0) {
				for (; intervalo > 0; intervalo--) {
					num1 = scan.nextInt();
					num2 = scan.nextInt();
					if ((num1 >= 0 && num1 < frase.length())
							&& (num2 >= 0 && num2 < frase.length())) {

						int x = 0;
						for (int i = Math.min(num1, num2); i < Math.max(num1,
								num2); i++) {
							if (frase.charAt(i) == frase.charAt(i + 1)) {
								x++;
							}
						}
						if (x == (Math.max(num1, num2) - Math.min(num1, num2))) {
							System.out.println("SI");
						} else
							System.out.println("NO");
					}
				}
				System.out.println();
				scan.next();
			} else
				flag = false;
		}
		System.out.println();
		scan.close();
	}
}
