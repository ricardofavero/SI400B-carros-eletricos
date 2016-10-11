/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro.main;

import com.si400.recargacarro.model.User;
import com.si400.recargacarro.model.Stations;
import com.si400.recargacarro.model.Location;
import com.si400.recargacarro.model.Address;

/**
 *
 * @ AUTOR: RICARDO GUIOTTO FAVERO
 */
public class EVChargingStations {
 
        public static void main(String[] args) {

        // TEST: creating list of stations
        Stations test = new Stations();
        test.readStream();
        //System.out.println(test);

        // TEST: getting coordinates from address
        Address a = new Address(
        "3241 S Wabash Ave",
        "Chicago",
        "IL",
        "60616"
        );
        Location l1 = a.getGoogleLocation();
        //System.out.println(l1);
        
        // TEST: getting distance between coordinates
        Location l2 = new Location();
        l2.setLatitude(29.7545795);
        l2.setLongitude(-95.3724258);
        //System.out.println("Distance in meters (google): " + l2.getGoogleDistanceTo(l1));
        //System.out.println("Distance in meters: " + Location.getDistance(l1, l2));
        
        User u = new User("Ricardo", l1);
        int radius = 2000; // in meters
        Stations result = u.getStationsInRadius(test, radius); 
        System.out.println("\nFound " + result.getStations().size() + " stations in a " + radius/1000 + " km radius from " + a + "\n");
        System.out.println(result);
        
    }
}
