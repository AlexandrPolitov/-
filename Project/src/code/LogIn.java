package code;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LogIn extends mainPage{

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

    // Пароль, логин
    private String pass = "admin";
    private String login = "admin";
    private boolean org = false;
    private boolean check = false;
    private String alert = "Пароль или логин не верны";

    // Событие нажатия на кнопку Cancel
    public void buttonCancelClick(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    // Событие нажатия на кнопку Log in
    public void buttonLogInClick(MouseEvent mouseEvent) {

        String login = textLogin.getText();
        String pass = textPass.getText();
        boolean org = checkOrg.isSelected();

        // Запрос к базе данных
        // требуется проверить наличие логина и пароля в базе
        // Желательно вернуть ответ в boolean

        if (login.equals(this.login) && pass.equals(this.pass) && org == this.org) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
            super.check = true;
            super.btnLog.setVisible(false);
            super.btnReg.setVisible(false);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(this.alert);
            alert.showAndWait();
        }
    }
}
