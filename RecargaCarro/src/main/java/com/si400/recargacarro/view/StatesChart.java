package com.si400.recargacarro.view;

import com.si400.recargacarro.model.State;
import com.si400.recargacarro.model.StateList;
import com.si400.recargacarro.model.Stations;
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

public class StatesChart extends Chart{

    public BarChart<String, Number> getChart(Stations stations) {
        Map<String, Long> results = new TreeMap<String, Long>();

        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc
                = new BarChart<String, Number>(xAxis, yAxis);
        
        // setting chart properties
        bc.setTitle("Number of Stations by State");
        xAxis.setLabel("State");
        xAxis.setTickLabelRotation(90);
        yAxis.setLabel("Stations");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2016");

        // getting results
        for (State state : StateList.getStatesList()) {

            long count = stations.getStations().stream()
                    .filter(c -> state.getAbv().equals(c.getAddress().getState()))
                    .count();

            results.put(state.getName(), count);
        }
        
        // sorting results
        Map<String, Long> sortedResults = new TreeMap<String, Long>();
        sortedResults = sortByValue(results);

        // adding results to chart
        for (Entry<String, Long> entry : sortedResults.entrySet()) {
            String key = entry.getKey();
            long value = entry.getValue();

            series1.getData().add(new XYChart.Data(key + " (" + value + ")", value));
        }

        bc.getData().addAll(series1);
        return bc;
    }

}
