package SalariosRH.Principal;

import java.util.Scanner;

public class gerente  extends pessoas{

Scanner dicaner = new Scanner(System.in);
    private double salario;
    private double horas;
    private int    dias;

    public double getSalario()  {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void calculaG(){


        double media = (salario * dias * horas);


        System.out.println("seu salario é "+ media);
        if (media <= 2000){
            System.out.println("Salario abaixo da media ");

        }else {
            System.out.println("voce é rico !");
        }

    }



}
