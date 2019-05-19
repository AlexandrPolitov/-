package code;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;

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
    @FXML
    public FlowPane list;

    public user type_user = user.NULL;

    public ArrayList<String> listNames = new ArrayList<>();
    public String allPrice = "0";

    private void changeInterface (user User) {
        switch (User) {
            case NULL:
                btnLog.setVisible(true);
                btnReg.setVisible(true);
                basket.setVisible(true);
                userName.setVisible(false);
                addPizza.setVisible(false);
                logoPizzaMaker.setVisible(false);
                break;

            case USER:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                basket.setVisible(true);
                userName.setVisible(true);
                addPizza.setVisible(false);
                logoPizzaMaker.setVisible(false);
                break;

            case PIZZA_MAKER:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                basket.setVisible(false);
                addPizza.setVisible(true);
                userName.setVisible(false);
                logoPizzaMaker.setVisible(true);
                break;

            case ORGANIZATION:
                btnLog.setVisible(false);
                btnReg.setVisible(false);
                basket.setVisible(true);
                logoPizzaMaker.setVisible(true);
                addPizza.setVisible(false);
                logoPizzaMaker.setVisible(false);
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

    // Окно регистрации
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

    // Окно корзины
    public void basketClicked(MouseEvent mouseEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("basket.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.show();
    }

    // Окно личного кабинета
    public void personalAreaClick (MouseEvent mouseEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("personalArea.fxml"));
        Stage dialogStage = new Stage();
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.setScene(new Scene(root));
        dialogStage.setResizable(false);
        dialogStage.showAndWait();
    }

    // Нажатие на лого
    public void MouseClick(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Это наша Команда))");
        alert.setHeaderText("Вееееерба Дмитрий\nКочетков Дмитрий\nТравин Михаил\nСотникова Анна\nМатвеев Артём\nБедриков Артём\nПолитов Александр");
        alert.showAndWait();
    }

    // Контакты
    public void ContactsClick(MouseEvent mouseEvent) {
        type_user = user.NULL;
        changeInterface(type_user);
    }

    // Акции
    public void PromotionsClick(MouseEvent mouseEvent) {
        String name = "";
        for (String str : listNames) {
            name += str + " | ";
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Название: " + name + "\nЦена: " + allPrice + "руб");
        alert.showAndWait();
    }

    // Супер-пупер метод реализующий добавление пицц
    public void pizzaCreate(String image, String name, String price, String description ) {
        Pane item = new Pane();

        ImageView imageView = new ImageView(new Image(image));
        imageView.setFitHeight(200.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(10.0);
        imageView.setLayoutY(10.0);
        item.getChildren().add(imageView);

        Label lname = new Label(name);
        lname.setLayoutX(20.0);
        lname.setLayoutY(210.0);
        lname.setFont(new Font("Arial Bold", 16 ));
        lname.setTextFill(Paint.valueOf("#6c4e49"));
        item.getChildren().add(lname);

        Label lprice = new Label(price + " руб");
        lprice.setLayoutX(120.0);
        lprice.setLayoutY(315.0);
        lprice.setFont(new Font("Arial", 14 ));
        lprice.setTextFill(Paint.valueOf("#6c4e49"));
        item.getChildren().add(lprice);

        Label ldescription = new Label(description);
        ldescription.setLayoutX(20.0);
        ldescription.setLayoutY(230.0);
        ldescription.setFont(new Font("Arial", 14 ));
        ldescription.setTextFill(Paint.valueOf("#6c4e49"));
        item.getChildren().add(ldescription);

        Button btn = new Button("Добавить");
        btn.setStyle("-fx-background-radius: 14; -fx-background-color: rgb(1, 147, 111);");
        btn.setTextFill(Paint.valueOf("#ffffff"));
        btn.setFont(new Font("Arial Bold", 14 ));
        btn.setPrefHeight(30.0);
        btn.setPrefWidth(90.0);
        btn.setLayoutX(20.0);
        btn.setLayoutY(310.0);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int temp = Integer.valueOf(allPrice);
                allPrice = String.valueOf(Integer.valueOf(price)+temp);
                listNames.add(name);

                // Тестовый Alert, срабатывает при выборе пиццы
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setHeaderText("Название: " + name + "\nЦена: " + price + "руб");
                alert.showAndWait();
            }
        });
        item.getChildren().add(btn);

        list.getChildren().add(item);
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

        if (AddPizza.check) {
            pizzaCreate(AddPizza.image, AddPizza.name, AddPizza.price, AddPizza.description);
            AddPizza.image = "";
            AddPizza.check = false;
        }
    }
}