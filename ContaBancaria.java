public class ContaBancaria {
    
    private double saldo;  //Encapusulamento serve para proteger tal dado programado.

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
    if (valor > 0) {
        saldo = saldo + valor;

    } 

    }
}
