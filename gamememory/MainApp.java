package gamememory;

import gamememory.modul.Picture;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

/**
 * Created by makarov_vv on 20.10.2015.
 */
public class MainApp extends Application {

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    private static Stage primaryStage;
    static BorderPane paneroot;

    public static Stage getStage() {
        return stage;
    }

    static Stage stage ;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;
        primaryStage.setTitle("Game");
        showMainMenu();

    }
    public void showMainMenu() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/MainMenu.fxml"));
            paneroot =  loader.load();
            Scene scene = new Scene(paneroot);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void showNewPLayer() throws IOException {
//
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(MainApp.class.getResource("view/MainMenu1.fxml"));
//        BorderPane paneless = loader.load();
//        paneroot.setCenter(paneless);
//    }
    public static  void showMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/MainMenu.fxml"));
        paneroot =  loader.load();
        Scene scene = new Scene(paneroot);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
//    public static void showAction() throws IOException {
//
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(MainApp.class.getResource("view/Action.fxml"));
//        BorderPane pane = new BorderPane();
//        Picture prt = new Picture();
//        pane = loader.load();
//        Scene scene = new Scene(pane);
//        pane.getChildren().addAll(prt.getRectangle());
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
    public  static void showLoginWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/LoginMenu.fxml"));
        AnchorPane pane = new AnchorPane();
        pane = loader.load();
        Scene scene = new Scene(pane);
        stage = new Stage();
        stage.setTitle("Login Window");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(primaryStage);
        stage.setScene(scene);
        stage.showAndWait();
    }
    public static void showSubmitWindow() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("view/ChooseGameMenu.fxml"));
        BorderPane pane = loader.load();
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Game Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
