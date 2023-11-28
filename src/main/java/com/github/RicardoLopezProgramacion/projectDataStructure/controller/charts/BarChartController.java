package com.github.RicardoLopezProgramacion.projectDataStructure.controller.charts;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BarChartController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;
    @FXML
    private AnchorPane barChartPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        XYChart.Series<String, Integer> series = new XYChart.Series();
        series.setName("2003");
        series.getData().add(new XYChart.Data("Austria",5000));
        series.getData().add(new XYChart.Data("Brazil",4200));
        series.getData().add(new XYChart.Data("France",7500));
        barChart.getData().add(series);

    }


   /* private BarChart buildBarChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Most Popular Programming Language");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("# of developers x 1000");

        BarChart barChart = new BarChart(xAxis, yAxis);
        barChart.set

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Popular programming languages rated by GitHub");

        dataSeries1.getData().add(new XYChart.Data("JavaScript", 2300));
        dataSeries1.getData().add(new XYChart.Data("Python", 1000));
        dataSeries1.getData().add(new XYChart.Data("Java", 986));
        dataSeries1.getData().add(new XYChart.Data("Ruby", 870));
        dataSeries1.getData().add(new XYChart.Data("C++", 413));
        dataSeries1.getData().add(new XYChart.Data("C#", 326));
        barChart.getData().add(dataSeries1);

        return barChart;
    }*/


}
