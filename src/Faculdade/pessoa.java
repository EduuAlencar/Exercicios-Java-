package Faculdade;

public abstract class pessoa {
   private  String nomeAluno;
   private  String matricula;

    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public void sla(String nomeAluno, String matricula){

    }

    public double sla(){
        System.out.println("fim do programa");
        return 0;
    }
}
