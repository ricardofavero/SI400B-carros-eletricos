package com.si400.recargacarro.model;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class Location {
    private double latitude;
    private double longitude;
    static private GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyADksjnARGqM5wEDAxdy0ykMe3D0zSAHJE");

    public Location() {}
    
    public Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

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
    /*
    public static long getGoogleDistance(Location l1, Location l2){
        
        try {
            DistanceMatrix distanceMatrix=DistanceMatrixApi.newRequest(context).origins(l1.toString()).destinations(l2.toString()).await();
            if (distanceMatrix.rows.length == 0 || distanceMatrix.rows[0].elements.length == 0)     throw new RuntimeException("No distance and duration found.");
            //return new RouteDistanceDuration(distanceMatrix.rows[0].elements[0].distance.inMeters,distanceMatrix.rows[0].elements[0].duration.inSeconds);
            return distanceMatrix.rows[0].elements[0].distance.inMeters;
          }
         catch (  Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
          }
    }
    */
    
    //Haversine formula. From http://stackoverflow.com/questions/837872/calculate-distance-in-meters-when-you-know-longitude-and-latitude-in-java
    public static int getDistanceInMiles(Location l1, Location l2) {
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(l2.latitude-l1.latitude);
        double dLng = Math.toRadians(l2.longitude-l1.longitude);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(l1.latitude)) * Math.cos(Math.toRadians(l2.latitude)) *
                   Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        float dist = (float) (earthRadius * c);
        int dist_mi = (int) (dist/1000 * 0.621);

        return dist_mi;
    }
    
    @Override
    public String toString() {
        String response = new String();
        response = latitude + ", " + longitude;
        return response;
    }
    
}
