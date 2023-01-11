package Faculdade;

public class alunoUNIVILLE extends pessoa {

    private double prova1;
    private double prova2;
    private double prova3;

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getProva3() {
        return prova3;
    }

    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }

    @Override
    public String toString() {
        return "alunoUNIVILLE{" +
                "prova1=" + prova1 +
                ", prova2=" + prova2 +
                ", prova3=" + prova3 +
                '}';
    }
    public void sla(String nomeAluno, String matricula){

    }
    public double calcMedia(){

        super.sla();


        double media = (prova1 +  (prova2 * 2) + (prova3 *3))/6;


        return 0;
    }


}
