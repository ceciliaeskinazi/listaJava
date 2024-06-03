import java.util.Scanner;

public class MainDezesseis {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numPrimo = ref.nextInt();
		
		if (((numPrimo % numPrimo )== 0) && ((numPrimo % 1) == 0)) {
			System.out.printf("O número é primo!"); }
		
		else {
			System.out.printf("O número não é primo!");
	
		}
	}	
}
