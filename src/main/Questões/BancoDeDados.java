import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<String> registros;

    public BancoDeDados() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(String registro) {
        this.registros.add(registro);
        System.out.println("Registro adicionado: " + registro);
    }

    public void atualizarRegistro(int indice, String novoRegistro) {
        if (indiceValido(indice)) {
            this.registros.set(indice, novoRegistro);
            System.out.println("Registro atualizado: " + novoRegistro);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void excluirRegistro(int indice) {
        if (indiceValido(indice)) {
            String registroRemovido = this.registros.remove(indice);
            System.out.println("Registro removido: " + registroRemovido);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("Não há registros no banco de dados.");
        } else {
            System.out.println("Registros no banco de dados:");
            for (int i = 0; i < registros.size(); i++) {
                System.out.println(i + ": " + registros.get(i));
            }
        }
    }
    private boolean indiceValido(int indice) {
        return indice >= 0 && indice < registros.size();
    }
}
