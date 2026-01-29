public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome, int senha) {
        super(nome, senha);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
        
    }

    
     
    
}
