package Caixa;

import Pagamento.Autorizaçao;
import impressao.Imprimivel;

public class Compra  implements Imprimivel, Autorizaçao {
    //alem dos dados de compra do produto,devemos implememtar
    //os metodos das duas INTERFACES

    private double valorCompra;
    private  String produto;
    private  String NomeCliente;

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoNF() {
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoNF() {
      return this.produto + " = " + this.getValorCompra();
    }
}
