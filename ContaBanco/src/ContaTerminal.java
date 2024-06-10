import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();


		System.out.print("Digite a agencia: ");	     	
		String agencia = scanner.nextLine();	     

		System.out.print("Digite o numero da conta: ");	     	
		int numero = scanner.nextInt();	     
 
		// Lendo um número decimal	        
		System.out.print("Digite o saldo: ");	        
		double saldo = scanner.nextDouble();	        
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque\".");
		

		// Lembre-se de fechar o Scanner quando não precisar mais dele
		scanner.close();

	}


}
