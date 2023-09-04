package Classes;

import java.time.LocalDate;
import java.util.Objects;

public class Especime {
    public enum Estagio {
        BEBE("Bebe"), JOVEM("Jovem"), ADULTO("Adulto");
        private final String stringEstagio;
        //------------------------------------------------------------------------------------------------------------//
        Estagio(String stringEstagio){
            this.stringEstagio = stringEstagio;
        }
        //------------------------------------------------------------------------------------------------------------//
        public String getStringEstagio() {
            return stringEstagio;
        }
        //------------------------------------------------------------------------------------------------------------//
        @Override
        public String toString() {
            return "Estagio{" +
                    "stringEstagio='" + stringEstagio + '\'' +
                    '}';
        }
    }
    public enum Sexo {
        MACHO("Macho"), FEMEA("Femea");
        private final String stringSexo;
        //------------------------------------------------------------------------------------------------------------//
        Sexo(String stringSexo){
            this.stringSexo = stringSexo;
        }
        //------------------------------------------------------------------------------------------------------------//
        public String getStringSexo() {
            return stringSexo;
        }
        //------------------------------------------------------------------------------------------------------------//
        @Override
        public String toString() {
            return "Sexo{" +
                    "stringSexo='" + stringSexo + '\'' +
                    '}';
        }
    }
    //----------------------------------------------------------------------------------------------------------------//
    private final int cod;
    private final Especie especie;
    private final LocalDate dataNascimento;
    private Estagio estagio;
    private final Sexo sexo;
    //----------------------------------------------------------------------------------------------------------------//
    public Especime(int cod, Especie especie, Sexo sexo){
        this.cod = cod;
        this.especie = especie;
        this.sexo = sexo;
        this.dataNascimento = LocalDate.now();
        this.estagio = Estagio.BEBE;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public int getCod(){
        return this.cod;
    }

    public Especie getEspecie(){
        return  this.especie;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public Estagio getEstagio(){
        return this.estagio;
    }

    public Sexo getSexo(){
        return this.sexo;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public void setEstagio(Estagio estagio){
        this.estagio = estagio;
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Especime{" +
                "cod = " + cod +
                ", especie = " + especie.getNomeEspecie() +
                ", dataNascimento = " + dataNascimento +
                ", estagio = " + estagio.getStringEstagio() +
                ", sexo = " + sexo.getStringSexo() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Especime that)) return false;
        return cod == that.cod && especie == that.especie && Objects.equals(dataNascimento, that.dataNascimento) &&
                estagio == that.estagio && sexo == that.sexo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, especie, dataNascimento, estagio, sexo);
    }
}