/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

/**
 *
 * @author Acer
 */
public class RecargaCarro {
 
        public static void main(String[] args) {
        // TODO code application logic here
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyADksjnARGqM5wEDAxdy0ykMe3D0zSAHJE");
        GeocodingResult[] results;
        try{
            results = GeocodingApi.geocode(context, "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
            System.out.println(results[0].formattedAddress);
            System.out.println(results[0].geometry.location.lat);
            System.out.println(results[0].geometry.location.lng);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
