package com.si400.recargacarro.view;

import com.si400.recargacarro.model.Address;
import com.si400.recargacarro.model.Location;
import com.si400.recargacarro.model.Stations;
import com.si400.recargacarro.model.StationsTableModel;
import com.si400.recargacarro.model.User;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class MainFrame extends javax.swing.JFrame {

    User u = new User();
    Stations allStations = new Stations();
    
    static String[] states = new String[]{
        "", "Alabama", "Alaska", "Arizona", "Arkansas", "California",
        "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
        "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
        "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
        "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana",
        "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
        "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma",
        "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota",
        "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
        "Wisconsin", "Wyoming"
    };

    /**
     * Creates new form JFrame
     */
    public MainFrame() {
        //Locale default_language = Locale.getDefault();
        //Names.setLanguage(default_language.toString());
        Names.setLanguage("en_US");
        initComponents();
        Stations x = new Stations();
        showDataOnTable(x);
        allStations.readStream();
        
        

        setTitle(Names.get("program_name"));

        jTabbedPane.setTitleAt(0, Names.get("tab1"));
        jTabbedPane.setTitleAt(1, Names.get("tab2"));
/*
        zip_label.setText(Names.get("zip") + ":");
        street_label.setText(Names.get("street") + ":");
        city_label.setText(Names.get("city") + ":");
        state_label.setText(Names.get("state") + ":");
        radius_label.setText(Names.get("radius") + ":");
        searchButton.setText(Names.get("search_button"));
        orLabel.setText(Names.get("or"));
*/
       
        
        /*
        // TEST: creating list of stations
        Stations test = new Stations();
        test.readStream();
        //System.out.println(test);

        // TEST: getting coordinates from address
        Address a = new Address(
        "3241 S Wabash Ave",
        "Chicago",
        "IL",
        "60616"
        );
        Location l1 = a.getGoogleLocation();
        //System.out.println(l1);
        
        // TEST: getting distance between coordinates
        Location l2 = new Location();
        l2.setLatitude(29.7545795);
        l2.setLongitude(-95.3724258);
        //System.out.println("Distance in meters (google): " + l2.getGoogleDistanceTo(l1));
        //System.out.println("Distance in meters: " + Location.getDistance(l1, l2));
        
        User u = new User("Ricardo", l1);
        int radius = 50; // in miles
        Stations result = u.getStationsInRadius(test, radius); 
        System.out.println("\nFound " + result.getStations().size() + " stations in a " + radius/1000 + " km radius from " + a + "\n");
        System.out.println(result);
        
        //jTableResults.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
        //jTableResults.setSize(500, 500);
        //jTableResults.setRowHeight(30);
        //jTableResults.getColumnModel().getColumn(2).setMinWidth(6);
         apresentarDadosNaTabelav2(result);
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelSearch = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResults = new javax.swing.JTable();
        radiusSlider = new javax.swing.JSlider();
        street_label = new javax.swing.JLabel();
        radius_label = new javax.swing.JLabel();
        radiusLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        streetField = new javax.swing.JTextField();
        city_label = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        state_label = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox<>();
        zip_label = new javax.swing.JLabel();
        zipField = new javax.swing.JTextField();
        enter_data = new javax.swing.JLabel();
        jPanelCharts = new javax.swing.JPanel();
        chart1Button = new javax.swing.JButton();
        chart2Button = new javax.swing.JButton();
        chart3Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
        setResizable(false);

        jTableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableResults);

        radiusSlider.setMaximum(50);
        radiusSlider.setMinimum(1);
        radiusSlider.setValue(25);
        radiusSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radiusSliderStateChanged(evt);
            }
        });

        street_label.setText(Names.get("street") + ":");

        radius_label.setText(Names.get("radius") + ":");

        radiusLabel.setText(radiusSlider.getValue() + " " + (Names.get("mile") + "s"));

        searchButton.setText(Names.get("search_button"));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        streetField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                streetFieldKeyTyped(evt);
            }
        });

        city_label.setText(Names.get("city") + ":");

        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldKeyTyped(evt);
            }
        });

        state_label.setText(Names.get("state") + ":");

        stateComboBox.setModel(new DefaultComboBoxModel(states));
        stateComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stateComboBoxItemStateChanged(evt);
            }
        });

        zip_label.setText(Names.get("zip") + ":");

        zipField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zipFieldKeyTyped(evt);
            }
        });

        enter_data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enter_data.setText(Names.get("enter_data"));

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(zip_label)
                        .addGap(18, 18, 18)
                        .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(state_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(street_label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(enter_data)
                    .addComponent(searchButton)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(radius_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radiusSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radiusLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(enter_data)
                .addGap(18, 18, 18)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street_label)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zip_label)
                    .addComponent(zipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_label)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_label)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radius_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiusSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radiusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(searchButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab(Names.get("tab1"), jPanelSearch);

        chart1Button.setText(Names.get("chart1"));
        chart1Button.setToolTipText("");
        chart1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chart1ButtonActionPerformed(evt);
            }
        });

        chart2Button.setText(Names.get("chart2"));
        chart2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chart2ButtonActionPerformed(evt);
            }
        });

        chart3Button.setText(Names.get("chart3"));
        chart3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chart3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChartsLayout = new javax.swing.GroupLayout(jPanelCharts);
        jPanelCharts.setLayout(jPanelChartsLayout);
        jPanelChartsLayout.setHorizontalGroup(
            jPanelChartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChartsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanelChartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(chart3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chart1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chart2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPanelChartsLayout.setVerticalGroup(
            jPanelChartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChartsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(chart1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chart2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chart3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane.addTab(Names.get("tab2"), null, jPanelCharts, "");

        jLabel1.setText(Names.get("about1"));

        jLabel2.setText(Names.get("about2"));

        jLabel3.setText((Names.get("authors")+":"));

        jLabel4.setText("Ricardo Favero       157161");

        jLabel5.setText("Fernanda Gravena     159702");

        jLabel6.setText("Isadora Fonseca      155815");

        jLabel7.setText("Marcela Magossi      156521");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText(Names.get("program_name"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(1039, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jTabbedPane.addTab(Names.get("tab3"), jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane)
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Search for Stations");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zipFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zipFieldKeyTyped
        // TODO add your handling code here:
        streetField.setText("");
        cityField.setText("");
        stateComboBox.setSelectedItem("");
    }//GEN-LAST:event_zipFieldKeyTyped

    private void stateComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stateComboBoxItemStateChanged
        // TODO add your handling code here:
        zipField.setText("");
    }//GEN-LAST:event_stateComboBoxItemStateChanged

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyTyped
        // TODO add your handling code here:
        zipField.setText("");
    }//GEN-LAST:event_cityFieldKeyTyped

    private void streetFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streetFieldKeyTyped
        // TODO add your handling code here:
        zipField.setText("");
    }//GEN-LAST:event_streetFieldKeyTyped

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (!zipField.getText().equals("") || !streetField.getText().equals("") && !cityField.getText().equals("") && !stateComboBox.getSelectedItem().equals("")) {
            Address a = new Address(streetField.getText(), cityField.getText(), stateComboBox.getSelectedItem().toString(), zipField.getText());
            Location l = a.getGoogleLocation();
            u.setLocation(l);
            Stations result = u.getStationsInRadius(allStations, radiusSlider.getValue());
            showDataOnTable(result);
            if(result.getStations().isEmpty()){
                showMessageDialog(null, Names.get("msg_location_not_found"));
            }
        } else if (zipField.getText().equals("")) {
            if (streetField.getText().equals("") && cityField.getText().equals("") && stateComboBox.getSelectedItem().equals("")) {
                showMessageDialog(null, Names.get("msg_address_or_zip"));
            } else if (streetField.getText().equals("")) {
                showMessageDialog(null, Names.get("msg_street"));
            } else if ((cityField.getText().equals(""))) {
                showMessageDialog(null, Names.get("msg_city"));
            } else if (stateComboBox.getSelectedItem().equals("")) {
                showMessageDialog(null, Names.get("msg_state"));
            } 
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void radiusSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radiusSliderStateChanged
        radiusLabel.setText(radiusSlider.getValue() + " " + (Names.get("mile") + "s"));
        
    }//GEN-LAST:event_radiusSliderStateChanged

    private void chart1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chart1ButtonActionPerformed
        JFrame frame = new JFrame(Names.get("chart1"));
        frame.setSize(1300, 800);

        final JFXPanel fxPanelB = new JFXPanel();
        frame.add(fxPanelB);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                StatesChart linesample = new StatesChart();
                BarChart<String, Number> chart = linesample.getChart(allStations);

                Scene scene = new Scene(chart, 800, 600);
                fxPanelB.setScene(scene);

                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_chart1ButtonActionPerformed

    private void chart2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chart2ButtonActionPerformed
        JFrame frame = new JFrame(Names.get("chart2"));
        frame.setSize(1300, 800);

        final JFXPanel fxPanelB = new JFXPanel();
        frame.add(fxPanelB);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                CitiesChart linesample = new CitiesChart();
                BarChart<Number, String> chart = linesample.getChart(allStations);

                Scene scene = new Scene(chart, 800, 600);
                fxPanelB.setScene(scene);

                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_chart2ButtonActionPerformed

    private void chart3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chart3ButtonActionPerformed
        JFrame frame = new JFrame(Names.get("chart3"));
        frame.setSize(1300, 800);

        final JFXPanel fxPanelB = new JFXPanel();
        frame.add(fxPanelB);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                RegionsChart linesample = new RegionsChart();
                BarChart<Number, String> chart = linesample.getChart(allStations);

                Scene scene = new Scene(chart, 800, 600);
                fxPanelB.setScene(scene);

                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_chart3ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MainFrame().setVisible(true);

            }
        });
    }

    private void showDataOnTable(Stations list) {
        this.jTableResults.setModel(new StationsTableModel(list));
        jTableResults.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTableResults.getColumnModel().getColumn(5).setPreferredWidth(20);
        //this.jTableResults.setco
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chart1Button;
    private javax.swing.JButton chart2Button;
    private javax.swing.JButton chart3Button;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel enter_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCharts;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTableResults;
    private javax.swing.JLabel radiusLabel;
    private javax.swing.JSlider radiusSlider;
    private javax.swing.JLabel radius_label;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel state_label;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel street_label;
    private javax.swing.JTextField zipField;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
