package code;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PersonalArea extends mainPage{

    @FXML
    Label name;

    @FXML
    Label phone;

    @FXML
    Label eMail;

    @FXML
    Button exit;

    // Событие нажатия на кнопку Выход
    public void buttonExitClick(MouseEvent mouseEvent) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
    }
}
