public class AbrigoOficial extends Abrigo{
    private String nome;
    private String cnpj;

    // Essses dados devem ser passados por uma API, que colhe de uma fonte oficial
    public AbrigoOficial(int id, String cep, String endereco, String email, String dataFuncionamento,
                         int capacidadeMaxima, String nome, String cnpj) {

        super(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima);
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return cnpj;
    }
}
