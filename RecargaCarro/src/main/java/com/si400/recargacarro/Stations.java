/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Stations {
    Collection<Station> stations;
    
    public Stations() {
        stations = new ArrayList<>();
    }
    
        private InputStream stream = null;
    
    void addStation(Station s){
        stations.add(s);
    }
    Collection<Station> getStations(){
        return stations;
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
                
                Address address = new Address();
                address.setCity(sjson.getCity());
                address.setState(sjson.getState());
                address.setStreet(sjson.getStreet_address());
                address.setZip(sjson.getZip());
                
                Location location = new Location();
                location.setLatitude(Double.parseDouble(sjson.getLatitude()));
                location.setLongitude(Double.parseDouble(sjson.getLongitude()));
                
                Station station = new Station();
                station.setAddress(address);
                station.setLocation(location);
                station.setName(sjson.getStation_name());
                station.setNote(sjson.getIntersection_directions());
                station.setOpening(sjson.getAccess_days_time());
                station.setPhone(sjson.getStation_phone());
                
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
