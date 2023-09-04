package Classes;

import java.util.HashMap;
import java.util.Objects;

public class PaddockDAO implements DAO {
   
    private static PaddockDAO pdao;
    
    public static PaddockDAO getInstance() {
        if (pdao == null) {
            pdao = new PaddockDAO();
        }
        return pdao;   
    }
    
    private PaddockDAO(){
        
    }
    
    HashMap<Integer, Paddock> paddocks = new HashMap();
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public boolean adicionar(int cod, Object objeto) {
        Objects.requireNonNull(cod, "Código do paddock não pode ser nulo");
        Objects.requireNonNull(objeto, "Paddock não pode ser nulo");
        if(!this.paddocks.containsKey(cod) && objeto instanceof Paddock){
            this.paddocks.put(cod, (Paddock) objeto);
            return true;
        }
        return false;
    }

    @Override
    public boolean remover(int cod) {
        Objects.requireNonNull(cod, "Código do paddock não pode ser nulo");
        if(this.paddocks.containsKey(cod)){
            this.paddocks.remove(cod);
            return true;
        }
            return false;
    }

    @Override
    public String pesquisar(int cod) {
        Objects.requireNonNull(cod, "Código do paddock não pode ser nulo");
        if(this.paddocks.containsKey(cod)){
            return this.paddocks.get(cod).toString();
        }
        return null;
    }

    @Override
    public Object listar() {
        String lista = "";
        for(int i = 1; i <= this.paddocks.size(); i++){
            lista += this.paddocks.get(i).toString();
        }
        return lista;
    }
    
    public void AddEspecime(int codEspecime, int codPaddock){
        this.paddocks.get(codPaddock).addEspecime(EspecimeDAO.getInstance().especimes.get(codEspecime));
    }
    
    public void retiraEspecime(int codEspecime, int codPaddock){
        this.paddocks.get(codPaddock).retiraEspecime(EspecimeDAO.getInstance().especimes.get(codEspecime));
    }
}
