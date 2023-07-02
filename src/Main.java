import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistraPessoa registraPessoa = new RegistraPessoa();
        Pessoa[] campusKobrasol = new Pessoa[1000];
        boolean menu = true, encontrado=false;
        int escolha = 0, i=0, posicaoEncontrado=0;
        String tipo, nome, sobrenome, cpf, pesquisa;
        double monetizacao;
        String[] disciplinas = new String[7];

        campusKobrasol[i] = registraPessoa.registrarUmaPessoa("Professor", "Fernanda", "Cunha", "1", 0.0);

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("#-------# SECRETARIA ACADEMICA #-------#");
            System.out.println("Bem vindo ao sistema de cadastros e acompanhamento da secretaria academica, escolha uma das opcoes abaixo para continuar: ");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Procurar");
            System.out.println("3 - Trancar Curso");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.println("Opcao: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (escolha){
                case 1:
                    if (menuPessoa() == 1){

                    }else if (menuPessoa() == 2){

                    }else if (menuPessoa() == 3){

                    }else{
                        System.out.println("Voce nao selecionou ninguem, realize a operacao novamente.");
                    }
                    break;
                case 2:
                    System.out.println("Insira o cpf da pessoa procurada: ");
                    pesquisa = scanner.nextLine();
                    for(int j = 0 ; j< campusKobrasol.length; j++){
                        if(campusKobrasol[j] != null && campusKobrasol[j].getCpf().equals(pesquisa)){
                            encontrado = true;
                            posicaoEncontrado = j;
                        }
                    }
                    if(encontrado){
                        System.out.println("Encontrado!");
                        System.out.println(campusKobrasol[posicaoEncontrado].toString());
                    }else{
                        System.out.println("CPF INEXISTENTE");
                    }
                    break;
                case 3:
                    System.out.println("Insira o cpf do aluno: ");
                    pesquisa = scanner.nextLine();
                    for(int j = 0 ; j< campusKobrasol.length; j++){
                        if(campusKobrasol[j] != null && campusKobrasol[j].getCpf().equals(pesquisa)){
                            encontrado = true;
                            posicaoEncontrado = j;
                        }
                    }
                    if(encontrado){
                        System.out.println("TRANCAR CURSO DE "+campusKobrasol[posicaoEncontrado].toString());
                        if(confirm())
                            campusKobrasol[posicaoEncontrado].setDisciplinas(String[] disciplinas);
                    }else{
                        System.out.println("CPF INEXISTENTE");
                    }
                    break;
                case 4:
                    if (menuPessoa() == 1){

                    }else if (menuPessoa() == 2){

                    }else if (menuPessoa() == 3){

                    }else{
                        System.out.println("Voce nao selecionou ninguem, realize a operacao novamente.");
                    }
                    break;
                case 5:
                    menu = false;
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("[ERRO] Selecione alguma das opcoes (1-5)");
            }

        }while(menu == true);
    }

    public static boolean confirm(){
        System.out.print("Digite 'sim' para confirmar ou 'nao' para cancelar: ");

        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine().toLowerCase();

        return resposta.equals("sim");
    }

    public static int menuPessoa(){
        boolean menu = true;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("#-------# SECRETARIA ACADEMICA #-------#");
            System.out.println("Escolha um tipo de pessoa: ");
            System.out.println("1 - Professor");
            System.out.println("2 - Aluno");
            System.out.println("3 - Funcionario");
            System.out.println("4 - Cancelar solicitacao");
            System.out.println("Opcao: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (escolha){
                case 1:
                    System.out.println("----------- PROFESSOR -----------");
                    return 1;
                case 2:
                    System.out.println("----------- ALUNO -----------");
                    return 2;
                case 3:
                    System.out.println("----------- FUNCIONARIO -----------");
                    return 3;
                case 4:
                    menu = false;
                    return 0;
                case 0:
                    System.out.println("\nESCOLHA ALGUMA OPCAO!\n");
                    break;
                default:

            }

        }while(menu == true);
        return 0;
    }


}