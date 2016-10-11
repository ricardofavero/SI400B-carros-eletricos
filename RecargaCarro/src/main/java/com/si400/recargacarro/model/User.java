/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro.model;

/**
 *
 * @ AUTOR: RICARDO GUIOTTO FAVERO
 */
public class User {
    private String name;
    private Location location;

    public User(String name, Location location) {
        this.name = name;
        this.location = location;
    }

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
        //return Location.getGoogleDistance(location, s.getLocation());
        return Location.getDistance(location, s.getLocation());
    }
    
    public Stations getStationsInRadius(Stations StationsList, int max_distance){
        Stations ResultStations = new Stations();
        
        for(Station s : StationsList.getStations()){
            if(this.getDistanceToStation(s) <= max_distance){
                ResultStations.addStation(s);
            }
        }
        return ResultStations;
    }

}