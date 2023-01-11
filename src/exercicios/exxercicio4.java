package exercicios;

import java.util.Scanner;


public class exxercicio4  {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

System.out.println("Digite seu peso: ");

        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
       double altura = scanner.nextDouble();
       double imc = peso / (altura * altura);

       imc = simples(imc);



        System.out.println(imc);


}
static double simples (double imc){

    if (imc < 18.5) {
        System.out.println("Sua Classificação é de Magreza");
    }else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println("Sua Classificação Está Dentro do Normal");
    } else if (imc >= 25.0 && imc <= 29.9) {
        System.out.println("Sua Classificação é de Sobrepeso I");
    }
    else if (imc >= 30.0 && imc <= 39.9) {
    }
    else if (imc >= 40.0 ) {
        System.out.println("Sua Classificação é Obesidade Grave III");

    }
     return imc;
}

}