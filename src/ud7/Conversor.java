package ud7;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {
    TextField txtEuros = new TextField("Escribe una cantidad en euros");
    TextField txtDólares = new TextField("Escribe una cantidad en dólares");
    Button btnConvertirEurosADólares = new Button("Convertir Euros a Dolares");
    Button btnConvertirDólaresAEuros = new Button("Convertir Dólares a Euros");
    Label lblResultadoConversión = new Label();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        btnConvertirEurosADólares.setOnAction(e -> convertirEurosADólares());
        btnConvertirDólaresAEuros.setOnAction(e -> convertirDólaresAEuros());
        
        VBox vbox = new VBox(txtEuros, txtDólares, btnConvertirEurosADólares, btnConvertirDólaresAEuros, lblResultadoConversión);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Conversor de Euros a Dólares");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    private void convertirEurosADólares() {
        double resultado;
        double n1;
        n1 = Double.parseDouble(txtEuros.getText());
        resultado = n1 * 1.13;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f", resultado)));
        }
    private void convertirDólaresAEuros() {
        double resultado;
        double n2;
        n2 = Double.parseDouble(txtDólares.getText());
        resultado = n2 / 1.13;
        lblResultadoConversión.setText(String.valueOf(String.format("%.2f", resultado)));
        }
    }   

