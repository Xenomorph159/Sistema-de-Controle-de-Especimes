package Classes;

public interface DAO {
    public boolean adicionar(int cod, Object objeto);
    public boolean remover(int cod);
    public String pesquisar(int cod);
    public Object listar();
    
}
