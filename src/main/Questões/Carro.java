public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int quantidade) {
        if (quantidade >= 0) {
            this.velocidadeAtual += quantidade;
        }
    }

    public void desacelerar(int quantidade) {
        if (quantidade >= 0) {
            this.velocidadeAtual -= quantidade;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
        }
    }
}