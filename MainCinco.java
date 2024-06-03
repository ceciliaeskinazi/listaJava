import java.util.Scanner;

public class MainCinco {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira um ano");
		int ano = ref.nextInt();
		
		if ((ano % 4)== 0) {
			System.out.printf("O ano é bissexto!"); }
		
		else {
			System.out.printf("O ano não é bissexto!");
	
		}
		}

	}
