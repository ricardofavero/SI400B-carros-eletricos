/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Acer
 */
public class User {
    private String name;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    float getDistanceToStation(Station s){
        //return location.getGoogleDistanceTo(s.getLocation());
        return Location.getDistance(location, s.getLocation());
    }
    
    Stations getStationsCloserThan(Stations StationsList, int max_distance){
        Stations ResultStations = new Stations();
        
        for(Station s : StationsList.getStations()){
            if(this.getDistanceToStation(s) < max_distance){
                ResultStations.addStation(s);
            }
        }
        return ResultStations;
    }

}