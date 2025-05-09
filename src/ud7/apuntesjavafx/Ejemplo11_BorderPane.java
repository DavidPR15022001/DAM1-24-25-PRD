package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ejemplo11_BorderPane extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        MenuItem menRojo = new Menu("Rojo");
        MenuItem menVerde = new Menu("Verde");
        MenuItem menAzul = new Menu("Azul");

        Menu menColores = new Menu("Colores");
        menColores.getItems().addAll(menRojo, menVerde, menAzul);


        MenuBar menuBar = new MenuBar (menColores);
        Pane panelCentral = new Pane();

        BorderPane borderPane = new BorderPane(null);
        borderPane.setTop(menuBar);
        borderPane.setCenter(panelCentral);
        
        menRojo.setOnAction(e -> borderPane.setStyle("-fx-background-color: red"));
        menVerde.setOnAction(e -> borderPane.setStyle("-fx-background-color: green"));
        menAzul.setOnAction(e -> borderPane.setStyle("-fx-background-color: blue"));

        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane con Menú y Colores de fondo");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
}
