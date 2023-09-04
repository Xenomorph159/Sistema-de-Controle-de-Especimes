package Interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 */
public class ADM {
    private String NAME;
    private String SENHA;
    
    public ADM(String NAME, String SENHA){
        this.NAME = NAME;
        this.SENHA = SENHA;
    } 
    
    public String getNAME() {
        return NAME;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }
    
    
    
}
