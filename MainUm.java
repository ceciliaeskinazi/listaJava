import java.util.Scanner;

public class MainUm {

	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in);
		
		System.out.println("Insira um número");
		double num = ref.nextDouble();
		
		System.out.println("Insira mais um número");
		double numDois = ref.nextDouble();
		
		double soma = num + numDois;
		
		System.out.println("A soma dos dois números é: " + soma);
	}

}
