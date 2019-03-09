package code;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class signUp {
    @FXML
    public Button btnSingUp;
    @FXML
    public Button btnCancel;
    @FXML
    public CheckBox checkOrg;
    @FXML
    public TextField textName;
    @FXML
    public TextField textPhone;
    @FXML
    public TextField textEmail;
    @FXML
    public TextField textPass;
    @FXML
    public TextField textRePass;

    // Событие нажатия на кнопку Sign Up
    public void buttonSignUpClick(MouseEvent mouseEvent) throws Exception {
        if (textPass.getText().equals(textRePass.getText())){

            // Обращение к базе данных
            // Требуется записать поля в базу данных
            //

            Stage stage = (Stage) btnSingUp.getScene().getWindow();
            stage.close();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Passwords is not equal");
            alert.showAndWait();
        }
    }

    // Событие нажатия на кнопку Cancel
    public void buttonCancelClick(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
}
