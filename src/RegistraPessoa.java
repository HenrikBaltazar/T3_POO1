public class RegistraPessoa {
    public Pessoa registrarUmaPessoa(String tipo, String nome, String sobrenome) {
        if (tipo.equals("Professor")) {
            return new Professor(nome,sobrenome);
        } else if (tipo.equals("Aluno")) {
            return new Aluno(nome,sobrenome);
        } else {
            throw new IllegalArgumentException("Tipo de pessoa inválido");
        }
    }
}
