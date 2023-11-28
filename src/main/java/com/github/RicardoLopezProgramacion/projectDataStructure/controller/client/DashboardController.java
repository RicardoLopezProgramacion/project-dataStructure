package com.github.RicardoLopezProgramacion.projectDataStructure.controller.client;

import com.github.RicardoLopezProgramacion.projectDataStructure.controller.MainView;
import com.github.RicardoLopezProgramacion.projectDataStructure.utilities.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;

public class DashboardController {



    @FXML
    private Button btExit;

    @FXML
    private AnchorPane dashboardPane;

    @FXML
    private BorderPane charts;

    @FXML
    private Label btAreaChart;

    @FXML
    private Label btLineChart;

    @FXML
    private Label btPieChart;

    @FXML
    private Label btBarChart;

    @FXML
    private Label addUniversityExpenses;


    @FXML
    void addUniversityExpenses(MouseEvent event) {
        MainView.getInstance().loadUniversityExpenses();
    }

    @FXML
    void initialize() {

        //dashboardPane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #0000FF, #00FF00);");
        areaChart(null);

    }

    void chooseChart(String string) {
        try {
            charts.setCenter(null);
            FXMLLoader chartLoader = new FXMLLoader(getClass().getResource(string));
            AnchorPane chartPane = chartLoader.load();
            charts.setCenter(chartPane);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void areaChart(MouseEvent event) {
       chooseChart(Paths.AREACHART);
    }

    @FXML
    void lineChart(MouseEvent event) {
      chooseChart(Paths.LINECHART);
    }

    @FXML
    void pieChart(MouseEvent event) {
      chooseChart(Paths.PIECHART);
    }

    @FXML
    void barChart(MouseEvent event) {
        chooseChart(Paths.BARCHART);
    }

    @FXML
    void exit(ActionEvent event) {
        Stage primaryStage = (Stage) btExit.getScene().getWindow();
        primaryStage.close();
    }



    public void initializeDashboard() {
        // Aquí puedes realizar cualquier lógica específica de la vista del tablero
        // por ejemplo, cargar datos, configurar elementos, etc.

    }

}
