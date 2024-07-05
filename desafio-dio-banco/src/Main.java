// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        Cliente clayton = new Cliente();
        clayton.setNome("Clayton");

        ContaCorrente cc = new ContaCorrente(clayton);
        ContaPoupanca poupanca = new ContaPoupanca(clayton);

        cc.depositar(500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
     

    }
}