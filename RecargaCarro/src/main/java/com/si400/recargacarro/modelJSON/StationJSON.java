/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro.modelJSON;

/**
 *
 * @author Acer
 */
public class StationJSON {
    private String station_name;
    private String station_phone;
    private String street_address;
    private String city;
    private String state;
    private String access_days_time;
    private String intersection_directions;
    private String zip;
    private String latitude;
    private String longitude;
    
    
    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public String getStation_phone() {
        return station_phone;
    }

    public void setStation_phone(String station_phone) {
        this.station_phone = station_phone;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
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

    public String getAccess_days_time() {
        return access_days_time;
    }

    public void setAccess_days_time(String access_days_time) {
        this.access_days_time = access_days_time;
    }

    public String getIntersection_directions() {
        return intersection_directions;
    }

    public void setIntersection_directions(String intersection_directions) {
        this.intersection_directions = intersection_directions;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    

    
    //public String toString() {
    //    return "Posto{" + "nome=" + station_name + ", tel=" + station_phone + " endereco= " + street_address + ", " + city + " - " + state + " funcionamento= " + access_days_time + '}';
    //}
}