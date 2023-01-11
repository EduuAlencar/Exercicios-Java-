package Caixa;

import Pagamento.Cartao;
import Pagamento.Operadora;
import impressao.Impressora;

public class Chekaut {
    //Finalizar a compra apos ela ser autorizada pelo cartão
    // Ela via ter


    private Operadora operadora;
    private Impressora impressora;

    public Chekaut(Operadora operadora, Impressora impressorta) {
        this.operadora = operadora;
        this.impressora = impressorta;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Impressora getImpressorta() {
        return impressora;
    }

    public void setImpressorta(Impressora impressorta) {
        this.impressora = impressorta;
    }

    //Para fechar a compra eu preciso receber uma compra e um cartão
    // alem de verificar se ela esta autorizado ou nao

    public void FecharCompra(Compra compra, Cartao cartao) {
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado) {
            this.impressora.imprimir(compra);


        } else {
            System.out.println("Compra nao autorizada");
        }

    }
}

//Se autorizado,eu posso imprimir um deocumento imprimivel
//(alguem que segue o contrato!)Como compra tem implementação
//da inteface imprimivel,eu tbm posso passar compra como documento imprimivel