package SalariosRH.Principal;

import java.util.Scanner;

public class empregado extends pessoas{
Scanner cani = new Scanner(System.in);
    private double salario;



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void SalarioEM (){



        if (salario < 2000){

            System.out.println("Seu salario é "+salario+" || Salario mediano");
        } if (salario > 4000){
            System.out.println("Seu salario é "+salario+" || Salario abaixo da media");
        }
    }

}
