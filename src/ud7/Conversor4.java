package ud7;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor4 extends Application {
    TextField txtLibras = new TextField("Escribe una cantidad en libras");
    TextField txtKilos = new TextField("Escribe una cantidad en kilos");
    Button btnConvertirLibrasAKilos = new Button("Convertir Libras a Kilos");
    Button btnConvertirKilosALibras = new Button("Convertir Kilos a Libras");
    Label lblResultadoConversión = new Label();
    Label £ = new Label("£");
    Label Kg = new Label("Kg");
    
    public static void main(String[] args) {
        launch(args);
    }
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        btnConvertirLibrasAKilos.setOnAction(e -> convertirLibrasAKilos());
        btnConvertirKilosALibras.setOnAction(e -> convertirKilosALibras());

        HBox hboxLibras = new HBox(10, txtLibras, £);
        hboxLibras.setAlignment(Pos.CENTER_LEFT);
        HBox hboxKilos = new HBox(10, txtKilos, Kg);
        hboxKilos.setAlignment(Pos.CENTER_LEFT);

        hboxLibras.setSpacing(10);
        hboxKilos.setSpacing(10);

        txtLibras.setPrefSize(200, 10);
        txtKilos.setPrefSize(200, 10);
        
        VBox vbox = new VBox(hboxLibras, hboxKilos, btnConvertirLibrasAKilos, btnConvertirKilosALibras, lblResultadoConversión);
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 325, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor de Libras a Kilos");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    private void convertirLibrasAKilos() {
        double resultado;
        double n1;
        try {
        n1 = Double.parseDouble(txtLibras.getText());
        resultado = n1 * 0.4535924;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f $", resultado)));
        } catch (Exception ex){
        lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
        }
    private void convertirKilosALibras() {
        double resultado;
        double n2;
        try {
        n2 = Double.parseDouble(txtKilos.getText());
        resultado = n2 / 0.4535924;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f €", resultado)));
        } catch (Exception ex){
        lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
        }
    }

