package TabuadaOAB;//ORIENTAÇÃO A OBJETOS
//SURGIU DA NECESSIDADE DE SE CONSTRUIR PROGRAMAS MAIS COMPLEXOS
// COM MENOS LINHA DE CODIGO, UTILIZANDO DO MUNDO REAL


// Pessoas : nome,endereço,telefone,bairro, cidade, cpf
//Aluno : turma, serie, turno
// funcionarios: matricula,dataEntrada, horario

// CLASSES : é o modelo base onde são definidas as caracteristicas e
//propriedades da mesma.
//CARACTERISTICAS = funções
//
import java.util.Scanner;
public class tabuadaOrient {



        Scanner ler = new Scanner(System.in);

        int numero;

        int op;

        int resultado;

        public void calcularTabuada() {
            for (op = 1; op <= 10; op++) {
                resultado = numero * op;
                System.out.println("numero" + "X" + op + "=" + resultado);

            }
        }

        public void entradaDados(){
            System.out.println("digite um numero ");
            numero = ler.nextInt();
            ler.close();
        }



    }

