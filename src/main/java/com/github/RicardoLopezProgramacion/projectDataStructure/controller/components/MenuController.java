package com.github.RicardoLopezProgramacion.projectDataStructure.controller.components;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MenuController {

    @FXML
    private ToggleButton btMenu;

    @FXML
    private AnchorPane menuPane;
    @FXML
    private BorderPane mainPane ;

    @FXML
    void menu(ActionEvent event) {

        transitionMenu(menuPane.getTranslateX());

        if (menuPane.getTranslateX() != 0) {
            // Si el menú está oculto, mostrarlo
            transitionMenu(0);
        } else {
            // Si el menú está visible, ocultarlo
            transitionMenu(-150);
        }

    }


    private void transitionMenu(double targetX) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.5), menuPane);
        transition.setToX(targetX);

        transition.setOnFinished(event -> {
            // Ajustar la posición del menú después de la transición
            menuPane.setTranslateX(targetX);
        });

        transition.play();
    }

}
