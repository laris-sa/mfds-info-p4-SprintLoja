package formaDePagamento;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormaDePagamento {

	public static void formaDePagamento() {
		System.out.println("Escolha a forma de pagamento:\n[1] - Boleto\n[2] - Pix\n[3] - Cart�o de d�bito\n[4] - Cart�o de cr�dito\n");
		
		Locale BRAZIL = new Locale("pt", "BR");
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		String escolha = sc.nextLine();
		switch (escolha) {
		case "1":
			System.out.print("Nome: ");
			String nome1 = sc.nextLine();
			
			System.out.print("CPF: ");
			String cpf = sc.next();
			
			System.out.print("Valor total: R$ ");
			Double valor1 = sc.nextDouble();
			
			System.out.println("\nBoleto de " + NumberFormat.getCurrencyInstance(BRAZIL).format(valor1) + " gerado.");
			break;
		case "2":
			System.out.print("Chave PIX: ");
			Integer chave = sc.nextInt();
			
			System.out.print("Valor total: R$ ");
			Double valor2 = sc.nextDouble();
			
			System.out.println("\nCompra de " + NumberFormat.getCurrencyInstance(BRAZIL).format(valor2) + " efetuada.");
			break;
		case "3":
			System.out.println("Tipo de cart�o: ");
			String cartao3 = sc.nextLine();
			
			System.out.print("Nome: ");
			String nome3 = sc.nextLine();
			
			System.out.print("N�mero: ");
			String numero3 = sc.next();
			
			System.out.print("MM/AA: ");
			String mes_ano3 = sc.next();
			
			System.out.print("CVV: ");
			String cvv3 = sc.next();
			
			System.out.print("Parcelas: ");
			Integer parcelas3 = sc.nextInt();
			
			System.out.print("Valor total: R$ ");
			Double valor3 = sc.nextDouble();
			
			Double parcela3 = valor3 / parcelas3;
			
			System.out.println("\nCompra de " + NumberFormat.getCurrencyInstance(BRAZIL).format(valor3) + " (" + parcelas3 + "x de " + NumberFormat.getCurrencyInstance(BRAZIL).format(parcela3) + ") + efetuada.");
			break;
			
		case "4":
			System.out.println("Tipo de cart�o: ");
			String cartao4 = sc.nextLine();
			
			System.out.print("Nome: ");
			String nome4 = sc.nextLine();
			
			System.out.print("N�mero: ");
			String numero4 = sc.next();
			
			System.out.print("MM/AA: ");
			String mes_ano4 = sc.next();
			
			System.out.print("CVV: ");
			String cvv4 = sc.next();
			
			System.out.print("Parcelas: ");
			Integer parcelas4 = sc.nextInt();
			
			System.out.print("Valor total: R$ ");
			Double valor4 = sc.nextDouble();
			
			Double parcela4 = valor4 / parcelas4;
			
			System.out.println("\nCompra de " + NumberFormat.getCurrencyInstance(BRAZIL).format(valor4) + " (" + parcelas4 + "x de " + NumberFormat.getCurrencyInstance(BRAZIL).format(parcela4) + ") + efetuada.");
			break;
		default:
			System.out.println("Valor inv�lido.");
			break;
		}
		sc.close();
	}

}
