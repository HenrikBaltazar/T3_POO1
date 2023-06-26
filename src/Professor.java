public class Professor extends Pessoa{

    public Professor(String nome, String sobrenome) {
        super(nome,sobrenome);
    }

    @Override
    public String email(){
        return getNome()+"."+getSobrenome()+"@univali.br";
    }

}
