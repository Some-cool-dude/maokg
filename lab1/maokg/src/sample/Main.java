package sample;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        scene.setFill(Color.rgb(0, 128, 255));

        Polygon triangle1 = createTriangle(new Point2D(250, 40), 200, 60);
        root.getChildren().add(triangle1);
        triangle1.setFill(Color.rgb(0, 128, 0));

        Polygon triangle2 = createTriangle(new Point2D(250, 120), 200, 60.1);
        root.getChildren().add(triangle2);
        triangle2.setFill(Color.rgb(0, 128, 0));

        Polygon triangle3 = createTriangle(new Point2D(250, 200), 200, 60.15);
        root.getChildren().add(triangle3);
        triangle3.setFill(Color.rgb(0, 128, 0));

        Rectangle rectangle = new Rectangle(220, 400, 60, 100);
        root.getChildren().add(rectangle);
        rectangle.setFill(Color.rgb(128, 64, 0));

        Rectangle r1 = new Rectangle(200, 200, 20, 20);
        root.getChildren().add(r1);
        r1.setFill(Color.rgb(255, 255, 0));

        Rectangle r2 = new Rectangle(300, 280, 20, 20);
        root.getChildren().add(r2);
        r2.setFill(Color.rgb(255, 255, 0));

        Rectangle r3 = new Rectangle(175, 300, 20, 20);
        root.getChildren().add(r3);
        r3.setFill(Color.rgb(255, 255, 0));

        Rectangle r4 = new Rectangle(250, 340, 20, 20);
        root.getChildren().add(r4);
        r4.setFill(Color.rgb(255, 255, 0));

        Rectangle r5 = new Rectangle(250, 240, 20, 20);
        root.getChildren().add(r5);
        r5.setFill(Color.rgb(255, 255, 0));

        Rectangle r6 = new Rectangle(325, 380, 20, 20);
        root.getChildren().add(r6);
        r6.setFill(Color.rgb(255, 255, 0));

        Rectangle r7 = new Rectangle(250, 140, 20, 20);
        root.getChildren().add(r7);
        r7.setFill(Color.rgb(255, 255, 0));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    Polygon createTriangle(Point2D origin, double length, double angle){
        Polygon fovTriangle = new Polygon(
                0d, 0d,
                -(length * Math.tan(angle)), length,
                (length * Math.tan(angle)), length
        );

        fovTriangle.setLayoutX(origin.getX());
        fovTriangle.setLayoutY(origin.getY());
        return fovTriangle;
    }
}
