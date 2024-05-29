import java.util.Scanner;

public class MainCinquenta {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira o comprimento do terreno");
		double comprimento = ref.nextDouble();
		
		System.out.println("Insira a largura do terreno");
		double largura = ref.nextDouble();
		
		System.out.println("O comprimento do terreno é: " + comprimento);
		
		System.out.println("A largura do terreno é: " + largura);
		
		double area = comprimento * largura;
		
		System.out.println("A área do terreno é: " + area);

	}

}
