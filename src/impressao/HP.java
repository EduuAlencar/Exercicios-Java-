package impressao;

public class HP implements Impressora{


    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("======================");
        System.out.println("Nota Fisica - loja XPTQ");
        System.out.println(imprimivel.getCabecalhoNF());
        System.out.println(imprimivel.getCorpoNF());
        System.out.println("Impresso na HP");

    }
}
