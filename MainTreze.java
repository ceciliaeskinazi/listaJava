import java.util.Scanner;

public class MainTreze {

	public static void main(String[] args) {
		Scanner ref = new Scanner (System.in);
		
		System.out.println("Insira uma nota");
		double notaUm = ref.nextDouble();
		
		System.out.println("Atribua um peso para a nota");
		double pesoUm = ref.nextDouble();

		System.out.println("Insira outra nota");
		double notaDois = ref.nextDouble();
		
		System.out.println("Atribua um peso para a outra nota");
		double pesoDois = ref.nextDouble();
		
		double mediaPond = ((notaUm * pesoUm) + (notaDois * pesoDois) / pesoUm + pesoDois);
		
		System.out.println("A média ponderada é: " + mediaPond);
	}

}
