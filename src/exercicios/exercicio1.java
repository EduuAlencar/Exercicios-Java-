package exercicios;

import java.util.Scanner;
//mes

public class exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int mes = 2;
        int dias = 0;
        int ano = 2022;
        boolean  continuar;

        do {
            continuar = false;
            try {
                Scanner ler = new Scanner(System.in);
                System.out.printf("digite o numero do mes");
                mes = ler.nextInt();
               if (mes < 1 || mes >12 ){
                    continuar = false;
               }else {
                    continuar = true;
              }
            }catch (Exception e){

            }
        }while (!continuar);

        do {
            continuar = false;
           try {
               Scanner lw = new Scanner(System.in);
                System.out.printf("Digite o ano que voce esta");
                ano = lw.nextInt();
                if (ano < 0 ){
                    continuar = false;
                }else {
                    continuar = true;
                }
            }catch (Exception e){

            }
        }while (!continuar);




        switch (mes){
            case 1: case 3:  case 5:
            case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if ((ano % 4 == 0 ) && !(ano % 100 ==0) || (ano % 400 ==0))
                    dias = 29;
                else
                    dias = 28;

                break;

            default:
                System.out.println("Esse mes nao existe!! ");
                break;


        }
        System.out.println("numero de dias : " + dias);

    }


}
