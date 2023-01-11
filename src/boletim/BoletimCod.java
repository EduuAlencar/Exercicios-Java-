package boletim;

import java.util.Scanner;

public class BoletimCod {
    Scanner scanner = new Scanner(System.in);

    String aluno = "nome";
    double nota1;
    double nota2;
    double nota3;



    public void calcularMedia() {


        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A sua media final foi " + media);
        if (media >= 7) {

            System.out.println("voce esta aprovado !!");
        } else if (media < 6.0) {

            System.out.println("voce esta reprovado ;(");

        } else if (media <= 6.99 && media >= 6) {
            System.out.println("Voce esta de recuperação");

        }

    }
    public void entra() {
        boolean continuar;

        do {
            continuar = false;

            try {
                System.out.println("Bem vindo ao sistema de notas \n");
                System.out.println("__________________");
                System.out.println("Qual o seu nome?\n");
                aluno = scanner.nextLine();
                continuar = true;

                for (int i = 0; i < aluno.length(); i++) {
                    char letra = aluno.charAt(i);
                    if (letra == '0' || letra == '1' || letra == '2' || letra == '3' || letra == '4' || letra == '5'
                            || letra == '6' || letra == '7' || letra == '8' || letra == '9'|| letra == ';') {
                        System.out.println("__________________");
                        System.out.println("numero sao invalidos");
                        System.out.println("__________________");

                        continuar = false;
                        i=aluno.length();
                    }
                }

            } catch (Exception e) {
                System.out.println("numeros sao invalidos");
            }
        } while (! continuar);



        System.out.println("__________________");
        System.out.println("Digite a sua primeira nota  : \n");
        nota1 = scanner.nextDouble();




        System.out.println("__________________");
        System.out.println("Digite o seu segunda nota :  ");
        nota2 = scanner.nextDouble();
        System.out.println("__________________");
        System.out.println("Digite a sua terceira nota : ");
        nota3 = scanner.nextDouble();
        System.out.println("__________________");


    }
}
