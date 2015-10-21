package gamememory.modul;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.scene.layout.StackPane;



/**
 * Created by makarov_vv on 21.10.2015.
 */
public class Picture extends StackPane {
    private   Rectangle rectangle;
    public Picture() {
        this.rectangle = new Rectangle(100,100, Color.RED);
        System.out.println("s");
    }
    public Rectangle getRectangle() {
        return rectangle;
    }



}