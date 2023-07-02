public class RegistraPessoa {
    public Pessoa registrarUmaPessoa(String tipo, String nome, String sobrenome, String cpf, double monetizacao) {
        if (tipo.equals("Professor")) {
            return new Professor(nome,sobrenome, cpf, monetizacao);
        } else if (tipo.equals("Funcionario")) {
            return new Funcionario(nome,sobrenome, cpf, monetizacao);
        } else if (tipo.equals("Aluno")) {
            return new Aluno(nome,sobrenome, cpf, monetizacao);
        } else {
            throw new IllegalArgumentException("Tipo de pessoa inválido");
        }
    }
}
