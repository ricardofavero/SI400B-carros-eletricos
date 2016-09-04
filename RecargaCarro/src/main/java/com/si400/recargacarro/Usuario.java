/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;

/**
 *
 * @author Acer
 */
public class Usuario {
    private String nome;

    private Localizacao localizacao;
    
    
    
    Localizacao getLocalizacao(){
        Localizacao tmp = new Localizacao(1.0,1.0);
        return tmp;
    }
    int getDistanciaPosto(Posto p){
        return 0;
    }

}