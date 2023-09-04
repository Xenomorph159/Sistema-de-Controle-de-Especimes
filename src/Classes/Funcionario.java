package Classes;

import java.util.Objects;

public class Funcionario {
    private final int cod;
    private String senha;
    //----------------------------------------------------------------------------------------------------------------//
    public Funcionario(int cod, String senha){
        Objects.requireNonNull(senha, "Senha do Funcionario nao pode ser nula");
        if(cod <= 0){
            throw new IllegalArgumentException("Codigo do funcionario nao pode ser menor ou igual a zero");
        }
        if(senha.equals("")){
            throw new IllegalArgumentException("Senha do funcionario nao pode estar vazia");
        }

        this.cod = cod;
        this.senha = senha;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public int getCod() {
        return cod;
    }

    public String getSenha() {
        return senha;
    }
    //----------------------------------------------------------------------------------------------------------------//
    public void setSenha(String senha){
        this.senha = senha;
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Override
    public String toString() {
        return "Funcionario{" +
                "cod = " + cod +
                ", senha = " + senha +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return cod == that.cod && Objects.equals(senha, that.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, senha);
    }
}