package code;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Basket {
    @FXML
    Label price;
    @FXML
    Button btnOrder;
    @FXML
    TextField name;
    @FXML
    TextField secondName;
    @FXML
    TextField phone;
    @FXML
    TextField address;
    @FXML
    TextField cardNumber;
    @FXML
    TextField cardData;
    @FXML
    TextField cardHolder;
    @FXML
    TextField cardCVV;
    @FXML
    RadioButton muxDelivery;
    @FXML
    TextField promo;


    void setPrice(int p) {
        price.setText(String.valueOf(p) + " руб");
    }

    public void buttonOrderClick(MouseEvent mouseEvent) {

        // Все поля с данными из корзины
        String name = this.name.getText();
        String secondName = this.secondName.getText();
        String phone = this.phone.getText();
        String address = this.address.getText();
        String cardNumber = this.cardNumber.getText();
        String cardData = this.cardData.getText();
        String cardHolder = this.cardHolder.getText();
        String cardCVV = this.cardCVV.getText();
        String promo = this.promo.getText();
        // тип доставки
        boolean delivery = muxDelivery.isSelected();
        // ...........................

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Заказ обработан, ожидайте доставки");
        alert.showAndWait();
        Stage stage = (Stage) btnOrder.getScene().getWindow();
        stage.close();
    }
}
