import java.util.HashSet;
import java.util.Set;

public class AbrigoOficial extends Abrigo{

    public static Set<AbrigoOficial> todosAbrigosOficiais = new HashSet<>();

    public static void exibir() {
        for(AbrigoOficial abrigo : todosAbrigosOficiais) {
            System.out.println(abrigo);
        }
    }

    public static void remover(int id) {
        for(AbrigoOficial abrigoOficial : todosAbrigosOficiais) {
            if(abrigoOficial.getId() == id) {
                todosAbrigosOficiais.remove(abrigoOficial);
                break;
            }
        }
    }

    private String nome;
    private String cnpj;

    // Essses dados devem ser passados por uma API, que colhe de uma fonte oficial
    public AbrigoOficial(int id, String cep, String endereco, String email, String dataFuncionamento,
                         int capacidadeMaxima, String nome, String cnpj) {

        super(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima);
        this.nome = nome;
        this.cnpj = cnpj;

        todosAbrigosOficiais.add(this);
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + " - Nome: " + this.nome + " - CNPJ: " + this.cnpj;
    }
}
