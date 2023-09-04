package Classes;

public enum Dieta {
    CARNIVORO("Carnivoro"), HERBIVORO("Herbivoro"), ONIVORO("Onivoro"),
    PSCIVORO("Pscivoro");
    private final String stringDieta;
    //----------------------------------------------------------------------------------------------------------------//
    Dieta(String stringDieta){
        this.stringDieta = stringDieta;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public String getStringDieta() {
        return stringDieta;
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Dieta{" +
                "stringDieta = " + stringDieta +
                '}';
    }
}
