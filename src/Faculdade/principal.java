package Faculdade;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            treino Edu = new treino();


          /* Edu.name = "Eduardo Alencar";
            Edu.disciplina = "Matematica";


            Edu.n1 = 10;
            Edu.n1 = 8.6;
            Edu.n1 = 6.6;
            Edu.n1 = 9.6;
            Edu.n1 = 4.6;*/

        Edu.setName("Eduardo Alencar");
        Edu.setDisciplina("matematica");
        Edu.setN1(6.7);
        Edu.setN2(9.7);
        Edu.setN3(4.5);
        Edu.setN4(7.7);


        //entrada de dados via SET, pelo Scanner, ou seja, usuario

        System.out.println("Digite o nome do aluno ");
        Edu.setName(input.nextLine());

        // saida de dados vai GET,usando o SOUT.

            Edu.calcularMedia2();
        System.out.println(" A media do eduardo é " + Edu.calcularMedia2());


    }
}



