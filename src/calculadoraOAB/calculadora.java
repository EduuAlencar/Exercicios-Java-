package calculadoraOAB;

import java.util.Scanner;

public class calculadora {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        String operacao = "";

        String repetir = "sim";

        public void minhasoma() {
            if (operacao.equals("-")) {
                System.out.println("o resultado da sub" + (numero1 - numero2));
            } else if (operacao.equals("+")) {
                System.out.println("o resultado é " + (numero1 + numero2));

            } else if (operacao.equals("*")) {
                System.out.println("o resultado é " + (numero1 * numero2));


            }



            }



        public void entrada() {

            System.out.println("qual a operaçao");
            operacao = scanner.nextLine();

            System.out.println("qual o primeiro numero ? ");
            numero1 = scanner.nextInt();

            System.out.println("Qual o segundo numero ? ");
            numero2 = scanner.nextInt();








        }


    }

