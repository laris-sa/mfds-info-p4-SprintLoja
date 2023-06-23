package principal;

import java.util.Scanner;
import criarConta.CriarConta;
import criarContaFuncionario.CriarContaFuncionario;

	public class Principal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            System.out.println("Menu:");
	            System.out.println("1 - Criar conta de cliente");
	            System.out.println("2 - Criar conta de funcionário");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    criarConta();
	                    break;
	                case 2:
	                    criarContaFuncionario();
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	            System.out.println();
	        } while (opcao != 0);

	        scanner.close();
	    }
	    
	    
	    public static void criarConta() {
	        CriarConta criarConta = new CriarConta();
	        criarConta.criarContaCliente();
	        System.out.println("Conta de cliente criada com sucesso!");
	        System.exit(0);
	    }
	    
	    public static void criarContaFuncionario(){
	        CriarContaFuncionario criarContaFuncionario = new CriarContaFuncionario();
	        criarContaFuncionario.criarContaFuncionario();
	        System.out.println("Conta de funcionário criada com sucesso!");
	        System.exit(0);
	    }
	}



