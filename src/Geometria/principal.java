/* SOBRECARGA (OVERLOAD)
é a posssibilidade de se reutilizar metodos com o mesmo nome,
mas com "assinaturas" diferentes, dentro da mesma classe
é um das formas de se utilizar o polimorfismo (muitas formas)



 */



package Geometria;

import java.util.Scanner;

public class principal {

    public static void main(String[]args){
        Scanner scaner = new Scanner(System.in);

      geometria g = new geometria();

        System.out.println("Informe o valor do raio");
        double r = scaner.nextDouble();

        System.out.println("Area calculada : " + g.calcular(r));

        System.out.println("Informe os dois lados dos retangulo");
        double a = scaner.nextDouble();
        double b = scaner.nextDouble();

        System.out.println("Area do retangulo : " +g.calcular(a,b));

    }
}
