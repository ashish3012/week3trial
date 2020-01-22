/**
 * Ashish Patel
 * 991567335
 * Assignment 1
 * 19/02/2020
 */
package Content;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageThree extends Stage {
    private Rectangle rect3 = new Rectangle(60, 90, 80, 300);
    private Circle cir2 = new Circle(190, 160, 80);
    private Text txt1 = new Text(160, 15, "Ashish Patel");
    private Font font = new Font("Arial", 20);
    private Pane pn1 = new Pane(rect3, cir2, txt1);
    private Scene sc2 = new Scene(pn1, 600, 400);
    private Text txt = new Text();

    private void setShapes2() {
        rect3.setFill(Color.DARKCYAN);
        rect3.setStroke(Color.CORAL);
        cir2.setFill(Color.DARKCYAN);
        txt1.setFill(Color.MAROON);
        txt1.setFont(font);
    }
    public StageThree() {
        setY(100);
        setX(1020);
        setHeight(500);
        setWidth(500);
        setScene(sc2);
        setShapes2();
        setTitle("Second Initial - Ashish Patel");
    }}

