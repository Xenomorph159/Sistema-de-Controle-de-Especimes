package Classes;

import java.util.Objects;

public enum Especie{
    APATOSSAURO("Apatossauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    BRAQUIOSSAURO("Braquiossauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    COMPSOGNATO("Compsognato", Classes.Dieta.CARNIVORO, Tipo.CERCADO),
    DILOFOSSAURO("Dilofossauro", Classes.Dieta.CARNIVORO, Tipo.CERCADO),
    EDMONTOSSAURO("Edmontossauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    ESTEGOSSAURO("Estegossauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    GALIMIMO("Galimimo", Classes.Dieta.ONIVORO, Tipo.CERCADO),
    MAMENQUISSAURO("Mamenquissauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    MICROCERATOPO("Micriceratopo", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    PAQUICEFALOSSAURO("Paquicefalossauro", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    PARASSAUROLOFO("Parassaurolofo", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    PTERANODONTE("Pteranodonte", Classes.Dieta.PSCIVORO, Tipo.AVIARIO),
    TIRANOSSAURO("Tiranossauro", Classes.Dieta.CARNIVORO, Tipo.CERCADO),
    TRICERATOPO("Triceratopo", Classes.Dieta.HERBIVORO, Tipo.CERCADO),
    VELOCIRAPTOR("Velociraptor", Classes.Dieta.CARNIVORO, Tipo.CERCADO);

    private final String nomeEspecie;
    private final Dieta dieta;
    private final Tipo tipo;
//--------------------------------------------------------------------------------------------------------------------//
    Especie(String nomeEspecie, Dieta dieta, Tipo tipo){
        Objects.requireNonNull(nomeEspecie, "Nome da especie nao pode ser nula");
        Objects.requireNonNull(dieta, "Dieta da especie nao pode ser nula");
        if(nomeEspecie == ""){
            throw new IllegalArgumentException("Nome do especime nao pode star vazio");
        }

        this.nomeEspecie = nomeEspecie;
        this.dieta = dieta;
        this.tipo = tipo;
    }
//--------------------------------------------------------------------------------------------------------------------//
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public Dieta getDieta(){
        return this.dieta;
    }

    public Tipo getTipo(){
        return this.tipo;
    }
//--------------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Especie{" +
                "nomeEspecie = " + nomeEspecie +
                ", dieta = " + dieta.getStringDieta() +
                ", tipo = " + tipo.getStringTipo() +
                '}';
    }
}