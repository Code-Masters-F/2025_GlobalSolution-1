import java.util.HashSet;
import java.util.Set;

public class AbrigoImprovisado extends Abrigo{

    public static Set<AbrigoImprovisado> todosAbrigosImprovisados = new HashSet<>();

    public static void exibir() {
        for(AbrigoImprovisado abrigo : todosAbrigosImprovisados) {
            System.out.println(abrigo);
        }
    }

    public static void remover(int id) {
        for(AbrigoImprovisado abrigoImprovisado : todosAbrigosImprovisados) {
            if(abrigoImprovisado.getId() == id) {
                todosAbrigosImprovisados.remove(abrigoImprovisado);
                break;
            }
        }
    }

    private Usuario gestor;

    public AbrigoImprovisado(int id, String cep, String endereco, String email,
                             String dataFuncionamento, int capacidadeMaxima, Usuario gestor) {

        super(id, cep, endereco, email, dataFuncionamento, capacidadeMaxima);
        this.gestor = gestor;

        todosAbrigosImprovisados.add(this);
    }

    public Usuario getGestor() {
        return gestor;
    }


    @Override
    public String toString() {
        return super.toString() + " - Gestor: " + this.gestor.getNome();
    }
}
