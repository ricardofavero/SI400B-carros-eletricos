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
public class User {
    private String name;

    private Location localizacao;
    
    
    
    Location getLocation(){
        Location tmp = new Location();
        return tmp;
    }
    int getDistanciaPosto(StationJSON p){
        return 0;
    }

}