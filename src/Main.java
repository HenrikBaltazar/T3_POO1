import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistraPessoa registraPessoa = new RegistraPessoa();

        Pessoa pessoa1 = registraPessoa.registrarUmaPessoa("Professor", "Fernanda", "Cunha");
        System.out.println(pessoa1.email());

        Pessoa pessoa2 = registraPessoa.registrarUmaPessoa("Aluno", "Gabriel", "Victor");
        System.out.println(pessoa2.email());
        mainMenu();
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
                    System.out.println("Do nothing;");
                    return 1;
                case 2:
                    System.out.println("Do nothing;");
                    return 2;
                case 3:
                    System.out.println("Do nothing;");
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

    public static void mainMenu(){
        boolean menu = true;
        int escolha = 0;
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
                    menuPessoa();
                    break;
                case 2:
                    menuPessoa();
                    break;
                case 3:
                    System.out.println("Do nothing;");
                    break;
                case 4:
                    menuPessoa();
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

}