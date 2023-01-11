package OAB.maisVelho;

import java.util.Scanner;
public class idades {

    Scanner sc = new Scanner(System.in);

    int[] idades = new int[3];
    int idadeMaisNova = 0;
    String nomeDaPessoaMaisNova = "";
    int idadeMaisVelha = 0;
    String nomeDaPessoaMaisVelha = "";


    public void pessoaMaisVelha() {
        String[] nomes = new String[3];
        int[] idades = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o nome");
            nomes[i] = sc.next();
            System.out.println("digite as idades");
            idades[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (idades[i] < idadeMaisVelha) {
                idadeMaisNova = idades[i];
                nomeDaPessoaMaisNova = nomes[i];
            }
            if (idades[i] > idadeMaisNova) {
                idadeMaisVelha = idades[i];
                nomeDaPessoaMaisVelha = nomes[i];

            }
        }
    }


    public void entra() {
        System.out.println("O nome da pessoa mais nova é " + nomeDaPessoaMaisNova);
        System.out.println("A idade da pessoa mais novas é " + idadeMaisNova);
        System.out.println("O nome da pessoa mais velha é : " + nomeDaPessoaMaisVelha);
        System.out.println("A idade da pessoa mais velha é " + idadeMaisVelha);

    }


}
