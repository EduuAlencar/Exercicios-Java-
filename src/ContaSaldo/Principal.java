package ContaSaldo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner caner = new Scanner(System.in);
        Conta ed = new Conta();
        System.out.println("Digite o numero da sua conta ");
        ed.setClienteNumb(caner.nextInt());

        System.out.println("numero recebido : "+ed.getClienteNumb());

        System.out.println("Digite o seu saldo");
        ed.setSaldoAtual(caner.nextInt());

        System.out.println("Digite o seu credito");
        ed.setCredito(caner.nextInt());

        System.out.println("Digite o seu debido");
        ed.setDebito(caner.nextInt());

        System.out.println("seu saldo atual é " + ed.calcular2());
        ed.calcularSaldo();








    }
    }
