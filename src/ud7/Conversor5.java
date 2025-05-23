package ud7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Conversor5 extends Application {
    TextField txtEuros = new TextField();
    TextField txtDólares = new TextField();
    Button btnConvertirEurosADólares = new Button("Convertir Euros a Dólares");
    Button btnConvertirDólaresAEuros = new Button("Convertir Dólares a Euros");
    Label lblResultadoConversión = new Label();

    @Override
    public void start(Stage primaryStage) {
        // Usar promptText para mostrar instrucciones
        txtEuros.setPromptText("Escribe una cantidad en euros");
        txtDólares.setPromptText("Escribe una cantidad en dólares");

        // Listeners para formatear el texto con símbolo
        configurarTextFieldConSimbolo(txtEuros, "€");
        configurarTextFieldConSimbolo(txtDólares, "$");

        btnConvertirEurosADólares.setOnAction(e -> convertirEurosADólares());
        btnConvertirDólaresAEuros.setOnAction(e -> convertirDólaresAEuros());

        VBox vbox = new VBox(10,
            txtEuros,
            txtDólares,
            btnConvertirEurosADólares,
            btnConvertirDólaresAEuros,
            lblResultadoConversión
        );
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER_LEFT);
        vbox.setStyle("-fx-padding: 15;");

        Scene scene = new Scene(vbox, 350, 220);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor de Euros a Dólares");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    // Configura el TextField para agregar símbolo al final del número ingresado
    private void configurarTextFieldConSimbolo(TextField textField, String simbolo) {
        textField.textProperty().addListener((obs, oldText, newText) -> {
            if (newText.isEmpty() || newText.equals(simbolo)) return;

            // Eliminar símbolo anterior si existe
            String sinSimbolo = newText.replace(simbolo, "").trim();

            // Validar si es numérico
            if (sinSimbolo.matches("\\d+(\\.\\d+)?")) {
                textField.setText(sinSimbolo + " " + simbolo);
                textField.positionCaret(textField.getText().length() - simbolo.length() - 1); // posicionar antes del símbolo
            } else if (!sinSimbolo.isEmpty()) {
                // Si no es válido, revertir
                textField.setText(oldText);
            }
        });
    }

    private void convertirEurosADólares() {
        try {
            String texto = txtEuros.getText().replace("€", "").trim();
            double euros = Double.parseDouble(texto);
            double resultado = euros * 1.13;
            lblResultadoConversión.setText(String.format("%.2f $", resultado));
        } catch (Exception ex) {
            lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
    }

    private void convertirDólaresAEuros() {
        try {
            String texto = txtDólares.getText().replace("$", "").trim();
            double dolares = Double.parseDouble(texto);
            double resultado = dolares / 1.13;
            lblResultadoConversión.setText(String.format("%.2f €", resultado));
        } catch (Exception ex) {
            lblResultadoConversión.setText("ERROR: Los datos introducidos deben ser números !!!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}