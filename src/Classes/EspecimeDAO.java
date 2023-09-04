package Classes;

import java.util.HashMap;
import java.util.Objects;

public class EspecimeDAO implements DAO{
    
    private static EspecimeDAO edao;
    
    public static EspecimeDAO getInstance() {
        if (edao == null) {
            edao = new EspecimeDAO();
        }
        return edao;   
    }
    
    private EspecimeDAO(){
        
    }
    
    HashMap<Integer, Especime> especimes = new HashMap();
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean adicionar(int cod, Object objeto) {
        Objects.requireNonNull(cod, "Código do espécime não pode ser nulo");
        Objects.requireNonNull(objeto, "Espécime não pode ser nulo");
        if(!this.especimes.containsKey(cod) && objeto instanceof Especime){
            this.especimes.put(cod, (Especime) objeto);
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(int cod) {
        Objects.requireNonNull(cod, "Código do espécime não pode ser nulo");
        if(this.especimes.containsKey(cod)){
            this.especimes.remove(cod);
            return true;
        }
        return false;
    }

    @Override
    public String pesquisar(int cod) {
        Objects.requireNonNull(cod, "Código do espécime não pode ser nulo");
        if(this.especimes.containsKey(cod)) {
            return this.especimes.get(cod).toString();
        }
            return null;
    }

    @Override
    public Object listar() {
        String lista = "";
        for(int i = 1; i <= this.especimes.size(); i++){
            lista += this.especimes.get(i).toString() + "\n";
        }
        return lista;
    }
    
    public void atualizaEstagio(int cod, Especime.Estagio estagio){
        Objects.requireNonNull(cod, "Código do espécime não pode ser nulo");
        Objects.requireNonNull(estagio, "Estágio do espécime não pode ser nulo");
        this.especimes.get(cod).setEstagio(estagio);
    }
}
