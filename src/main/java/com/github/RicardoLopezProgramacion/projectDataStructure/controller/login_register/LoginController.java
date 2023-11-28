package com.github.RicardoLopezProgramacion.projectDataStructure.controller.login_register;

        import com.github.RicardoLopezProgramacion.projectDataStructure.controller.MainView;
        import com.github.RicardoLopezProgramacion.projectDataStructure.controller.client.DashboardController;
        import com.github.RicardoLopezProgramacion.projectDataStructure.utilities.Paths;
        import javafx.animation.TranslateTransition;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.layout.AnchorPane;
        import javafx.scene.layout.BorderPane;
        import javafx.stage.Stage;
        import javafx.util.Duration;

public class LoginController {
    @FXML
    private Button btExit;

    @FXML
    private AnchorPane loginPanel;

    @FXML
    void exit(ActionEvent event) {
        Stage primaryStage = (Stage) btExit.getScene().getWindow();
        primaryStage.close();
    }

    @FXML
    void login(ActionEvent event) {
        // Lógica de inicio de sesión, si es exitosa, llamar al método en MainView para cambiar la vista.
        MainView.getInstance().loadDashboard();

    }

    /*  public void areaChart() {
        try {
            FXMLLoader menuLoader = new FXMLLoader(getClass().getResource(Paths.MENU));
            AnchorPane menuPane = menuLoader.load();
            mainPane.setLeft(menuPane);
            FXMLLoader dashLoader = new FXMLLoader(getClass().getResource(Paths.DASHBOARD));
            AnchorPane dashboardPane = dashLoader.load();
            FXMLLoader loginLoader = new FXMLLoader(getClass().getResource(Paths.LOGIN));
            AnchorPane  loginPane = loginLoader.load();
            //mainPane.setCenter(dashboardPane);
            switchToDashboard(loginPane, dashboardPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void switchToDashboard(AnchorPane loginPane, AnchorPane dashboardPane) {
        transitionViews(loginPane, dashboardPane);
    }

    @FXML
    void switchToLogin(AnchorPane loginPane, AnchorPane dashboardPane) {
        transitionViews(dashboardPane, loginPane);
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

*/

}
