package Biblioteca;

import java.util.Scanner;

public class acervo extends livro{
    Scanner input = new Scanner(System.in);
    public int quantidade;
    public String editora;

    public void entradaDados(){

        super.entradaDados();
        System.out.println("Digite a quantidade de livros ");
        quantidade = input.nextInt();

        System.out.println("Informe a editora : ");
        editora = input.nextLine();
    }

    //SOBRESCRITA
    //Sobrescrita é a sobrepoisiçao de metodos com assinatura
    //e nomes iguais,mas em classes diferentes, sendo
    // herdados da classe mae
    // A assinatura é identica ao metodo sobrescrito na classe mãe
    public void imprimeDados(){

        super.imprimeDados();
        System.out.println("Quantidade : " + quantidade);
        System.out.println("Editora : " + editora);
    }

}
