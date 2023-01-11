package exercicios;

import java.util.Scanner;

// tabuada
public class exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numerodigitado;
        int multiplicar = 0;
        int total = 0;


        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numerodigitado = ler.nextInt();

      total = funcao(numerodigitado);



    }
   static int funcao (int numerodigitado){

       int multiplicar = 0;
       int total= 0;

       for (int x = 0; x < 10; x++) {
           total = numerodigitado * ++multiplicar;
           System.out.println(numerodigitado + " x " + multiplicar + " = " + total);
       }

  return total;
   }
}

