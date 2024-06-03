import java.util.Scanner;

public class MainQuatro {

	public static void main(String[] args) {
		
		int soma = 0;
		Scanner ref = new Scanner(System.in);
		
		for (int i = 1; i < 7; i ++) {
		
		System.out.println("Insira seis números");
		int numUm = ref.nextInt();
		
		soma = soma + numUm;
		}
		

		double media = soma / 6;
		
		System.out.println("A média dos números é: " + media);

	}
}
