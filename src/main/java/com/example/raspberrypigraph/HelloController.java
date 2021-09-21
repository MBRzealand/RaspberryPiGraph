package com.example.raspberrypigraph;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

public class HelloController {
    int countX;
    int countY;

    @FXML
    private LineChart<Number, Number> temp_graph;

    @FXML
    private Button StartButton;

    @FXML
    void startGraph(ActionEvent event) throws InterruptedException {

        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();

        for (int i = 0; i < 1000; i++) {
            countY += 1;
            countX += 10;
            series1.getData().add(new XYChart.Data<>(countX, countY));
            temp_graph.getData().add(series1);
            Thread.sleep(500);
        }



    }






}
