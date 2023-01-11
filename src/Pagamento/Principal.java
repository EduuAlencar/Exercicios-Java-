package Pagamento;

import Caixa.Chekaut;
import Caixa.Compra;
import impressao.HP;
import impressao.Impressora;

public class Principal {
    public static void main (String[]args){

        //Para testar : precisamos instanciar uma operadora, uma impressora,
        // um cartão do cliente, uma compra, e finalmente instanciar um checkout


        Operadora operadora = new Nubank();
        Impressora impressora = new HP();
        Cartao cartao = new Cartao();
        cartao.setNomeDoCliente("Eduardo Alencar");
        cartao.setNumeroCartao("1234.5555.5555.5555");
        Compra compra = new Compra();
        compra.setNomeCliente("DuDu Alenkar");
        compra.setProduto("PC gamer");
        compra.setValorCompra(200.233);

        //Finalizando a compra do produto


        Chekaut chekaut = new Chekaut(operadora, impressora);
        chekaut.FecharCompra(compra,cartao);


    }
}
