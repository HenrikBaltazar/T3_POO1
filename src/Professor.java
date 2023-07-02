public class Professor extends Pessoa{


    public Professor(String nome, String sobrenome,String cpf, double salario) {
        super(nome,sobrenome,cpf, salario);
    }

    @Override
    public String cadastro(){
        return "Professor cadastrado com sucesso";
    }

    @Override
    public String toString(){
        return "PROFESSOR: "+getNome()+" "+getSobrenome();
    }

    @Override
    public double contasAPagar(){
        return 0;
    }

    @Override
    public double contasAReceber(){
        return getMonetizacao();
    }
    @Override
    public String email(){
        return getNome()+"."+getSobrenome()+"@univali.br";
    }

}
