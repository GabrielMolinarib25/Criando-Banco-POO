public class App {
    public static void main(String[] args) throws Exception {
        
        Conta cc = new ContaCorrente("Gabriel", 1234);
        cc.depositar(800, 1234);
        Conta cp = new ContaPoupanca("Gabriel", 1234);
        cc.transferir(100, cp, 1234);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
