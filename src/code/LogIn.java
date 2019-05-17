package code;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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

    private String alert = "Пароль или логин не верны";

    // Пароль, логин
    private String login = "user";
    private String pass = "1";

    public static user type_user = user.NULL;

    // Событие нажатия на кнопку Cancel
    public void buttonCancelClick(MouseEvent mouseEvent) {
        type_user = user.NULL;
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }

    // Событие нажатия на кнопку Log in
    public void buttonLogInClick(MouseEvent mouseEvent) {

        String login = textLogin.getText();
        String pass = textPass.getText();

        // Запрос к базе данных
        // требуется проверить наличие логина и пароля в базе
        // Желательно вернуть ответ в виде
        // NULL - такого пользователя нет
        // USER - обычный пользователь
        // ORGANIZATION - организация, покупающая пиццы
        // PIZZA_MAKER - производитель пиццы

        // Заглушка вместо запроса ////////////////////////////////
        if (login.equals("user") && pass.equals("1")) {

            type_user = user.USER;
        } else
            if (login.equals("org") && pass.equals("1")) {

            type_user = user.ORGANIZATION;
        } else
            if (login.equals("maker") && pass.equals("1")) {
            type_user = user.PIZZA_MAKER;
        } else {
            type_user = user.NULL;
        }
        ///////////////////////////////////////////////////////////

        // Проверка пользователя
        if (type_user != user.NULL) {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(this.alert);
            alert.showAndWait();
        }
    }
}
