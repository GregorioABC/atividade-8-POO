public class ContaBancaria {
    private String nomeTitular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
