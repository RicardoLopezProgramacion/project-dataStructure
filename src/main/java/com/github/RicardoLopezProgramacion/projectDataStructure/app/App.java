package com.github.RicardoLopezProgramacion.projectDataStructure.app;

import com.github.RicardoLopezProgramacion.projectDataStructure.utilities.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UNDECORATED);
        AnchorPane load = FXMLLoader.load(getClass().getResource(Paths.LOGIN));
        Scene loginScene = new Scene(load);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
