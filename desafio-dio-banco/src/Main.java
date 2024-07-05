import java.util.function.DoubleToIntFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente clayton = new Cliente();
        clayton.setNome("Clayton");

        ContaCorrente cc = new ContaCorrente(clayton);
        ContaPoupanca poupanca = new ContaPoupanca(clayton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}