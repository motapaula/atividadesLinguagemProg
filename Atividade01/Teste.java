import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nomeFunc = input.next();
        System.out.println("Digite a matrícula do funcionário: ");
        int numIdFunc = input.nextInt();
        System.out.println("Digite o salário do funcionário: ");
        float salarioFunc = input.nextFloat();
        System.out.println("Digite o e-mail do funcionário: ");
        String eMail = input.next();
        System.out.println("Digite o percentual de reajuste: ");
        float reajusteSalario = input.nextFloat();
        System.out.println("Seu salário após o reajuste é: R$ " + ((salarioFunc + (salarioFunc*(reajusteSalario/100)))));
        System.out.println("Digite o percentual de aliquota do imposto: ");
        float aliquota = input.nextFloat();
        System.out.println("Você pagará o seguinte valor de imposto: R$ " + (aliquota * ((salarioFunc + (salarioFunc*(reajusteSalario/100)))))/100);
    }
}
