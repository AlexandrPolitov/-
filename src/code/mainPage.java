package code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class mainPage {

    public enum user{
        NULL,
        USER,
        ORGANIZATION,
        PIZZA_MAKER,
    }

    @FXML
    public Button btnLog;
    @FXML
    public Button btnReg;
    @FXML
    public ImageView basket;
    @FXML
    public ImageView addPizza;
    @FXML
    public ImageView logoPizzaMaker;
    @FXML
    public Label userName;

    public user type_user = user.NULL;

    private void changeInterface (user User) {
        switch (User) {
            case NULL:
                break;

            case USER:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                userName.setVisible(true);
                break;

            case PIZZA_MAKER:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                basket.setVisible(false);
                addPizza.setVisible(true);
                logoPizzaMaker.setVisible(true);
                break;

            case ORGANIZATION:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                logoPizzaMaker.setVisible(true);
                break;
        }
    }

    // Окно входа
    public void buttonLogInClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("LogIn.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();

        type_user = LogIn.type_user;
        changeInterface(type_user);
    }

    public void buttonSignUpClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("signUp.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();

        type_user = signUp.type_user;
        changeInterface(type_user);
    }

    public void basketClicked(MouseEvent mouseEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("basket.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Корзина");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.show();
    }

    public void personalAreaClick (MouseEvent mouseEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("personalArea.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Личный кабинет");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();
    }

    public void MouseClick(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Это наша Команда))");
        alert.setHeaderText("Вееерба Дмитрий\nКочетков Дмитрий\nТравин Михаил\nСотникова Анна\nМатвеев Артём\nБедриков Артём\nПолитов Александр");
        alert.showAndWait();
    }

    public void ContactsClick(MouseEvent mouseEvent) {

        /////////////////////////
        btnLog.setVisible(true);
        btnReg.setVisible(true);
        basket.setVisible(true);
        userName.setVisible(false);
        addPizza.setVisible(false);
        logoPizzaMaker.setVisible(false);
        /////////////////////////

    }

    public void AddClick(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("В процессе разработки)))");
        alert.showAndWait();
    }

    public void PromotionsClick(MouseEvent mouseEvent) {
//        Basket.setPrice(1000);
    }

    public void AddPizzaClick(MouseEvent mouseEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("addPizza.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.setTitle("");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();
    }
}