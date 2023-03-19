import java.util.Scanner;
public class CadastroFuncionarios {
    private String nomeFunc;
    private int NumIdFunc;
    private float salarioFunc;
    private String eMail;
    private float reajusteSalario;
    private float aliquotaImposto;
    public CadastroFuncionarios(String nomeFunc, int NumIdFunc, float salarioFunc, String eMail, float reajusteSalario, float aliquotaImposto){
        this.nomeFunc = nomeFunc;
        this.NumIdFunc = NumIdFunc;
        this.salarioFunc = salarioFunc;
        this.eMail = eMail;
        this.reajusteSalario = reajusteSalario;
        this.aliquotaImposto = aliquotaImposto;

    }
    public void aumento (float reajusteSalario){
        this.salarioFunc += reajusteSalario;
        System.out.println("Seu salário após o reajuste é: R$ ");
    }

    public String getNomeFunc(){
        return this.nomeFunc;
    }

    public int getNumIdFunc(){
        return this.NumIdFunc;
    }

    public String geteMail(){
        return this.eMail;
    }

    public void setsalarioFunc(float salarioFunc){
        this.salarioFunc = salarioFunc;
    }

//    Calculo do imposto
    public void imposto (float aliquotaImposto){
        this.reajusteSalario += aliquotaImposto;
        System.out.println("Você pagará o seguinte valor de imposto: R$ ");
    }

}
