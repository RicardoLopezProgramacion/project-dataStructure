package com.github.RicardoLopezProgramacion.projectDataStructure.controller;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;

public class LoginController {

    @FXML
    private AnchorPane loginPanel;

    @FXML
    private Button btExit;

    @FXML
    void exit(ActionEvent event) {
        Stage primaryStage = (Stage) btExit.getScene().getWindow();
        primaryStage.close();
    }

}
