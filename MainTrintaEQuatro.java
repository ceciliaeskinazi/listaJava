import java.util.Scanner;

public class MainTrintaEQuatro {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
			String nome = ref.nextLine();
	
		System.out.println("Insira seu endereço: ");
			String endereco = ref.nextLine();
		
		System.out.println("Insira seu telefone: ");
			String telefone = ref.nextLine();
			
		System.out.println("Insira sua idade: ");
			int idade = ref.nextInt();
			
		System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos, mora na rua " + endereco + " e seu telefone é " + telefone);
	}
	
}
