/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro.model;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

/**
 *
 * @ AUTOR: RICARDO GUIOTTO FAVERO
 */


public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
/*   Address()

    Localizacao getCoord(Address e){
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
    }*/

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    public Location getGoogleLocation(){
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyADksjnARGqM5wEDAxdy0ykMe3D0zSAHJE");
        GeocodingResult[] results;
        Location response = new Location();
        try{
            results = GeocodingApi.geocode(context, this.toString()).await();
            
            response.setLatitude(results[0].geometry.location.lat);
            response.setLongitude(results[0].geometry.location.lng);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return response;
    }
    
    @Override
    public String toString() {
        String response = "null";
        response = street + " - " + city + ", " + state + " " + zip;
        return response;
    }
    
}