


public abstract class Conta implements IConta {
    
    protected int senha;
    protected String nome;
    protected int agencia;
    protected int numero;
    private double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    public Conta(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
    }

    
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void sacar(double valor,int senhaAccount) {   
        if (validarSenha(senhaAccount)){
        saldo = saldo - valor;
        }
    }

    
    public void depositar(double valor,int senhaAccount) {
        if (validarSenha(senhaAccount)){
        saldo = saldo + valor;
        }
    }

    
    public void transferir(double valor, Conta contaDestino,int senhaAccount) {
        if (validarSenha(senhaAccount)){
        this.sacar(valor, senhaAccount);
        contaDestino.depositar(valor, senhaAccount);
        }
    }



     protected void imprimirInfosComuns() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Agência:" + this.agencia);
        System.out.println("Número:" + this.numero);
        System.out.println("Saldo:" + this.getSaldo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean validarSenha(int senhaAccount) {
        if (this.senha != senhaAccount) {
            System.out.println("Senha inválida!");
            return false;
        }
        return true;
    }

    


}
