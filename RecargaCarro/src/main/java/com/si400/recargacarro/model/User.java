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

public class User {
    private Location location;

    public User() {
    }
    
    public User(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    int getDistanceToStation(Station s){
        //return Location.getGoogleDistance(location, s.getLocation());
        return Location.getDistanceInMiles(location, s.getLocation());
    }
    
    public Stations getStationsInRadius(Stations StationsList, int max_distance){
        Stations ResultStations = new Stations();
        
        for(Station s : StationsList.getStations()){
            if(this.getDistanceToStation(s) <= max_distance){
                s.setTmp_distance(this.getDistanceToStation(s));
                ResultStations.addStation(s);
            }
        }
        ResultStations.sortByDistance();
        return ResultStations;
    }

}