package TabuadaOAB;

import java.util.Scanner;

public class TabuadaPrinc {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        //criaçao do objeto tab
        // toda vez que voce quiser usar uma classe, voce é obrigado a criar um objeto

        tabuadaOrient tab = new tabuadaOrient();
        //chamadas dos metodos da classe, todos publicos
      tab.entradaDados();
      tab.calcularTabuada();

    }
}
