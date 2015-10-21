package gamememory.view;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import gamememory.MainApp;

import java.io.IOException;

/**
 * Created by makarov_vv on 20.10.2015.
 */
public class MainMenuController {

    @FXML
    private Button newPlayer;
    @FXML
    private Button login;
    @FXML
    private Button exit;
    @FXML
    private Button back;

    @FXML
    public void newPlayerButtonCliked() throws IOException {
//        mainApp.showNewPLayer();
    }


    @FXML
    public void exitButtonCliked() {

        System.exit(0);
    }

    @FXML
    public void backButon() throws IOException {
      MainApp.showMenu();
    }

    @FXML
    public void loginBar() throws IOException {
       MainApp.showLoginWindow();
    }

    @FXML
    public void action() throws IOException {
//        MainApp.showAction();
    }

}
