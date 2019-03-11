package code;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

public class mainPage {

    public Label User;

    public void buttonLogInClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("LogIn.fxml"));
//        -fx-background-radius: 6;
//        -fx-background-color: rgb(200, 200, 200), rgb(200, 200, 200);
//        -fx-background-insets: 0, 0 1 1 0;
        Stage dialogStage = new Stage();
        dialogStage.setTitle("");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root, 160, 140));
        //dialogStage.initStyle(StageStyle.TRANSPARENT);
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

    public void basketClicked(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("В процессе разработки)))");
        alert.showAndWait();
    }

    public void ConctactsClick(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("В процессе разработки)))");
        alert.showAndWait();
    }

    public void AddClick(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("В процессе разработки)))");
        alert.showAndWait();
    }
}
