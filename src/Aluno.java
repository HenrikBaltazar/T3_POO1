public class Aluno extends Pessoa{
    double mensalidade,bolsaPesquisa;
    String[] disciplinas = new String[7];
    public Aluno(String nome, String sobrenome, String cpf, double desconto) {
        super(nome,sobrenome, cpf, desconto);
    }

    @Override
    public String cadastro(){
        return "Aluno cadastrado com sucesso";
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
        mensalidade = disciplinas.length*250.00-getMonetizacao();
        if (mensalidade<0)
            mensalidade = 0;
    }

    public boolean hasBolsa(){
        if (bolsaPesquisa > 0)
            return true;
        else
            return false;
    }

    public void cadastrarBolsaPesquisa(double bolsa){
        bolsaPesquisa = bolsa;
    }

    @Override
    public String toString(){
        return "ALUNO: "+getNome()+" "+getSobrenome();
    }

    @Override
    public double contasAReceber(){
        return bolsaPesquisa;
    }

    @Override
    public double contasAPagar(){
        return mensalidade;
    }

    @Override
    public String email(){
        return getNome()+"."+getSobrenome()+"@edu.univali.br";
    }

}
