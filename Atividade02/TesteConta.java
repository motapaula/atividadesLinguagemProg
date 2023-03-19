public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Pedro", 5698, 123456, 125);
        conta1.deposito(100, 123456);
        System.out.println(conta1.getsaldoConta());

        conta1.saque(200, 123456);
        System.out.println(conta1.getsaldoConta());

        conta1.saque(50, 123456);
        System.out.println(conta1.getsaldoConta());

    }
}
