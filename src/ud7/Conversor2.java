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

public class Conversor2 extends Application {
    TextField txtEuros = new TextField("Escribe una cantidad en euros");
    TextField txtDólares = new TextField("Escribe una cantidad en dólares");
    Button btnConvertirEurosADólares = new Button("Convertir Euros a Dolares");
    Button btnConvertirDólaresAEuros = new Button("Convertir Dólares a Euros");
    Label lblResultadoConversión = new Label();
    Label € = new Label("€");
    Label $ = new Label("$");
    
    public static void main(String[] args) {
        launch(args);
    }
        
    @Override
    public void start(Stage primaryStage) throws Exception {
        btnConvertirEurosADólares.setOnAction(e -> convertirEurosADólares());
        btnConvertirDólaresAEuros.setOnAction(e -> convertirDólaresAEuros());

        HBox hboxEuros = new HBox(10, txtEuros, €);
        hboxEuros.setAlignment(Pos.CENTER_LEFT);
        HBox hboxDólares = new HBox(10, txtDólares, $);
        hboxDólares.setAlignment(Pos.CENTER_LEFT);

        hboxEuros.setSpacing(10);
        hboxDólares.setSpacing(10);

        txtEuros.setPrefSize(200, 10);
        txtDólares.setPrefSize(200, 10);
        
        VBox vbox = new VBox(hboxEuros, hboxDólares, btnConvertirEurosADólares, btnConvertirDólaresAEuros, lblResultadoConversión);
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 325, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor de Euros a Dólares");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    private void convertirEurosADólares() {
        double resultado;
        double n1;
        try {
        n1 = Double.parseDouble(txtEuros.getText());
        resultado = n1 * 1.13;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f $", resultado)));
        } catch (Exception ex){
        lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
        }
    private void convertirDólaresAEuros() {
        double resultado;
        double n2;
        try {
        n2 = Double.parseDouble(txtDólares.getText());
        resultado = n2 / 1.13;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f €", resultado)));
        } catch (Exception ex){
        lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
        }
    }

