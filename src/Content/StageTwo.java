/**
 * Ashish Patel
 * 991567335
 * Assignment 1
 * 19/02/2020
 */
package Content;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StageTwo extends Stage {

    private Rectangle rect1 = new Rectangle(60, 140, 70, 250);
    private Rectangle rect2 = new Rectangle(220, 140, 70, 250);
    private Ellipse elp = new Ellipse(175, 240, 60, 20);
    private Arc arc = new Arc();
    private Arc arc1 = new Arc();
    private Text txt = new Text(160, 15, "Ashish Patel");
    private Font font = new Font("Arial", 20);
    private Pane pn1 = new Pane(rect1, rect2, elp, txt, arc, arc1);
    private Scene sc1 = new Scene(pn1, 500, 500);

    private void setShapes() {
        rect1.setFill(Color.DARKBLUE);
        rect1.setStroke(Color.AQUA);
        rect2.setFill(Color.DARKBLUE);
        rect2.setStroke(Color.AQUA);
        elp.setFill(Color.DARKBLUE);
        txt.setFill(Color.GREEN);
        txt.setFont(font);
    }

    private void setArc1() {
        arc.setCenterX(180);
        arc.setCenterY(140);
        arc.setRadiusX(119);
        arc.setRadiusY(100);
        arc.setStartAngle(80);
        arc.setLength(100);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.DARKBLUE);
    }

    private void setArc2() {
        arc1.setCenterX(171);
        arc1.setCenterY(140);
        arc1.setRadiusX(120);
        arc1.setRadiusY(100);
        arc1.setStartAngle(360);
        arc1.setLength(100);
        arc1.setType(ArcType.ROUND);
        arc1.setFill(Color.DARKBLUE);
    }

    public StageTwo() {
        setY(100);
        setX(510);
        setHeight(500);
        setWidth(500);
        setShapes();
        setArc1();
        setArc2();
        setScene(sc1);
        setTitle("First Initial - Ashish Patel");
    }

}
