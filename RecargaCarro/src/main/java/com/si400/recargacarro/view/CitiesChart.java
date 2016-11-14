package com.si400.recargacarro.view;

import com.si400.recargacarro.model.Stations;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class CitiesChart extends Chart {
    
    public BarChart<Number, String> getChart(Stations stations) {
        Map<String, Long> results = new HashMap<String, Long>();

        final NumberAxis xAxis = new NumberAxis();
        final CategoryAxis yAxis = new CategoryAxis();
        final BarChart<Number, String> bc
                = new BarChart<Number, String>(xAxis, yAxis);
        
        // setting chart properties
        bc.setTitle("Top 10 Cities by Number of Stations");
        xAxis.setLabel("Stations");
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel("City");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2016");
        
        // getting results
        for (String city : listCities(stations)) {
            long count = stations.getStations().stream()
                    .filter(c -> city.equals(c.getAddress().getCity()))
                    .count();
            results.put(city, count);
        }

        // sorting results
        Map<String, Long> sortedResults = new TreeMap<String, Long>();
        sortedResults = sortByValue(results);

        // getting first 10 sorted results
        List<Entry<String, Long>> firstTen
                = new ArrayList<Map.Entry<String, Long>>(sortedResults.entrySet())
                .subList(0, 10);
        Collections.reverse(firstTen);

        // adding results to chart
        for (Entry<String, Long> entry : firstTen) {
            String key = entry.getKey();
            long value = entry.getValue();

            series1.getData().add(new XYChart.Data(value, key + " (" + value + ")"));
        }

        bc.getData().addAll(series1);
        return bc;
    }

}
