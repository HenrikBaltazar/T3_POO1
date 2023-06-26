public class Aluno extends Pessoa{

    public Aluno(String nome, String sobrenome) {
        super(nome,sobrenome);
    }

    @Override
    public String email(){
        return getNome()+"."+getSobrenome()+"@edu.univali.br";
    }

}
