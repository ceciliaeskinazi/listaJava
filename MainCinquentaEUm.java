import java.util.Scanner;

public class MainCinquentaEUm {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double numUm = ref.nextDouble();
		
		System.out.println("Digite outro número");
		double numDois = ref.nextDouble();
		
		double numUm1 = numDois;
		double numDois1 = numUm1;
		
		System.out.println("O primeiro número é: " + numUm1);
		System.out.println("O segundo número é: " + numDois1);
	}

}
