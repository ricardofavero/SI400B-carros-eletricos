/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.io.FileNotFoundException;
/**
 *
 * @author Acer
 */
public class EVChargingStations {
 
        public static void main(String[] args) {

        // TEST: creating list of stations
        Stations test = new Stations();
        test.readStream();
        //System.out.println(test);

        // TEST: getting coordinates from address
        Address a = new Address();
        a.setCity("Chicago");
        a.setState("IL");
        a.setStreet("3241 S Wabash Ave");
        a.setZip("60616");
        Location l1 = a.getGoogleLocation();
        //System.out.println(l1);
        
        // TEST: getting distance between coordinates
        Location l2 = new Location();
        l2.setLatitude(29.7545795);
        l2.setLongitude(-95.3724258);
        //System.out.println("Distance in meters (google): " + l2.getGoogleDistanceTo(l1));
        //System.out.println("Distance in meters: " + Location.getDistance(l1, l2));
        
        User u = new User();
        u.setLocation(l1);
        int radius = 2000; // in meters
        Stations result = u.getStationsCloserThan(test, radius); 
        System.out.println("\nFound " + result.getStations().size() + " stations in a " + radius/1000 + " km radius from " + a + "\n");
        System.out.println(result);
        
    }
}
