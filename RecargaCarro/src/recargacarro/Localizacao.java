/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recargacarro;

/**
 *
 * @author Acer
 */
public class Localizacao {
    private double latitude;
    private double longitude;
    
    Localizacao(double lat, double lon){
        latitude = lat;
        longitude = lon;
    }
    
    int getDistancia(Localizacao l1, Localizacao l2){
        return 0;
    }
}
