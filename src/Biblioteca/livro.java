//CLASSE ABSTRATA : uma classe do Java que nao pode ser instanciada,ou
//seja, nao é possivel gerar objetos dela. A ideia é que sejam gerados apenas objeto d

package  Biblioteca;

import java.util.Scanner;

public abstract class livro {
    Scanner input = new Scanner(System.in);

    public String nome;
    public  String  autor;


// void
    public void entradaDados(){
        System.out.println("Informe o nome do livro : ");
        nome = input.nextLine();
        System.out.println("Informe o autor do livro : ");
        autor = input.nextLine();
    }

    public void imprimeDados(){
        System.out.println("Livro : " + nome);
        System.out.println("Autor : " + autor);
    }

}
