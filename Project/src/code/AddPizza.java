package code;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddPizza{

    @FXML
    Button btnAddPhoto;

    @FXML
    Button btnAddPizza;

    // Событие добавления фото
    public void addPhoto(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("В процессе разработки)))");
        alert.showAndWait();
    }

    // Событие добавления пиццы
    public void addPizza(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnAddPhoto.getScene().getWindow();
        stage.close();
    }
}
