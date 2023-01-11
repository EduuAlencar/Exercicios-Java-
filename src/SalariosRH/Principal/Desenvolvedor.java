package SalariosRH.Principal;

import java.util.Scanner;

public class Desenvolvedor extends pessoas {

    Scanner caner = new Scanner(System.in);
    private double horas;
    private int tempo = 255;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


    public void calculaDEV() {


        double media = (horas * tempo);


        System.out.println("seu salario é " + media);
        if (media <= 2000) {
            System.out.println("Seu salario esta ruim ");

        } else {
            System.out.println(" Seu salario é bom !");
        }

    }
}



