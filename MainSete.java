import java.util.Scanner;

public class MainSete {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.printf("Insira um número: ");
		int numUm = ref.nextInt();
		
		System.out.printf("Insira outro número: ");
		int numDois = ref.nextInt();
		
		System.out.printf("Insira mais um número: ");
		int numTres = ref.nextInt();
		
		if ((numUm > numDois) && numUm > numTres) {
			System.out.printf("O maior número é " + numUm);
		}
		
		if ((numDois > numUm) && numDois > numTres) {
			System.out.printf("O maior número é " + numDois);
		}
		
		if ((numTres > numUm) && numTres > numDois) {
			System.out.printf("O maior número é " + numTres);
		}
		
	}
}
