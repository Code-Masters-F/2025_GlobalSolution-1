import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Abrigo {

    private int id;
    private String cep;
    private String endereco;
    private String email;
    private LocalDateTime dataFuncionamento;
    private int capacidadeMaxima;

    // Formato de data e hora para o banco de dados e exibição,
    // a classe deve receber data e hora neste formato
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    Abrigo(int id, String cep, String endereco, String email, String dataFuncionamento, int capacidadeMaxima) {
        this.id = id;
        this.cep = cep;
        this.endereco = endereco;
        this.email = email;
        this.dataFuncionamento = LocalDateTime.parse(dataFuncionamento, formatter);
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getDataFuncionamento() {
        return dataFuncionamento.format(formatter);
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataFuncionamento(String dataFuncionamento) {
        this.dataFuncionamento = LocalDateTime.parse(dataFuncionamento, formatter);
    }

    @Override
    public String toString() {
        return "Abrigo{" + "id=" + id + ", cep=" + cep + ", endereco=" + endereco + ", email=" + email +
                ", dataFuncionamento=" + this.getDataFuncionamento() + ", capacidadeMaxima=" + capacidadeMaxima + '}';
    }

}
