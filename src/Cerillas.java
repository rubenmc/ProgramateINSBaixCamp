import java.util.Scanner;


public class Cerillas {

	/**
	 * Falta saber cuando acaba el bucle
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ,max;
		boolean sortida = false;
		while(!sortida){
			num = Integer.parseInt(scan.next());
			max = Integer.parseInt(scan.next());
			if(num==max || num==max+1){
				System.out.println(num-1);
			} else if(num>max){
				System.out.println(1);
			} else {
				if(num==1){
					System.out.println("PIERDO");
					sortida=true;
				} else {
					System.out.println(num-1);
				}
			}
		}
		

	}

}
