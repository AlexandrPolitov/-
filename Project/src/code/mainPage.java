package code;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class mainPage {

    public Label User;

    public void buttonLogInClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("LogIn.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root, 160, 130));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();

        dialogStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {

                System.out.println("Stage is closing");
            }
        });
    }

    public void buttonSignUpClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("signUp.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root, 160, 220));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();
    }
}
