import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void criarAbrigoOficial(int id, String cep, String endereco, String email, String dataFuncionamento,
                                          int capacidadeMaxima, String nome, String cnpj) {

        new AbrigoOficial(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima, nome, cnpj);
    }

    public static void criarAbrigoImprovisado(int id, String cep, String endereco,
                                              String dataFuncionamento, int capacidadeMaxima, Usuario gestor) {

        gestor.cadastrarAbrigoImprovisado(id, cep, endereco, dataFuncionamento, capacidadeMaxima);
    }

    // Usuarios cadastrados
    public static Set<Usuario> todosUsuarios = new HashSet<>();

    public static void criarUsuario(int id, String nome, String email, String senha, String cpf, String telefone) {
        todosUsuarios.add(new Usuario(id, nome, email, senha, cpf, telefone));
    }

    public static void exibirUsuarios() {
        System.out.println("\nUsuarios:");
        for(Usuario usuario : todosUsuarios) {
            System.out.println(usuario.toString());
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - criar usuario");
            System.out.println("2 - exibir usuarios");
            System.out.println("3 - criar abrigo improvisado");
            System.out.println("4 - excluir abrigo improvisado");
            System.out.println("5 - exibir abrigos improvisados");
            System.out.println("6 - criar abrigo oficial");
            System.out.println("7 - excluir abrigo oficial");
            System.out.println("8 - exibir abrigo oficial");
            System.out.println("0 - sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.print("Digite o ID deste novo usuario: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer

                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o email: ");
                        String email = scanner.nextLine();

                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();

                        System.out.print("Digite o CPF: ");
                        String cpf = scanner.nextLine();

                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();

                        criarUsuario(id, nome, email, senha, cpf, telefone);
                        break;
                    case "2":
                        System.out.println("Exibindo usuários...");
                        exibirUsuarios();
                        break;
                    case "3":
                        System.out.print("Digite o ID deste novo abrigo: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Digite o CEP: ");
                        String cep = scanner.nextLine();

                        System.out.print("Digite o endereço: ");
                        String endereco = scanner.nextLine();

                        System.out.print("Digite a data de termino de funcionamento (dd/MM/yyyy HH:mm): ");
                        String dataFuncionamento = scanner.nextLine();

                        System.out.print("Digite a capacidade máxima: ");
                        int capacidadeMaxima = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Digite o id do usuario que esta criando este abrigo: ");
                        int idUsuario = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        for (Usuario usuario : todosUsuarios) {
                            if(usuario.getId() == idUsuario){
                                usuario.cadastrarAbrigoImprovisado(id, cep, endereco, dataFuncionamento, capacidadeMaxima);
                                System.out.println("Estabelecimento criado com sucesso!");
                            }
                        }
                        break;
                    case "4":
                        System.out.println("Digite o id do usuario que criou este abrigo: ");
                        idUsuario = scanner.nextInt();
                        System.out.println("Digite o id do abrigo que deseja excluir: ");
                        id = scanner.nextInt();
                        for (Usuario usuario : todosUsuarios) {
                            if(usuario.getId() == idUsuario){
                                usuario.excluirAbrigoCriado(id);
                            }
                        }
                        break;
                    case "5":
                        System.out.println("Exibindo abrigos improvisados...");
                        AbrigoImprovisado.exibir();
                        break;
                    case "6":
                        System.out.print("Digite o ID no novo abrigo Oficial: ");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Digite o CEP: ");
                        cep = scanner.nextLine();

                        System.out.print("Digite o endereço: ");
                        endereco = scanner.nextLine();

                        System.out.print("Digite o email: ");
                        email = scanner.nextLine();

                        System.out.print("Digite a data de termino de funcionamento (dd/MM/yyyy HH:mm): ");
                        dataFuncionamento = scanner.nextLine();

                        System.out.print("Digite a capacidade máxima: ");
                        capacidadeMaxima = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Digite o nome: ");
                        nome = scanner.nextLine();

                        System.out.print("Digite o CNPJ: ");
                        String cnpj = scanner.nextLine();

                        criarAbrigoOficial(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima, nome, cnpj);
                        break;
                    case "7":
                        System.out.println("Digite o id do abrigo Oficial que deseja excluir:");
                        id = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer
                        AbrigoOficial.remover(id);
                        break;
                    case "8":
                        System.out.println("Exibindo abrigos oficial...");
                        AbrigoOficial.exibir();
                        break;
                    case "0":
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }catch(Exception e) {
                System.out.println("Erro ao processar a opção. Tente novamente.");
            }finally {
                scanner.nextLine(); // a ultima opção pode ser um int
            }
        } while (!opcao.equals("0"));

        scanner.close();

        // Caso não queira digitar:

        /*
        Usuario pedro1234 = new Usuario(1, "Pedro", "pedro@email.com", "1234",
                "123.456.789-00", "(11) 99999-9999");

        Usuario maria1234 = new Usuario(2, "Maria", "maria@email.com", "aaa333",
                "123.456.789-11", "(11) 88888-7777");

        System.out.println("\n" + pedro1234.toString() + "\n" + maria1234.toString() + "\n");


        criarAbrigoImprovisado(134, "232-000", "numero 12, av. ABC, Centro",
                "01/01/2020 12:00", 100, pedro1234);

        criarAbrigoImprovisado(133, "232-000", "numero 14, av. ABC, Centro",
                "01/01/2020 12:00", 50, pedro1234);

        criarAbrigoImprovisado(188, "555-000", "numero 88, rua DEF, Centro",
                "05/01/2021 23:59", 78, maria1234);


        AbrigoImprovisado.exibir();

        pedro1234.excluirAbrigoCriado(133);

        System.out.println("\nRemovendo---------------------------");
        AbrigoImprovisado.exibir();

        criarAbrigoOficial(230, "555-000", "numero 88, rua DEF, Centro",
                "gov@email.com", "05/01/2021 23:59", 78, "Escola Municipal",
                "99.999.999/0000-00");

        criarAbrigoOficial(233, "555-088", "numero 150, rua GHI, Centro",
                "gov@email.com", "05/01/2021 23:59", 120, "Escola Estadual",
                "99.999.999/0000-00");

        System.out.println("\n");
        AbrigoOficial.exibir();

        AbrigoOficial.remover(230);

        System.out.println("\nRemovendo---------------------------");
        AbrigoOficial.exibir();
        */
    }
}
