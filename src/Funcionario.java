public class Funcionario extends Pessoa {


    public Funcionario(String nome, String sobrenome, String cpf, double salario){
        super(nome,sobrenome,cpf,salario);
    }

    @Override
    public String toString(){
        return "FUNCIONARIO: "+getNome()+" "+getSobrenome();
    }
    @Override
    public String cadastro(){
        return "Funcionario cadastrado com sucesso";
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
        return getNome().charAt(0)+getSobrenome()+"@univali.br";
    }
}
