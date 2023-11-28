package com.github.RicardoLopezProgramacion.projectDataStructure.controller;

import com.github.RicardoLopezProgramacion.projectDataStructure.controller.client.DashboardController;
import com.github.RicardoLopezProgramacion.projectDataStructure.controller.login_register.LoginController;
import com.github.RicardoLopezProgramacion.projectDataStructure.utilities.Paths;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.swing.border.Border;
import java.io.IOException;

public class MainView {

    @FXML
    private Button btExit;

    @FXML
    void exit(ActionEvent event) {
        Stage primaryStage = (Stage) btExit.getScene().getWindow();
        primaryStage.close();
    }
    private static MainView instance;

    public static MainView getInstance() {
        if (instance == null) {
            instance = new MainView();
        }
        return instance;
    }

    @FXML
    private BorderPane mainPane ;

    // Cambia el modificador de acceso a public
    public MainView() {
        instance = this;
    }

    void loadPane(String nextView, String backview) {

        try {
            FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(Paths.MENU));
            AnchorPane menuPane = menuLoader.load();
            mainPane.setLeft(menuPane);

            FXMLLoader nextPaneLoader = new FXMLLoader(getClass().getResource(nextView));
            AnchorPane nextPane = nextPaneLoader.load();
            FXMLLoader backPaneLoader = new FXMLLoader(getClass().getResource(backview));
            AnchorPane  backPane = backPaneLoader.load();
            transitionViews(backPane, nextPane);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadDashboard() {
      loadPane(Paths.DASHBOARD, Paths.LOGIN);
    }

    public void loadUniversityExpenses() {
       loadPane(Paths.UNIVERSITYEXPENSES, Paths.DASHBOARD);
    }

    private void transitionViews(AnchorPane fromView, AnchorPane toView) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.2), fromView);
        transition.setByX(-mainPane.getWidth()); // Desplazar hacia la izquierda

        transition.setOnFinished(event -> {
            // Eliminar la vista anterior del lugar correcto
            mainPane.setCenter(null);
            // Agregar la nueva vista al contenedor principal en el lugar correcto
            mainPane.setCenter(toView);
            toView.setTranslateX(mainPane.getWidth()); // Restablecer la posición X para la nueva vista

            TranslateTransition newTransition = new TranslateTransition(Duration.seconds(0.2), toView);
            newTransition.setByX(-mainPane.getWidth());
            newTransition.play();
        });

        transition.play();
    }


}
