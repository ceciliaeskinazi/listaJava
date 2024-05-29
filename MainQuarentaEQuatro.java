import java.util.Scanner;

public class MainQuarentaEQuatro {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um número quebrado");
		double numUm = ref.nextDouble();
		
		System.out.println("Digite outro número quebrado");
		double numDois = ref.nextDouble();
		
		System.out.println("Digite mais um número quebrado");
		double numTres = ref.nextDouble();
		
		if ((numUm > numDois) && (numUm > numTres) && (numDois > numTres)) {
		System.out.println("O maior número é: " + numUm + " , o menor número é: " + numTres + " e o número intermediário é: " + numDois);
		}
		
		if ((numUm > numDois) && (numUm > numTres) && (numTres > numDois)) {
		System.out.println("O maior número é: " + numUm + " , o menor número é: " + numDois + " e o número intermediário é: " + numTres);
		}
		
		if ((numDois > numUm) && (numDois > numTres) && (numUm > numTres)) {
		System.out.println("O maior número é: " + numDois + " , o menor número é: " + numTres + " e o número intermediário é: " + numUm);
		}
		
		if ((numDois > numUm) && (numDois > numTres) && (numTres > numUm)) {
			System.out.println("O maior número é: " + numDois + " , o menor número é: " + numUm + " e o número intermediário é: " + numTres);
		}

		if ((numTres > numUm) && (numTres > numDois) && (numUm > numDois)) {
			System.out.println("O maior número é: " + numTres + " , o menor é: " + numDois + " e o intermediário é: " + numUm);
		}
		
		if ((numTres > numUm) && (numTres > numDois) && (numDois > numUm)) {
			System.out.println("O maior número é: " + numTres + " , o menor é: " + numUm + " e o intermediário é: " + numDois);
		}
	}
}
