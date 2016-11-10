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
public class Station implements Comparable<Station>{
    private String name;
    private String phone;
    private Address address;
    private String opening;
    private String note;
    private Location location;
    private int tmp_distance;
 

    public Station(String name, String phone, Address address, String opening, String note, Location location) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.opening = opening;
        this.note = note;
        this.location = location;
        this.tmp_distance = 0;
    }
    
    public int compareTo(Station s) {
        //if (this.tmp_distance < s.tmp_distance)
        //    return -1;
        //else return 1;
        return Integer.compare(this.tmp_distance, s.tmp_distance);
    }

    public int getTmp_distance() {
        return tmp_distance;
    }

    public void setTmp_distance(int tmp_distance) {
        this.tmp_distance = tmp_distance;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
    @Override
    public String toString() {
        String response = new String();
        response = "\n"+ name + "\n"
                 + "Opening hours: " + opening + "\n"
                 + "Address: " + address + "\n"
                 + "Phone: " + phone + "\n";
        if (note != null)
            response = response + "Note: " + note + "\n";
        return response;
    }
    

    
}
