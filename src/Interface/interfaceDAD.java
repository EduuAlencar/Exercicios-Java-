// Data Access Object -> Banco de Dados (persistencia)


package Interface;

public interface interfaceDAD {

    public void criar (String id);
    public void salvar (String name);
    public void deletar (int id);
    public void atualizar (int id);
}
