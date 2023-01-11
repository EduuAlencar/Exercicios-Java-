package ContaSaldo;
public class Conta {

// aplicaçao do ENCAPSULAMENTO  = alterar a visibilidade
// dos atributos para proteçao dos dados
    private int clienteNumb;
    private double saldoAtual;
    private double debito;
    private double credito;

    private double media;

    public int getClienteNumb() {
        return clienteNumb;
    }

    public void setClienteNumb(int contaCliente) {
        this.clienteNumb = contaCliente;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public double getMedia(){
        return media;
    }
    public void calcularSaldo() {
        media = (saldoAtual - debito + credito);

        if (media <= 0){
            System.out.println("saldo negativo");
        } else if (media > 0) {
            System.out.println("Saldo positivo");
        }
    }
    public double calcular2(){
        media =(saldoAtual - debito + credito);
        return media;
    }
}

