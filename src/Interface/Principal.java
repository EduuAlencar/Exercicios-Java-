/* INTERFACE
* se trata de um contrato que grandes aplicaçoes fazem para que o programador sigao padrão do projeto definido no inicio
* do desenvolvimento.
*
* 1- > Declarar a classe com a palavra inteface
* 2 - > So pode conter as assinaturas dos metodos,sem corpo
* 3 - > Nao ser instanciada
* 4 -> A classe que implementa a interface deve implementar todos os seus metodos
* 5 -> Uma classe pode implementar MAIS DE UMA INTERFACE
*
* EXEMPLO :
* public class ContaCorrente extends Conta = herança
* public class ContaCorrente implements COnta,usuario = Inteface
 */


package Interface;

public class Principal {



    public void calcularSalarioFuncionario(Funcionario funcionario){
        if (funcionario instanceof Gerente){

        } else if (funcionario instanceof  Administrador){
        }

        else {
            System.out.println("A classe nao implementa a interfaceDAD");
        }


        Funcionario func01 = new Funcionario();
        Gerente Ger01 = new Gerente();
        String nome = "Eduardo";

        public void calcularSalarioFuncionario(){

        }

        if (func01 instanceof interfaceDAD){
            func01.salvar(nome);
            System.out.println(nome);
        }
        else {
            System.out.println("A classe nao implementa a interfaceDAD,nenhum procedimento foi executado");
        }
    }

}
