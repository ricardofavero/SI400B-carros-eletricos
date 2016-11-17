package com.si400.recargacarro.model;

import com.si400.recargacarro.modelJSON.StationJSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class Stations {
    //Collection<Station> stations;
    List<Station> stations = new ArrayList();
    
    public Stations() {
        stations = new ArrayList<>();
    }
    
        private InputStream stream = null;
    
    public void addStation(Station s){
        stations.add(s);
    }
    public List<Station> getStations(){
        return stations;
    }
    
    public void SortByDistance(){
        Collections.sort(stations);
    }
        
        public void readStream() {
        try {
            
            stream  = new FileInputStream("dados3.json");
            JsonReader reader = new JsonReader(new InputStreamReader(stream, "UTF-8"));
            Gson gson = new GsonBuilder().create();

            // Read file in stream mode
            reader.beginArray();
            while (reader.hasNext()) {
                StationJSON sjson = gson.fromJson(reader, StationJSON.class);
                
                Address address = new Address(
                sjson.getStreet_address(),
                sjson.getCity(),
                sjson.getState(),
                sjson.getZip()
                );
                
                Location location = new Location(
                Double.parseDouble(sjson.getLatitude()),
                Double.parseDouble(sjson.getLongitude())
                );
                
                Station station = new Station(
                sjson.getStation_name(),
                sjson.getStation_phone(),
                address,
                sjson.getAccess_days_time(),
                sjson.getIntersection_directions(),
                location
                );
                
                stations.add(station);
               // if (person.getId() == 0 ) {
                    //System.out.println("Stream mode: " + posto);
                    
            }
            reader.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Stations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Stations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

        
            @Override
    public String toString() {
        String response = new String();
        if (stations != null) {
            for (Station station : stations) {
                response = response
                         + "-----------------------------"
                         + station;
                        
            }
        }
        return response;
    }
}
