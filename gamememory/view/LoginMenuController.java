package gamememory.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import gamememory.MainApp;
import javafx.stage.Stage;
import ru.kokorin.jfxseabattle.Main;

import java.io.IOException;

/**
 * Created by makarov_vv on 21.10.2015.
 */
public class LoginMenuController {
    @FXML
    private TextField textNme ;
    @FXML
    private TextField textPass;
    @FXML
    private Button submit;
    @FXML
    private Button back;
    @FXML
    public void backButon() throws IOException {
        MainApp.getStage().close();
    }
    public void submitButton() throws IOException {
        if (textNme.getText().equals("root") && textPass.getText().equals("root")) {
            MainApp.getStage().close();
            MainApp.showSubmitWindow();

        } else

        {
            textNme.clear();
            textPass.clear();
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.initOwner(MainApp.getStage());
            alert.setTitle("WRONG");
            alert.setHeaderText("WRONG user Name and pasword");
            alert.setContentText("Please enter again or click back");
            alert.showAndWait();
        }

    }
}
