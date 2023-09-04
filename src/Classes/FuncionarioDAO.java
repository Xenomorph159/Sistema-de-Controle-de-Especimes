package Classes;

import java.util.HashMap;
import java.util.Objects;

public class FuncionarioDAO implements DAO {
    
    private static FuncionarioDAO fdao;
    
    public static FuncionarioDAO getInstance() {
        if (fdao == null) {
            fdao = new FuncionarioDAO();
        }
        return fdao;   
    }
    
    private FuncionarioDAO(){
        
    }
    
    HashMap<Integer, Funcionario> funcionarios = new HashMap();
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean adicionar(int cod, Object objeto) {
        Objects.requireNonNull(cod, "Código do funcionário não pode ser nulo");
        Objects.requireNonNull(objeto, "Funcionário não pode ser nulo");
        if (!this.funcionarios.containsKey(cod) && objeto instanceof Funcionario) {
            this.funcionarios.put(cod, (Funcionario) objeto);
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(int cod) {
        Objects.requireNonNull(cod, "Código do funcionário não pode ser nulo");
        if (this.funcionarios.containsKey(cod)) {
            this.funcionarios.remove(cod);
            return false;
        }
        return false;
    }

    @Override
    public String pesquisar(int cod) {
        Objects.requireNonNull(cod, "Código do funcionário não pode ser nulo");
        if (this.funcionarios.containsKey(cod)) {
            return this.funcionarios.get(cod).toString();
        }
        return null;
    }

    @Override
    public Object listar() {
        String lista = "";
        for (int i = 1; i <= this.funcionarios.size(); i++) {
            lista += this.funcionarios.get(i).toString() + "\n";
        }
        return lista;
    }
    
    public String getSenha(int cod){
        return this.funcionarios.get(cod).getSenha();
    }
    
    public void trocaSenha(int cod, String senha){
        this.funcionarios.get(cod).setSenha(senha);
    }
}
