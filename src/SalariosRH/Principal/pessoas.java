package SalariosRH.Principal;

public class pessoas {

    private String nome;
    private int telefone;
    private int dataAdmissão;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(int dataAdmissão) {
        this.dataAdmissão = dataAdmissão;

    }

    @Override
    public String toString() {
        return "pessoas{" +
                "nome=" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}





