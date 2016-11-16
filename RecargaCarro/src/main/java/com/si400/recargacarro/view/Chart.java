package com.si400.recargacarro.view;

import com.si400.recargacarro.model.Station;
import com.si400.recargacarro.model.Stations;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class Chart {

    public static HashSet<String> listCities(Stations stations) {
        HashSet<String> hset = new HashSet<String>();
        for (Station station : stations.getStations()) {
            hset.add(station.getAddress().getCity());
        }
        return hset;
    }

    public static Map sortByValue(Map unsortedMap) {
        Map sortedMap = new TreeMap(new ValueComparator(unsortedMap));
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }
}
