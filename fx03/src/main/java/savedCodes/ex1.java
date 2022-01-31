//package savedCodes;
//
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Polygon;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class ex1 extends javafx.application.Application {
//    @Override
//    public void start(Stage primaryStage) throws IOException {
//
//
//        Group root = new Group();
//        Scene scene = new Scene(root, 800, 600, Color.WHEAT);
//
//        Image icon = new Image("start/image/icon.png");
//
//
//        primaryStage.getIcons().add(icon);
//        primaryStage.setResizable(false);
//
//
//        Text text = new Text("AcaFola");
//        text.setX(100);
//        text.setY(100);
//        text.setFill(Color.BLACK);
//        text.setFont(Font.font("verdana", 50));
//
//
//        Line line = new Line();
//        line.setStartX(100);
//        line.setStartY(100);
//        line.setEndX(500);
//        line.setEndY(100);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.RED);
//        line.setOpacity(0.5);
//        line.setRotate(45);
//
//
//        // rectangle == 직사각형
//        Rectangle rectangle = new Rectangle();
//        rectangle.setX(300);
//        rectangle.setY(200);
//        rectangle.setWidth(300);
//        rectangle.setHeight(100);
//        rectangle.setFill(Color.AZURE);
//        rectangle.setStroke(Color.BROWN);
//
//
//        //polygon
//        Polygon triangle = new Polygon();
//        triangle.getPoints().setAll(
//                200.0, 200.0,
//                300.0, 300.0,
//                200.0, 300.0
//        );
//
//
//        //Circle
//
//        Circle circle = new Circle();
//        circle.setCenterX(400);
//        circle.setCenterY(400);
//        circle.setRadius(70);
//        circle.setFill(Color.ORANGE);
//
//
//        // Image
//        Image image = new Image("start/image/icon.png");
//        ImageView imageView = new ImageView(image);
//        imageView.setX(300);
//        imageView.setY(100);
//        imageView.setScaleX(0.5);
//        imageView.setScaleY(0.5);
//
//
//
//
//        // 순서대로 랜더링
//        root.getChildren().add(triangle);
//        root.getChildren().add(text);
//        root.getChildren().add(rectangle);
//        root.getChildren().add(line);
//        root.getChildren().add(circle);
//        root.getChildren().add(imageView);
//
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Hello javaFx");
//        primaryStage.show();
//
//
//        // ex1
////        primaryStage.setWidth(800);
////        primaryStage.setHeight(600);
////        primaryStage.setResizable(false);
////        primaryStage.setX(50);
////        primaryStage.setY(50);
////        primaryStage.setFullScreen(true);
////        primaryStage.setFullScreenExitHint("You can't Escape unless you press q");
////        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
//
//
//        // default setting
////        FXMLLoader root = new FXMLLoader(Application.class.getResource("view.fxml"));
////        Scene scene1 = new Scene(root.load());
////
////        String css = this.getClass().getResource("main.css").toExternalForm();
////        scene1.getStylesheets().add(css);
////
////
////        stage.setTitle("FX TITLE");
////        stage.setScene(scene1);
////        stage.show();
//    }
//
//    public static void main(String[] args) {
//        ex1.launch();
//    }
//}