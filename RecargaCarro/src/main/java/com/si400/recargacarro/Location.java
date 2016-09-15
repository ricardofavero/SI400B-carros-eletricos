/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro;
import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.DistanceMatrix;

/**
 *
 * @author Acer
 */
public class Location {
    private double latitude;
    private double longitude;
    private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyADksjnARGqM5wEDAxdy0ykMe3D0zSAHJE");

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    long getGoogleDistanceTo(Location l2){
        
        try {
            DistanceMatrix distanceMatrix=DistanceMatrixApi.newRequest(context).origins(latitude + ", " + longitude).destinations(l2.toString()).await();
            if (distanceMatrix.rows.length == 0 || distanceMatrix.rows[0].elements.length == 0)     throw new RuntimeException("No distance and duration found.");
            //return new RouteDistanceDuration(distanceMatrix.rows[0].elements[0].distance.inMeters,distanceMatrix.rows[0].elements[0].duration.inSeconds);
            return distanceMatrix.rows[0].elements[0].distance.inMeters;
          }
         catch (  Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
          }
    }
    
    public static float getDistance(Location l1, Location l2) {
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(l2.latitude-l1.latitude);
        double dLng = Math.toRadians(l2.longitude-l1.longitude);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(l1.latitude)) * Math.cos(Math.toRadians(l2.latitude)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        float dist = (float) (earthRadius * c);

        return dist;
    }
    
    @Override
    public String toString() {
        String response = "null";
        response = latitude + ", " + longitude;
        return response;
    }
    
}
