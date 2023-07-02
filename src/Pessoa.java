public abstract class Pessoa {
    String nome="",sobrenome="",cpf="";
    double monetizacao;

    public abstract String cadastro();
    public abstract String email();
    public abstract double contasAPagar();
    public abstract double contasAReceber();
    public abstract String toString();

    public Pessoa(String nome, String sobrenome, String cpf, double monetizacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        System.out.println(cadastro());
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getMonetizacao() {
        return monetizacao;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
