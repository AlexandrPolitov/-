package code;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AddPizza extends mainPage {

    @FXML
    Button btnAddPhoto;
    @FXML
    Button btnAddPizza;
    @FXML
    TextField ProductName;
    @FXML
    TextField ProductPrice;
    @FXML
    TextArea ProductDescription;
    @FXML
    ImageView logo;

    public static String image = "";
    public static String name = "";
    public static String price = "";
    public static String description = "";

    // проверка, нажал ли пользователь
    public static boolean check = false;

    // Событие добавления фото
    public void addPhoto(MouseEvent mouseEvent) {
        Button b = (Button) mouseEvent.getSource();
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Images (*.jpg, *.png)", "*.jpg", "*.png"));
        fc.setTitle("Выбор изображения пиццы");
        File file = fc.showOpenDialog(b.getScene().getWindow());
        try {
            Image candidate = SwingFXUtils.toFXImage(ImageIO.read(file), null);
            if (candidate.getHeight() > 300 || candidate.getWidth() > 300) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Ошибка");
                alert.setContentText("Требуемый размер изображения: не более 300 x 300 пикселей");
                alert.show();
                return;
            }
            logo.setImage(candidate);
            image = "file:/" + file.getPath();
        }
        catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setContentText("Невозможно открыть изображение");
            alert.show();
        }
    }

    // Событие добавления пиццы
    public void addPizza(MouseEvent mouseEvent) throws Exception {
        if (ProductName.getText().equals("")) name = "Без названия";
        else name = ProductName.getText();
        if (ProductPrice.getText().equals("")) price = "0";
        else price = ProductPrice.getText();
        if (ProductDescription.getText().equals("")) description = "";
        else description = ProductDescription.getText();
        check = true;
        Stage stage = (Stage) btnAddPhoto.getScene().getWindow();
        stage.close();
    }
}
