package com.si400.recargacarro.model;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class State {
    private String abv;
    private String name;

    public State(String abv, String name) {
        this.abv = abv;
        this.name = name;
    }
    
    
    
    public String getAbv() {
        return abv;
    }

    public void setAbv(String abv) {
        this.abv = abv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
