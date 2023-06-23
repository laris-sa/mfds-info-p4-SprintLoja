import org.junit.Test;
import static org.junit.Assert.*;

public class CriarContaTeste {

    @Test
    public void testeCriarContaCliente() {
        String cpf = "123456789";
        String nome = "larissa";
        String dataNascimento = "01/01/2000";
        String email = "larissa@larissa.com";
        String senha = "senha12345";
        String confirmacaoSenha = "senha12356";
        CriarConta.criarContaCliente();
        Conta conta = new Conta(cpf, nome, dataNascimento, email, senha);
        assertEquals(cpf, conta.getCpf());
        assertEquals(nome, conta.getNome());
        assertEquals(dataNascimento, conta.getDataNascimento());
        assertEquals(email, conta.getEmail());
    }
}
