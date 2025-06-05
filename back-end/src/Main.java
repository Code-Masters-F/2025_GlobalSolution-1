

public class Main {

    public static void criarAbrigoOficial(int id, String cep, String endereco, String email, String dataFuncionamento,
                                          int capacidadeMaxima, String nome, String cnpj) {

        new AbrigoOficial(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima, nome, cnpj);
    }

    public static void criarAbrigoImprovisado(int id, String cep, String endereco,
                                              String dataFuncionamento, int capacidadeMaxima, Usuario gestor) {

        gestor.cadastrarAbrigoImprovisado(id, cep, endereco, dataFuncionamento, capacidadeMaxima);
    }


    public static void main(String[] args) {

        // OBS: não foi implementado uma entrada de dados do usuário diretamente pelo
        // código Java, pois os dados serão colhidos por uma interface front-end


        // Sugestão de teste

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
