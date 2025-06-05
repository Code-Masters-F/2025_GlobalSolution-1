import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;

    List<AbrigoImprovisado> abrigosCriados  = new ArrayList<>();


    public Usuario(int id, String nome, String email, String senha, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void cadastrarAbrigoImprovisado(int id, String cep, String endereco,
                                           String dataFuncionamento, int capacidadeMaxima) {

        AbrigoImprovisado novoAbrigo = new AbrigoImprovisado(id, cep, endereco, this.email, dataFuncionamento,
                capacidadeMaxima, this);

        this.abrigosCriados.add(novoAbrigo);
    }

    public List<AbrigoImprovisado> getAbrigosCriados() {
        return abrigosCriados;
    }

    /**
     * Exclui da lista do Usuario e da lista de AbrigosImprovisados,
     * tudo com base no id
     * @param id
     */
    public void excluirAbrigoCriado(int id) {
        AbrigoImprovisado.remover(id);

        for(AbrigoImprovisado abrigo : abrigosCriados) {
            if(abrigo.getId() == id) {
                this.abrigosCriados.remove(abrigo);
                return;
            }
        }
    }

}
