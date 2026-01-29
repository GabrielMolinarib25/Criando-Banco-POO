public interface IConta {
    
    void sacar(double valor,int senhaAccount);

    void depositar(double valor,int senhaAccount);

    void transferir(double valor, Conta contaDestino, int senhaAccount);
    void imprimirExtrato();
    
}