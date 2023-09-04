package Classes;

public enum Tipo {
    CERCADO("Cercado"), LAGOA("Lagoa"), AVIARIO("Aviario");
    private final String stringTipo;
    //----------------------------------------------------------------------------------------------------------------//
    Tipo(String stringTipo){
        this.stringTipo = stringTipo;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public String getStringTipo() {
        return stringTipo;
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Tipo{" +
                "stringTipo = " + stringTipo +
                '}';
    }
}
