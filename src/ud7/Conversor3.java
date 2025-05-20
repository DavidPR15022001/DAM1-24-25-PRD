package ud7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.function.UnaryOperator;

public class Conversor3 extends Application {
    TextField txtEuros = new TextField();
    TextField txtDólares = new TextField();
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
        // Configurar TextFormatter para euros
        UnaryOperator<TextFormatter.Change> euroFormatter = change -> {
            String text = change.getControlNewText();
            // Asegurarse de que no se repita el símbolo
            if (text.isEmpty() || !text.endsWith("€")) {
                change.setText(text + " €"); // Añadir el símbolo €
            }
            return change;
        };
        TextFormatter<String> euroTextFormatter = new TextFormatter<>(euroFormatter);
        txtEuros.setTextFormatter(euroTextFormatter);

        // Configurar TextFormatter para dólares
        UnaryOperator<TextFormatter.Change> dollarFormatter = change -> {
            String text = change.getControlNewText();
            // Asegurarse de que no se repita el símbolo
            if (text.isEmpty() || !text.endsWith("$")) {
                change.setText(text + " $"); // Añadir el símbolo $
            }
            return change;
        };
        TextFormatter<String> dollarTextFormatter = new TextFormatter<>(dollarFormatter);
        txtDólares.setTextFormatter(dollarTextFormatter);

        // Configurar eventos para los botones
        btnConvertirEurosADólares.setOnAction(e -> convertirEurosADólares());
        btnConvertirDólaresAEuros.setOnAction(e -> convertirDólaresAEuros());

        // Configurar el layout de los campos
        HBox hboxEuros = new HBox(10, txtEuros);
        hboxEuros.setAlignment(Pos.CENTER_LEFT);

        HBox hboxDólares = new HBox(10, txtDólares);
        hboxDólares.setAlignment(Pos.CENTER_LEFT);

        // Ajustar el tamaño de los campos
        txtEuros.setPrefSize(200, 30);
        txtDólares.setPrefSize(200, 30);

        // Configurar el layout principal
        VBox vbox = new VBox(10, hboxEuros, hboxDólares, btnConvertirEurosADólares, btnConvertirDólaresAEuros, lblResultadoConversión);
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
            // Eliminar el símbolo "€" para la conversión
            String textoEuros = txtEuros.getText().replace("€", "").trim();
            n1 = Double.parseDouble(textoEuros);
            resultado = n1 * 1.13;
            lblResultadoConversión.setText(String.format("%.2f $", resultado));
        } catch (Exception ex) {
            lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
    }

    private void convertirDólaresAEuros() {
        double resultado;
        double n2;
        try {
            // Eliminar el símbolo "$" para la conversión
            String textoDolares = txtDólares.getText().replace("$", "").trim();
            n2 = Double.parseDouble(textoDolares);
            resultado = n2 / 1.13;
            lblResultadoConversión.setText(String.format("%.2f €", resultado));
        } catch (Exception ex) {
            lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
    }
}