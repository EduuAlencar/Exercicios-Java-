package SalariosRH.Principal;
import java.util.Scanner;
public class Principal_RH {
    public static void main(String[]args){
        Scanner dicaner = new Scanner(System.in);
        Scanner cani = new Scanner(System.in);
        Scanner can = new Scanner(System.in);
      pessoas pe = new pessoas();

        gerente ge1 = new gerente();

        System.out.println("---- OLA GERENTE ----");

        System.out.println("Qual o seu nome ? ");
        pe.setNome(dicaner.nextLine());

        System.out.println("Qual o seu telefone ?");
        pe.setTelefone(dicaner.nextInt());

        System.out.println("Qual o seu salario ? ");
        ge1.setSalario(dicaner.nextDouble());

        System.out.println("Quantas horas voce trabalhou por dia ? ");
       ge1.setHoras(dicaner.nextDouble());

        System.out.println("Quantos dias voce trabalhou no mes ? ");
        ge1.setDias(dicaner.nextInt());
        System.out.println(pe.toString());
       ge1.calculaG();
       //chamando a classe DEV desenvolvedor
        Desenvolvedor de2 = new Desenvolvedor();

        System.out.println("\n---- OII DESENVOLVEDOR  ----");

        System.out.println("Ola Desenvolvedor qual é o seu nome ? ");
        pe.setNome(cani.next());

        System.out.println("Quantas  horas voce trabalhou  ?");
        de2.setHoras(cani.nextDouble());

        System.out.println("Quantos dias voce trabalhou no mes ? ");
        de2.setTempo(cani.nextInt());

        System.out.println(pe.toString());
       de2.calculaDEV();

       //chamando a classe EMpregado
        empregado em3 = new empregado();
        System.out.println("\n++++ OLA EMPREGADO ++++");
        System.out.println("Qual o seu salario ?");
        em3.setSalario(cani.nextDouble());
        em3.SalarioEM();



    }
}
