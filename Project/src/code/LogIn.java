package code;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LogIn {

    @FXML
    Button btnCancel;
    @FXML
    Button btnLogIn;
    @FXML
    TextField textPass;
    @FXML
    TextField textLogin;
    @FXML
    CheckBox checkOrg;

    // Событие нажатия на кнопку Cancel
    public void buttonCancelClick(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    // Событие нажатия на кнопку Log in
    public void buttonLogInClick(MouseEvent mouseEvent) {

        String logIn = textLogin.getText();
        String pass = textPass.getText();

        // Запрос к базе данных
        // требуется проверить наличие логина и пароля в базе
        // Желательно вернуть ответ в boolean

        if (false) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Данные не верны");
            alert.showAndWait();
        }
    }
}
