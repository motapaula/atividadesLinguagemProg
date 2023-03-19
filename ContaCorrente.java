public class ContaCorrente {
    private String nomeTitular;
    private int numeroConta;
    private int Senha;
    private double saldoConta;

    public ContaCorrente(String nomeTitular, int numeroConta, int Senha, double saldoConta){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.Senha = setSenha();
    }

    public int setSenha(){
        this.Senha = Senha;
        return Senha;
    }

    public void setSenha(int Senha){
        this.Senha = Senha;
    }

    public int getsaldoConta(int saldoConta){
        return saldoConta;
    }

    public void deposito(double valor, int Senha){
        this.saldoConta += valor;
        System.out.println("Seu novo saldo é: " + this.saldoConta);

    }

    public void saque(double valor, int Senha){
        if (this.saldoConta >= valor){
            this.saldoConta -= valor;
            System.out.println("Seu novo saldo após o saque é: " + this.saldoConta);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }

    public double getsaldoConta() {
        return saldoConta;
    }
}
