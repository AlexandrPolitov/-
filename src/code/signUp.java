package code;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class signUp extends mainPage{
    @FXML
    public Button btnSingUp;
    @FXML
    public Button btnCancel;
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
    @FXML
    public ChoiceBox choiceUser;

    public static user type_user = user.NULL;

    // Событие нажатия на кнопку Sign Up
    public void buttonSignUpClick(MouseEvent mouseEvent) throws Exception {

        switch ((String) choiceUser.getValue()) {
            case "Покупатель":
                type_user = user.USER;
                break;
            case "Организация":
                type_user = user.ORGANIZATION;
                break;
            case "Производитель":
                type_user = user.PIZZA_MAKER;
                break;
            default:
                type_user = user.NULL;
        }

        if (textPass.getText().equals(textRePass.getText())){

            String name = textName.getText();
            String phone = textPhone.getText();
            String eMail = textEmail.getText();
            String pass = textPass.getText();
            //Тип пользователя

            // Обращение к базе данных
            // Требуется записать поля в базу данных

            Stage stage = (Stage) btnSingUp.getScene().getWindow();
            stage.close();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Пароли не идентичны");
            alert.showAndWait();
        }
    }

    // Событие нажатия на кнопку Cancel
    public void buttonCancelClick(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();
    }
}
