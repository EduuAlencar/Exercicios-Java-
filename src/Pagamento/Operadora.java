package Pagamento;

public interface Operadora {
    //NAo sei qual é a operacao de cartao. So preciso saber se ela vai autorizar a compra ou nao

    public boolean autorizar (Autorizaçao autorizaçao, Cartao cartao);
}
