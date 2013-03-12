import java.util.Scanner;


public class Ciclistas {

	static int contador_pos,pos_inici,longitud=0;
	
	public static void main(String[] args) {
		boolean pla = false;
		int contador_metres=0,seguent,anterior;
		Scanner scan = new Scanner(System.in);
		System.out.println("a");
		anterior = Integer.parseInt(scan.next());
		while(anterior!=-1){
			seguent = Integer.parseInt(scan.next());
			contador_pos = 2;
			while(seguent!=-1){
				if(seguent==anterior){
					pla = true;
					contador_metres++;
					contador_pos++;
				} else {
					anterior = seguent;
					contador_pos++;
					comprova_metres(contador_metres);
					contador_metres=0;
				}
				seguent=Integer.parseInt(scan.next());
			}
			if(pla){
				System.out.println(pos_inici+" "+contador_metres);
			} else {
				System.out.println("HOY NO COMEN");
			}
			pla = false;
			contador_metres=0;
			pos_inici=0;
			longitud = 0;
			anterior = Integer.parseInt(scan.next());
		}

	}

	private static void comprova_metres(int metres) {
		if(metres>longitud){
			pos_inici=contador_pos-metres;
			longitud=metres;
		}
		
	}

}
