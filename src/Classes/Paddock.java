package Classes;

import java.util.ArrayList;
import java.util.Objects;

public class Paddock {
    private final int cod;
    private ArrayList<Especime> especimes;
    private final Tipo tipo;
    //----------------------------------------------------------------------------------------------------------------//
    public Paddock(int cod, Tipo tipo) {
        Objects.requireNonNull(tipo, "Tipo do paddock não pode ser nulo");
        if (cod <= 0) {
            throw new IllegalArgumentException("Código do paddock não pode ser menor ou igual a zero");
        }

        this.cod = cod;
        this.especimes = new ArrayList<>();
        this.tipo = tipo;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public int getCod() {
        return this.cod;
    }

    public ArrayList<Especime> getEspecimes() {
        return this.especimes;
    }

    public Tipo getTipo() {
        return this.tipo;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public Boolean addEspecime(Especime especime){

        if(this.especimes.contains(especime)){
            return false;
        }

        if (!especime.getEspecie().getTipo().equals(this.tipo)) {
            return false;
        }
        return this.especimes.add(especime);
    }

    public boolean retiraEspecime(Especime especime){
        Objects.requireNonNull(especime, "O especime a ser removido do paddock nao pode ser nulo");

        if(!this.especimes.contains(especime)){
            return false;
        }
        return this.especimes.remove(especime);
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        String especimes = "";
        for(int i = 0; i < this.especimes.size(); i++){
            especimes += this.especimes.get(i).getCod() + ", ";
        }

        return "Paddock{" +
                "cod = " + cod +
                ", especimes = " + especimes +
                ", tipo = " + tipo.getStringTipo() +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paddock paddock)) return false;
        return cod == paddock.cod && Objects.equals(especimes, paddock.especimes) && tipo == paddock.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, especimes, tipo);
    }
}