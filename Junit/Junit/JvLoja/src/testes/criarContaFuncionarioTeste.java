import org.junit.Test;
import static org.junit.Assert.*;

public class CriarContaFuncionarioTeste {

    @Test
    public void testeCriarContaFuncionario() {
        String cpf = "6547763322";
        String nome = "Funcionaria de Tal";
        String dataNascimento = "01/01/2000";
        String email = "detal@funcionaria.com";
        String senha = "password123";
        String confirmacaoSenha = "password123";
        CriarContaFuncionario.criarContaFuncionario();
        Conta conta = new Conta(cpf, nome, dataNascimento, email, senha);
        assertEquals(cpf, conta.getCpf());
        assertEquals(nome, conta.getNome());
        assertEquals(dataNascimento, conta.getDataNascimento());
        assertEquals(email, conta.getEmail());
    }
}
