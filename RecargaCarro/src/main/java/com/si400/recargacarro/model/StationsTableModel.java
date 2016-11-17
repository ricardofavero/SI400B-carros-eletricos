package com.si400.recargacarro.model;

import javax.swing.table.AbstractTableModel;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class StationsTableModel extends AbstractTableModel {

        private Stations data;
        private final String[] columns = {"Station Name", "Opening Hours", "Address", "Phone", "Note", "Distance"};

        public StationsTableModel(Stations data){
            this.data = data;
        }

        @Override
        public int getRowCount() {
            return data.getStations().size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

            @Override
        public String getColumnName(int num){
            return this.columns[num];
        }

        @Override
        public Object getValueAt(int r, int c) {
            switch(c){
                case 0: return data.getStations().get(r).getName();
                case 1: return data.getStations().get(r).getOpening();
                case 2: return data.getStations().get(r).getAddress();
                case 3: return data.getStations().get(r).getPhone();
                case 4: return data.getStations().get(r).getNote();
                case 5: 
                    if(data.getStations().get(r).getTmp_distance() < 1)
                     return "< 1 mile";
                 else if(data.getStations().get(r).getTmp_distance() == 1)
                     return "1 mile";
                 else
                    return data.getStations().get(r).getTmp_distance() + " miles";

            }   
            return null;
        }
        
    }