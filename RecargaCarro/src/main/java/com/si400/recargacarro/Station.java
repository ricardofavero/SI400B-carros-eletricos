/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;

/**
 *
 * @author Acer
 */
public class Station {
    private String name;
    private String phone;
    private Address address;
    private String opening;
    private String note;
    private Location location;

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
        String response = "null";
        response = "\n"+ name + "\n"
                 + "Opening hours: " + opening + "\n"
                 + "Phone: " + phone + "\n"
                 + "Address: " + address + "\n";
        if (note != null)
            response = response + "Note: " + note + "\n";
        return response;
    }
    

    
}
