package Pagamento;

public class Cartao {
    // Aqui,essa classe trata das informaçoes basicas do cartao do cliente
    //que debe, ser repassadas para as interfaces
    //A inteface Operadora é quem vai dizer se a compra desse cartao é valida ou nao

    private String nomeDoCliente;
    private String numeroCartao;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
