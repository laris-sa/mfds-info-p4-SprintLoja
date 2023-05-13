package criarConta;

import java.util.Scanner;

import java.util.Scanner;

public class CriarConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de Conta");

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Endereço de e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Confirmação de senha: ");
        String confirmacaoSenha = scanner.nextLine();

        if (senha.equals(confirmacaoSenha)) {
            // Criar uma conta com os dados fornecidos
            Conta conta = new Conta(cpf, nome, dataNascimento, email, senha);

            System.out.println();
            System.out.println("Conta criada com sucesso!");
            System.out.println("CPF: " + conta.getCpf());
            System.out.println("Nome: " + conta.getNome());
            System.out.println("Data de Nascimento: " + conta.getDataNascimento());
            System.out.println("E-mail: " + conta.getEmail());
        } else {
            System.out.println("As senhas não coincidem. Conta não criada.");
        }
    }
}

class Conta {
    private String cpf;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;

    public Conta(String cpf, String nome, String dataNascimento, String email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }
}


