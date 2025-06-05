public class AbrigoImprovisado extends Abrigo{

    private Usuario gestor;

    public AbrigoImprovisado(int id, String cep, String endereco, String email,
                             String dataFuncionamento, int capacidadeMaxima, Usuario gestor) {

        super(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima);
        this.gestor = gestor;
    }

    public Usuario getGestor() {
        return gestor;
    }


    @Override
    public String toString() {
        return super.toString() + " - Gestor: " + this.gestor.getNome();
    }
}
