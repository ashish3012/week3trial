/**
 * Ashish Patel
 * 991567335
 * Assignment 1
 * 19/02/2020
 */
package myinitials;

import Content.StageThree;
import Content.StageTwo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        ImageView img1 = new ImageView("Images/starc.jpg");
        img1.setFitWidth(450);
        img1.setFitHeight(450);
        Text txt = new Text(160, 15, "Ashish Patel");
        txt.setFill(Color.IVORY);
        Font font = new Font("Arial", 20);
        txt.setFont(font);
        Pane pane = new Pane(img1, txt);
        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setScene(scene);
        primaryStage.setY(100);
        primaryStage.setX(50);
        primaryStage.show();
        primaryStage.setTitle("Primary Stage - Ashish Patel");

        StageTwo stage2 = new StageTwo();
        stage2.show();

        StageThree stage3 = new StageThree();
        stage3.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
