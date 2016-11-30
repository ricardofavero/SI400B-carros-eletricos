package com.si400.recargacarro.view;

import com.si400.recargacarro.model.State;
import com.si400.recargacarro.model.StateList;
import com.si400.recargacarro.model.Stations;
import java.util.Arrays;
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

public class RegionsChart {

    static final List<String> northeast = Arrays.asList("Connecticut", "Maine", "Massachusetts", "New Hampshire", "Rhode Island", "Vermont", "New Jersey", "New York", "Pennsylvania");
    static final List<String> midwest = Arrays.asList("Illinois", "Indiana", "Michigan", "Ohio", "Wisconsin", "Iowa", "Kansas", "Minnesota", "Missouri", "Nebraska", "North Dakota", "South Dakota");
    static final List<String> south = Arrays.asList("Delaware", "Florida", "Georgia", "Maryland", "North Carolina", "South Carolina", "Virginia", "District Of Columbia", "West Virginia", "Alabama", "Kentucky", "Mississippi", "Tennessee", "Arkansas", "Louisiana", "Oklahoma", "Texas");
    static final List<String> west = Arrays.asList("Arizona", "Colorado", "Idaho", "Montana", "Nevada", "New Mexico", "Utah", "Wyoming", "Alaska", "California", "Hawaii", "Oregon", "Washington");
    Map<String, List<String>> regions = new HashMap<>();

    public BarChart<Number, String> getChart(Stations stations) {
        regions.put(Names.get("northeast"), northeast);
        regions.put(Names.get("midwest"), midwest);
        regions.put(Names.get("south"), south);
        regions.put(Names.get("west"), west);
        Map<String, Long> stationsByState = new TreeMap<String, Long>();
        Map<String, Long> results = new TreeMap<String, Long>();
        long count = 0;

        final NumberAxis xAxis = new NumberAxis();
        final CategoryAxis yAxis = new CategoryAxis();
        final BarChart<Number, String> bc
                = new BarChart<Number, String>(xAxis, yAxis);
        
        // setting chart properties
        bc.setTitle(Names.get("chart3"));
        xAxis.setLabel(Names.get("chart_stations"));
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel(Names.get("chart_region"));
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2016");

        // getting number of stations by state
        for (State state : StateList.getStatesList()) {

            long count2 = stations.getStations().stream()
                    .filter(c -> state.getAbv().equals(c.getAddress().getState()))
                    .count();

            stationsByState.put(state.getName(), count2);
        }

        // getting results
        for (Map.Entry<String, List<String>> region : regions.entrySet()) {
            count = 0;
            for (Map.Entry<String, Long> stationsState : stationsByState.entrySet()) {
                String key = stationsState.getKey();
                Long value = stationsState.getValue();

                if (region.getValue().contains(key)) {
                    count = count + value;
                }

            }
            results.put(region.getKey(), count);
        }
        
        // sorting results
        Map<String, Long> sortedResults = new TreeMap<String, Long>();
        sortedResults = ChartTools.sortByValueInverted(results);


        // adding results to chart
        for (Entry<String, Long> entry : sortedResults.entrySet()) {
            String key = entry.getKey();
            long value = entry.getValue();

            series1.getData().add(new XYChart.Data(value, key + " (" + value + ")"));
        }

        bc.getData().addAll(series1);
        return bc;
    }

}
