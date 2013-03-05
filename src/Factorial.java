import java.util.Scanner;


public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,repeticions,res;
		System.out.println("GO");
		Scanner scan = new Scanner(System.in);
		
		repeticions=scan.nextInt();
		for(int i=0;i<repeticions;i++){
			num=scan.nextInt();
			res=num;
			for(int x=1;x<num;x++){
				res=res*x;
			}
			String out = new String(String.valueOf(res));
			System.out.println(out.charAt(out.length()-1));
		}
		scan.close();

	}

}
