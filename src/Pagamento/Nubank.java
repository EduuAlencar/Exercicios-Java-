package Pagamento;

public class Nubank implements Operadora{

    @Override
    public boolean autorizar(Autorizaçao autorizaçao, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") &&
               autorizaçao.getValorCompra()<500;
    }
}
