public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, int senha) {
        super(nome, senha);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }

   
    
    


    

}
