package com.github.RicardoLopezProgramacion.projectDataStructure.app;

import com.github.RicardoLopezProgramacion.projectDataStructure.model.list.circularDoublyLinkedList.CircularLinkedList;
import com.github.RicardoLopezProgramacion.projectDataStructure.model.user.User;
import com.github.RicardoLopezProgramacion.projectDataStructure.utilities.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        // main
        primaryStage.initStyle(StageStyle.UNDECORATED);
        BorderPane mainPane = FXMLLoader.load(getClass().getResource(Paths.MAINVIEW));

        // center
        AnchorPane loginPane = FXMLLoader.load(getClass().getResource(Paths.LOGIN));
        mainPane.setCenter(loginPane);

        // left
      /*  VBox menuPane = FXMLLoader.load(getClass().getResource(Paths.MENU));
        mainPane.setLeft(menuPane);*/

        // botton
        AnchorPane footerLoader = FXMLLoader.load(getClass().getResource(Paths.FOOTER));
        mainPane.setBottom(footerLoader);

        Scene mainScene = new Scene(mainPane);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
       launch();
    }
}
